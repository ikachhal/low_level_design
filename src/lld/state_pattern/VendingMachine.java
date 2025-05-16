package lld.state_pattern;

public class VendingMachine {
    private State state;

    public VendingMachine() {
        this.state = new NoDollarState();
    }

    public void insertDollar() {
        state.insertDollar(this);
    }

    public void ejectMoney() {
        state.ejectMoney(this);
    }

    public void dispense() {
        state.dispense(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
