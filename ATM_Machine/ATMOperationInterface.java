package ATM_Machine;

public interface ATMOperationInterface {
    public void viewBalance();
    public void depositAmount(double amount);
    public void withdrawAmount(double amount);

    public void viewMiniStatement();
}
