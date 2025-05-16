package lld.state_pattern;

public interface State {
    void insertDollar(VendingMachine context);
    void ejectMoney(VendingMachine context);
    void dispense(VendingMachine context);
}
