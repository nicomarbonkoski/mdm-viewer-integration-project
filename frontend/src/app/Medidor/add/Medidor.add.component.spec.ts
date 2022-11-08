import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddMedidorComponent } from './Medidor.add.component';

describe('AddMedidorComponent', () => {
  let component: AddMedidorComponent;
  let fixture: ComponentFixture<AddMedidorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddMedidorComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddMedidorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
