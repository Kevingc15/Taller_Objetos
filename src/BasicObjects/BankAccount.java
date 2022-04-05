package BasicObjects;

public class BankAccount {
    //PROPERTIES
    private int  accountNumber;
    protected boolean activated;

    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    //GETTERS
    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean isActivated() {
        return activated;
    }

    //SETTERS
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
