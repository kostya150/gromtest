package lesson10.HW;

import java.util.Date;

public class ElectronicsOrder extends Order {
    int guaranteeMonths;


    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder(){
        if(getCustomerOwned() != null && (getShipFromCity() == "Киев") || (getShipFromCity() == "Одесса") || (getShipFromCity() == "Днепр") || (getShipFromCity() == "Харков")){
            if (getBasePrice() >= 100)
                setDateConfirmed(new Date());
        }

    }
    @Override
    public void calculatePrice(){
        double totalPrice = 0;
        if(getBasePrice() > 1000){
            totalPrice = getBasePrice() - getBasePrice()*0.05;
        }

        double PriceDelivery = 0;
        if(getShipToCity()!= "Киев" && getShipToCity() != "Одесса"){
            PriceDelivery = getBasePrice() * 0.15;
        }else
            PriceDelivery = getBasePrice() * 0.1;
    }

}
