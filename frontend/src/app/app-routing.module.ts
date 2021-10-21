import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MainRoute } from './shared/enum/mainRoute.enum';
import { DepartmentComponent } from './modules/main/pages/department/department.component';
import { EmployeeComponent } from './modules/main/pages/employee/employee.component';
import { EquipmentsComponent } from './modules/main/pages/equipments/equipments.component';
import { PositionsComponent } from './modules/main/pages/postions/positions.component';

const routes: Routes = [
  {
    path: '',
    children: [
      {
        path: MainRoute.Department,
        component: DepartmentComponent
      },
      {
        path: MainRoute.Employee,
        component: EmployeeComponent
      },
      {
        path: MainRoute.EquipmentState,
        component: EquipmentsComponent
      },
      {
        path: MainRoute.Position,
        component: PositionsComponent
      },
      {
        path: '**',
        redirectTo: MainRoute.Employee
      }
    ]
  }
];

@NgModule( {
  imports: [ RouterModule.forRoot( routes ) ],
  exports: [ RouterModule ]
} )
export class AppRoutingModule {
}
