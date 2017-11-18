package lesson8.accounts;

public class CheckingAccount extends Account {
    int limitOFExpences;

    public CheckingAccount(String bankName, String ownerName, int moneyAmount, int limitOFExpences) {
        super(bankName, ownerName, moneyAmount);
        this.limitOFExpences = limitOFExpences;
    }
    void withdraw(int amount){
        if(amount > limitOFExpences)
            return;
        moneyAmount-=amount;
    }


}
