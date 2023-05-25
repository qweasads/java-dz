package org.example;

import java.io.Serializable;
import static org.example.Country.RU;
import static org.example.PaymentSystem.MAESTRO;

public class MaestroCard extends org.example.Card implements ICard, Serializable {
    public MaestroCard() {
        super(MAESTRO);
    }

    @Override
    protected boolean isCountryValidForThisCard(Country country) {
        return RU == country;
    }
}
