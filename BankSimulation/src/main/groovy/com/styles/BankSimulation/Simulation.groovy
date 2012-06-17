package com.styles.BankSimulation

/**
 * Created by IntelliJ IDEA.
 * User: StylesTrip
 * Date: 6/14/12
 * Time: 10:46 PM
 */
class Simulation {
  private Bank bank

  Simulation(bank) {
    this.bank = bank
  }

  boolean runSimulation(def waitTimeLimit) {
    def customersHelped = 0, bankTime = 0
    def customersAtBank = []

    while(bank.customers.size() != customersHelped) {
      for(Customer customer : customersAtBank) {
        if(customer.isWaiting) {
          if(customer.waitTime > waitTimeLimit) {
            return false //too few tellers
        }
        } else {
          customer.timeAtTeller = customer.timeAtTeller - 1
          if(0 == customer.timeAtTeller) {
            for(Teller teller : bank.tellers) {
              if(teller.tellerNumber == customer.tellerHelper) {
                teller.isFree = true
                customersHelped++
              }
            }
          }
        }
      }

      //New customers entering the bank
      for(Customer customer : bank.customers) {
        if(customer.arrivalTime == bankTime) {
          customer.isWaiting = true
          customersAtBank.add(customer)
        }
      }

      //Check for any free tellers to grab the next waiting customer
      for(Teller teller : bank.tellers) {
        if(teller.isFree) {
          for(Customer customer : customersAtBank) {
            if(customer.isWaiting) {
              teller.helpNextCustomer(customer)
              break
            }
          }
        }
      }

      //Increase the wait time as we increase the bankTime
      for(Customer customer : customersAtBank) {
        if(customer.isWaiting)
          customer.waiting()
      }

      bankTime++
    }

    return true
  }
}
