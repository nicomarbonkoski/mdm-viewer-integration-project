import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MedidorComponent } from './Medidor.component';

describe('MedidorComponent', () => {
  let component:  MedidorComponent;
  let fixture: ComponentFixture<MedidorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MedidorComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MedidorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
