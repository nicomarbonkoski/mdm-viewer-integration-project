import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListMedidorComponent } from './Medidor.list.component';

describe('ListMedidorComponent', () => {
  let component: ListMedidorComponent;
  let fixture: ComponentFixture<ListMedidorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListMedidorComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListMedidorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });
 
  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
