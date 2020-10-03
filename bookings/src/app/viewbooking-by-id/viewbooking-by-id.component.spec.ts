import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewbookingByIdComponent } from './viewbooking-by-id.component';

describe('ViewbookingByIdComponent', () => {
  let component: ViewbookingByIdComponent;
  let fixture: ComponentFixture<ViewbookingByIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewbookingByIdComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewbookingByIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
