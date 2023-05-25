package org.example;

public class MirCard extends Card{

    public MirCard(){
        super(PaymentSystem.MIR);
    }


    protected boolean isCountryValidForThisCard(Country country){
        if (country == Country.RU)
            return true;
        else
            return false;
    }
}
