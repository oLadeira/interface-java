package model.entities;

import java.util.Date;

public class CarRental {
    
    private Vehicle vehicle;
    
    private Date start;
    private Date finish;
    
    private Invoice invoice;

    public CarRental() {
    }

    public CarRental(Vehicle vehicle, Date start, Date finish) {
        this.vehicle = vehicle;
        this.start = start;
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    
    
    
    
}
