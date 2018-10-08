import { async, ComponentFixture, TestBed } from '@angular/core/testing';

describe('RegistroComponent', () => {
     let component: RegistroComponent;
     let fixture: ComponentFixture<RegistroComponent>;

     beforeEach(async(() => { 
          TestBed.configureTestingModule({ 
          declarations: [ RegistroComponent ]
         }) 
         .compileComponents(); 
     })); 

     it('should create', () => { 
          expect(component).toBeTruthy(); 
     }); 
}); 
