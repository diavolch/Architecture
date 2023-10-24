
public class Ticket {
    private int rootNumber;
    private double priceTicket;
    private int place;
    private String dateTime;
    private bool isValid;

    public int getRootNumber() {
        return rootNumber;
    }

    public void setRootNumber(int rootNumber) {
        this.rootNumber = rootNumber;
    }

    public double getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(double priceTicket) {
        this.priceTicket = priceTicket;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public dateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(dateTime dateTime) {
        this.dateTime = dateTime;
    }

    public bool getIsValid() {
        return isValid;
    }

    public void setIsValid(bool isValid) {
        this.isValid = isValid;
    }

}