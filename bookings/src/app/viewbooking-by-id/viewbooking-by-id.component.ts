import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { Observable } from 'rxjs';
import { BookingService } from '../bookingservice';
import { Booking } from '../model/booking';

@Component({
  selector: 'app-viewbookingid',
  templateUrl: './viewbookingById.component.html',
  styleUrls: ['./viewbookingById.component.css']
})
export class ViewbookingByIdComponent {
  bookings:Booking[];
  //viewbookingById: any;
  constructor(private router: ActivatedRoute ,private bookingService:BookingService) {
    let observable = router.paramMap;
    observable.subscribe((params:ParamMap)=>{
      let bookingidVal:string =params.get("id");
    let bookingid:number=Number(bookingidVal);//converting string to number
    console.log("id available is "+bookingid);
    this.viewbookingById(bookingid);
   })
   }

   booking:Booking[];


   viewbookingById(id:number){
    let observable:Observable<Booking[]>=this.bookingService.getBooking(id);
    observable.subscribe(
      userArg=>{
        this.booking=userArg;
      },

      err=>{
        console.log("inside booking details, err is "+err.message);
      }

    );
   }

   viewBookingId(form:any){
    let data=form.value;
    let id=data.bookingid;
   this.viewbookingById(id);
  }
  
}
