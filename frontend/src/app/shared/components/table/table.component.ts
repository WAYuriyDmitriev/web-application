import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { TableColumnItemModel } from '../../model/table-column-item.model';

@Component( {
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: [ './table.component.scss' ]
} )
export class TableComponent implements OnInit {

  @Input() public tableColumns: Array<TableColumnItemModel> = [];
  @Input() public dataItem: Array<any> = [];

  @Output() public editClick = new EventEmitter<any>();
  @Output() public deleteClick = new EventEmitter<any>();

  constructor() {
  }

  ngOnInit(): void {
  }

}
