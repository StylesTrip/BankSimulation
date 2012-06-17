package com.styles.BankSimulation

/**
 * Created by IntelliJ IDEA.
 * User: StylesTrip
 * Date: 1/31/12
 * Time: 10:36 PM
 */
class Bank {
  List<Teller> tellers = []
  List<Customer> customers

  Bank(def numberOfTellers, List<Customer> customers) {
    for(int i = 0; i < numberOfTellers; i++) {
      tellers.add(new Teller(i))
    }
    this.customers = customers
  }
}
