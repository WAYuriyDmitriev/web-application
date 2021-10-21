import { Component, OnInit } from '@angular/core';
import { MainRoute } from '../../enum/mainRoute.enum';
import { NavigationEnd, Router } from '@angular/router';

interface NavBarItem {
  label: string;
  path: string;
  description: string;
}

@Component( {
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: [ './header.component.scss' ]
} )
export class HeaderComponent implements OnInit {

  public readonly navBarItems: ReadonlyArray<NavBarItem> = [
    {
      label: 'Сотрудники',
      path: MainRoute.Employee,
      description: 'Устроенные сотрудники'
    },
    {
      label: 'Отделы',
      path: MainRoute.Department,
      description: 'Отделы сотрудников'
    },
    {
      label: 'Должости',
      path: MainRoute.Position,
      description: 'Возможные должности'
    },
    {
      label: 'Оборудование',
      path: MainRoute.ListEquipment,
      description: 'Купленное оборудование'
    }
  ];

  public selectedItem: NavBarItem = this.navBarItems[0];

  constructor(private router: Router) {
    router.events.subscribe( (event) => {
      if ( event instanceof NavigationEnd ) {
        this.selectedItem = this.navBarItems.find( el => el.path === event.url.slice( 1 ) ) || this.navBarItems[0];
      }
    } );
  }

  ngOnInit(): void {
  }

  clickNavItem(el: NavBarItem) {
    this.selectedItem = el;
  }
}
