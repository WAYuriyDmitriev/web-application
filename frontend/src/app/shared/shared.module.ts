import { NgModule } from '@angular/core';
import { HeaderComponent } from './components/header/header.component';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { TableComponent } from './components/table/table.component';
import { DeleteModalComponent } from './components/delete-modal/delete-modal.component';
import { NgbDatepickerModule } from '@ng-bootstrap/ng-bootstrap';
import { InformationModalComponent } from './components/information-modal/information-modal.component';
import { MultiselectComponent } from './components/multiselect/multiselect.component';
import { FormsModule } from '@angular/forms';

const components = [
  HeaderComponent,
  TableComponent,
  DeleteModalComponent
];

@NgModule( {
  declarations: [
    ...components,
    InformationModalComponent,
    MultiselectComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    NgbDatepickerModule,
    FormsModule
  ], exports: [
    ...components,
    MultiselectComponent
  ]
} )
export class SharedModule {
}
