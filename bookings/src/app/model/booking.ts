export class Booking{
    // getAllBookings(): import("rxjs").Observable<Booking[]> {
    //   throw new Error('Method not implemented.');
    // }
    // deleteviewbooking(bookingid: number) {
    //   throw new Error('Method not implemented.');
    // }
    // getBooking(bookingId: number): import("rxjs").Observable<Booking> {
    //   throw new Error('Method not implemented.');
    // }
    
    bookingId:number;
    userId:number;
    bookingDate:string;
    ticketCost:number;
    bookingState:string;
  getAllBookings: any;

    constructor( bookingId:number,userId:number,bookingDate:string,ticketCost:number, bookingState:string){
        this.bookingId=bookingId;
        this.userId=userId;
        this.bookingDate=bookingDate;
        this.ticketCost=ticketCost;
        this.bookingState=bookingState;

    }
        
  
    getUserId():number{
      return this.userId;
    }
  
    getBookingDate():string{
      return this.bookingDate;
    }
    getTicketCost():number{
      return this.ticketCost;
    }
  
    getBookingState():string{
      return this.bookingState;
    }

  }
  