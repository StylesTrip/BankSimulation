package com.styles.BankSimulation

/**
 * Created by IntelliJ IDEA.
 * User: StylesTrip
 * Date: 1/30/12
 * Time: 10:12 PM
 */
class Teller {
  def tellerNumber
  boolean isFree

  Teller(def tellerNumber) {
    this.tellerNumber = tellerNumber
    isFree = true
  }

  def helpNextCustomer(Customer customer) {
    customer.beingHelped(this.tellerNumber)
    isFree = false
  }
}
