package lld.state_pattern;

public class StateMachineDemo {
    public static void run() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertDollar();
        vendingMachine.ejectMoney();
        vendingMachine.setState(new HasDollarState());
        vendingMachine.dispense();
    }
}
