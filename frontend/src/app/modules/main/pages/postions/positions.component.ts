import { Component, OnInit, TemplateRef, ViewChild } from '@angular/core';
import { TableColumnItemModel } from '../../../../shared/model/table-column-item.model';
import { PositionApiService } from '../../../../services/api/position-api.service';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { filter } from 'rxjs/operators';
import { DeleteModalComponent } from '../../../../shared/components/delete-modal/delete-modal.component';
import { Position } from '../../../../shared/model/position.model';
import { openInformationModal } from '../../../../shared/utils/modals.utils';
import { DepartmentApiService } from '../../../../services/api/department-api.service';
import { Department } from '../../../../shared/model/department.model';

@Component( {
  selector: 'app-positions',
  templateUrl: './positions.component.html',
  styleUrls: [ './positions.component.scss' ]
} )
export class PositionsComponent implements OnInit {
  @ViewChild( 'editModal', { static: false, read: TemplateRef } ) public contentDeleteModal: any;

  public readonly columns: Array<TableColumnItemModel> = [
    {
      label: 'Должность',
      fieldName: 'name'
    },
    {
      label: 'Оклад',
      fieldName: 'baseSalary'
    },
    {
      label: 'Надбавки',
      fieldName: 'allowance'
    },
    {
      label: 'Премия',
      fieldName: 'reward'
    },
    {
      label: 'Наименовая отдела',
      fieldName: 'departmentName'
    },
    {
      label: 'Направление отдела',
      fieldName: 'departmentDirection'
    }
  ];

  public tableData: Array<Position> = [];
  public departmentData: Array<Department> = [];
  public editOrAddPosition!: Position;

  constructor(private positionApi: PositionApiService,
              private departmentApi: DepartmentApiService,
              private modalService: NgbModal) {
    this.loadData();
    this.departmentApi.getDepartment().subscribe( (value => this.departmentData = value) );
  }

  private loadData() {
    this.positionApi.getPositions().subscribe( data => this.tableData = [...data] );
  }

  ngOnInit(): void {

  }

  deleteClick(position: Position) {
    const ngbModalRef = this.modalService.open( DeleteModalComponent );
    ngbModalRef.componentInstance.nameItem = `должность "${ position.name }"`;
    ngbModalRef
      .closed
      .pipe( filter( result => result ) )
      .subscribe( () => {
        this.positionApi.deletePosition( position.id ).subscribe( () => {
          openInformationModal( this.modalService, `Должность "${ position.name } успешно удалена."` );
          this.loadData();
        }, () => openInformationModal( this.modalService, 'Не удалось удалить объект, так как есть работники с данной должностью' ) );
      } );

  }

  addPosition() {
    this.editOrAddPosition = {
      name: '',
      baseSalary: 0,
      reward: 0,
      allowance: 0,
      department: this.departmentData[0]
    } as Position;
    this.modalService.open( this.contentDeleteModal )
      .closed
      .pipe( filter( el => el ) )
      .subscribe( () => {
        this.positionApi.postPosition( this.editOrAddPosition )
          .subscribe( () => this.loadData() );
      } );
  }

  editClick($event: Position) {
    this.editOrAddPosition = Object.assign( {}, $event );
    this.modalService.open( this.contentDeleteModal )
      .closed
      .pipe( filter( el => el ) )
      .subscribe( () => {
        this.positionApi.putPosition( this.editOrAddPosition )
          .subscribe( () => this.loadData() );
      } );
  }
}
