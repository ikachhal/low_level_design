package lld.state_pattern;

public class NoDollarState implements State {

    @Override
    public void insertDollar(VendingMachine context) {
        System.out.println("Dollar inserted.");
        context.setState(new HasDollarState());
    }

    @Override
    public void ejectMoney(VendingMachine context) {
        System.out.println("No dollar to eject.");
    }

    @Override
    public void dispense(VendingMachine context) {
        System.out.println("No dollar inserted. Cannot dispense.");
    }
}
