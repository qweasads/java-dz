package org.example;

import org.example.Card;
import org.example.MasterCard;
import org.example.UnionPayCard;
import org.example.VisaCard;

import java.util.ArrayList;
import java.util.List;

import static org.example.Country.RU;

public class main {
    public static void main(String[] args) {
        invoke(new MasterCard());
        List<String> aList = new ArrayList<>();
    }

    public static void invoke(Card card) {
        card.setBalance(1000);
        card.payInCountry(RU, 175);

        System.out.println("Current balance: " + card.getBalance());
    }

}
