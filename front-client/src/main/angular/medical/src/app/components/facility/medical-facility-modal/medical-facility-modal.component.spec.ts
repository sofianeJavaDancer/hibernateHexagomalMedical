import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MedicalFacilityModalComponent } from './medical-facility-modal.component';

describe('MedicalFacilityModalComponent', () => {
  let component: MedicalFacilityModalComponent;
  let fixture: ComponentFixture<MedicalFacilityModalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MedicalFacilityModalComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MedicalFacilityModalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
