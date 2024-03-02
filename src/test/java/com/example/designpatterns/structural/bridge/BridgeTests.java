package com.example.designpatterns.structural.bridge;

import com.example.designpatterns.structural.bridge.impl.Customer;
import com.example.designpatterns.structural.bridge.impl.HighEarningCustomer;
import com.example.designpatterns.structural.bridge.impl.LowEarningCustomer;
import com.example.designpatterns.structural.bridge.impl.PremiumCard;
import com.example.designpatterns.structural.bridge.impl.StandardCard;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BridgeTests {

  @Test
  public void try_bridge() {
    CreditCard premiumCard = new PremiumCard();
    CreditCard standardCard = new StandardCard();
    List<Customer> customers = List.of(
        new HighEarningCustomer(premiumCard),
        new HighEarningCustomer(standardCard),
        new LowEarningCustomer(premiumCard),
        new LowEarningCustomer(standardCard));

    customers.forEach(Customer::printMetadata);
  }

}
