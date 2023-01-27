interface olaCustomer{
    void bookCab();
    void findRide();
    void rentCab();
    void rateDriver();
    void scheduleCab();
    void cancelCab();
    void addMoneyToWallet();
    void raiseTicket();
    void signUp();
    void singIn();
}
interface olaDriver{
    void acceptBooking();
    void getCustomerLocation();
    void setAvailableStatus();
    void getMyCommission();
    void callCustomer();
    void setUpYourVehicle();
    void customerFeedback();
}
interface olaOwner{
    void getDriverRecords();
    void getReportByDriverId();
    void getReportByRegion();
    void getTotalRevenue();
    void getCustomerFeedback();
    void addDriver();
    void removeDriver();
    void changeDriverStatus();
}
public class Abstraction_1 implements olaCustomer,olaOwner,olaDriver{
    public static void main(String[] args){
        olaCustomer cust = new Abstraction_1();
        cust.addMoneyToWallet();
    }


    @Override
    public void bookCab() {

    }

    @Override
    public void findRide() {

    }

    @Override
    public void rentCab() {

    }

    @Override
    public void rateDriver() {

    }

    @Override
    public void scheduleCab() {

    }

    @Override
    public void cancelCab() {

    }

    @Override
    public void addMoneyToWallet() {

    }

    @Override
    public void raiseTicket() {

    }

    @Override
    public void signUp() {

    }

    @Override
    public void singIn() {

    }

    @Override
    public void acceptBooking() {

    }

    @Override
    public void getCustomerLocation() {

    }

    @Override
    public void setAvailableStatus() {

    }

    @Override
    public void getMyCommission() {

    }

    @Override
    public void callCustomer() {

    }

    @Override
    public void setUpYourVehicle() {

    }

    @Override
    public void customerFeedback() {

    }

    @Override
    public void getDriverRecords() {

    }

    @Override
    public void getReportByDriverId() {

    }

    @Override
    public void getReportByRegion() {

    }

    @Override
    public void getTotalRevenue() {

    }

    @Override
    public void getCustomerFeedback() {

    }

    @Override
    public void addDriver() {

    }

    @Override
    public void removeDriver() {

    }

    @Override
    public void changeDriverStatus() {

    }
}
