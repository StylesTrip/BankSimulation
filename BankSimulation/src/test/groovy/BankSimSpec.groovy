import spock.lang.Specification
import com.styles.BankSimulation.Customer
import com.styles.BankSimulation.Bank
import com.styles.BankSimulation.Simulation
/**
 * Created by IntelliJ IDEA.
 * User: StylesTrip
 * Date: 6/17/12
 * Time: 2:35 PM
 */
class BankSimSpec extends Specification {
  def "testing when there are 4 tellers at 10 minute wait time"() {
    boolean result = false

    setup:
      List customers = []
      customers.add(new Customer( 0, 5))
      customers.add(new Customer( 2,  5))
      customers.add(new Customer( 2,  4))
      customers.add(new Customer( 5,  6))
      customers.add(new Customer( 6,  5))
      customers.add(new Customer( 8,  5))
      customers.add(new Customer( 8,  7))
      customers.add(new Customer( 8,  3))
      customers.add(new Customer( 11,  4))
      customers.add(new Customer( 12,  9))
      customers.add(new Customer( 13,  6))
      customers.add(new Customer( 13,  7))
      customers.add(new Customer( 16,  5))
      customers.add(new Customer( 17,  4))
      customers.add(new Customer( 19,  5))
      customers.add(new Customer( 19,  5))
      customers.add(new Customer( 19,  3))
      customers.add(new Customer( 19,  7))
      customers.add(new Customer( 23,  3))
      customers.add(new Customer( 25,  8))
      customers.add(new Customer( 28,  9))
      customers.add(new Customer( 28,  3))
      customers.add(new Customer( 30,  6))
      Bank bank = new Bank(4, customers)
      Simulation sim = new Simulation(bank)

    when:
      result = sim.runSimulation(10)

    then:
      result
  }

  def "testing when there are 4 tellers at 5 minute wait time"() {
    boolean result = false

    setup:
    List customers = []
    customers.add(new Customer( 0, 5))
    customers.add(new Customer( 2,  5))
    customers.add(new Customer( 2,  4))
    customers.add(new Customer( 5,  6))
    customers.add(new Customer( 6,  5))
    customers.add(new Customer( 8,  5))
    customers.add(new Customer( 8,  7))
    customers.add(new Customer( 8,  3))
    customers.add(new Customer( 11,  4))
    customers.add(new Customer( 12,  9))
    customers.add(new Customer( 13,  6))
    customers.add(new Customer( 13,  7))
    customers.add(new Customer( 16,  5))
    customers.add(new Customer( 17,  4))
    customers.add(new Customer( 19,  5))
    customers.add(new Customer( 19,  5))
    customers.add(new Customer( 19,  3))
    customers.add(new Customer( 19,  7))
    customers.add(new Customer( 23,  3))
    customers.add(new Customer( 25,  8))
    customers.add(new Customer( 28,  9))
    customers.add(new Customer( 28,  3))
    customers.add(new Customer( 30,  6))
    Bank bank = new Bank(4, customers)
    Simulation sim = new Simulation(bank)

    when:
    result = sim.runSimulation(5)

    then:
    result
  }
}
