import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClienteComponent } from './Cliente.component';

describe('ListClienteComponent', () => {
  let component:  ClienteComponent;
  let fixture: ComponentFixture<ClienteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ClienteComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ClienteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
