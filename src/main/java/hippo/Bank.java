package hippo;

public class Bank {
    private int moneyOfTheBank;

    public int getMoneyOfTheBank() {
        return moneyOfTheBank;
    }

    public void setMoneyOfTheBank(int moneyOfTheBank) {
        this.moneyOfTheBank += moneyOfTheBank;
    }


    private static Bank bank = new Bank();

    public static Bank getInstance() {
        return bank;
    }

    private Bank() {
    }
}
