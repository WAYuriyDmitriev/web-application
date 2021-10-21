import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Position } from '../../shared/model/position.model';
import { map } from 'rxjs/operators';

@Injectable( {
  providedIn: 'root'
} )
export class PositionApiService {

  constructor(private httpClient: HttpClient) {
  }

  public getPositions(): Observable<Array<Position>> {
    return this.httpClient.get<Array<Position>>(
      '/api/position'
    ).pipe( map( value => {
      value.forEach( el => {
        el.departmentName = el.department.name;
        el.departmentDirection = el.department.direction;
      } );

      return value;
    } ) );
  }

  public postPosition(position: Position): Observable<void> {
    return this.httpClient.post<void>(
      `/api/position`,
      position
    );
  }

  public putPosition(position: Position): Observable<void> {
    return this.httpClient.put<void>(
      `/api/position`
      , position );
  }

  public deletePosition(id: number): Observable<void> {
    return this.httpClient.delete<void>(
      `/api/position/${ id }`
    );
  }
}
