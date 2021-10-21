import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { MultiselectItem } from '../../model/multiselect-item.model';

@Component( {
  selector: 'app-multiselect',
  templateUrl: './multiselect.component.html',
  styleUrls: [ './multiselect.component.scss' ]
} )
export class MultiselectComponent implements OnInit {

  @Input() public data: Array<MultiselectItem> = [];
  @Input() public label: string = '';
  @Input() public selectItem?: any = undefined;

  @Output() public selectItemChange = new EventEmitter<any>();

  constructor() {
  }

  ngOnInit(): void {
  }

  changeSelect(id: string) {
    const numberValue = Number( id );
    this.selectItemChange.emit( this.data.find( el => el.id === numberValue ) );
  }
}
