import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditMedidorComponent } from './Medidor.edit.component';

describe('EditMedidorComponent', () => {
  let component: EditMedidorComponent;
  let fixture: ComponentFixture<EditMedidorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditMedidorComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditMedidorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
