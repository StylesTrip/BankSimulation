package com.styles.BankSimulation

/**
 * Created by IntelliJ IDEA.
 * User: StylesTrip
 * Date: 1/30/12
 * Time: 10:14 PM
 */
class Customer {
  boolean isWaiting = false
  def arrivalTime
  def waitTime
  def timeAtTeller
  def tellerHelper

  Customer(def arrivalTime, def timeAtTeller) {
    this.arrivalTime = arrivalTime
    this.timeAtTeller = timeAtTeller
    waitTime = 0
  }

  def beingHelped(def tellerNumber) {
    isWaiting = false
    tellerHelper = tellerNumber
  }

  def waiting() {
    waitTime = waitTime + 1
  }
}
