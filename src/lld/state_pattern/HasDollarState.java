package lld.state_pattern;

public class HasDollarState implements State {

    @Override
    public void insertDollar(VendingMachine context) {
        System.out.println("Dollar already inserted.");
    }

    @Override
    public void ejectMoney(VendingMachine context) {
        System.out.println("Ejecting dollar.");
        context.setState(new NoDollarState());
    }

    @Override
    public void dispense(VendingMachine context) {
        System.out.println("Dispensing item.");
        context.setState(new NoDollarState());
    }
}
