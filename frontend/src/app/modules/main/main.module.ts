import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { EmployeeComponent } from './pages/employee/employee.component';
import { DepartmentComponent } from './pages/department/department.component';
import { PositionsComponent } from './pages/postions/positions.component';
import { EquipmentsComponent } from './pages/equipments/equipments.component';
import { SharedModule } from '../../shared/shared.module';
import { FormsModule } from '@angular/forms';

@NgModule( {
  declarations: [
    EmployeeComponent,
    DepartmentComponent,
    PositionsComponent,
    EquipmentsComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    SharedModule,
    FormsModule
  ]
} )
export class MainModule {
}
