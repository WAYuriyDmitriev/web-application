import { Component, Input, OnInit } from '@angular/core';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';

@Component( {
  selector: 'app-information-modal',
  templateUrl: './information-modal.component.html',
  styleUrls: [ './information-modal.component.scss' ]
} )
export class InformationModalComponent implements OnInit {

  @Input() public information: string = '';

  constructor(public activeModal: NgbActiveModal) {
  }

  ngOnInit(): void {
  }

  close() {
    this.activeModal.close();
  }
}
