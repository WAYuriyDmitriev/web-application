import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Department } from '../../shared/model/department.model';

@Injectable( {
  providedIn: 'root'
} )
export class DepartmentApiService {

  constructor(private httpClient: HttpClient) {
  }

  public getDepartment(): Observable<Array<Department>> {
    return this.httpClient.get<Array<Department>>(
      '/api/department'
    );
  }

  public deleteDepartment(id: number): Observable<void> {
    return this.httpClient.delete<void>(
      `/api/department/${ id }`
    );
  }
}
