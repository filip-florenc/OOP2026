public class BankAccount {
    private double balance;
    public BankAccount(double poczatkoweSaldo)
    {
        if(poczatkoweSaldo>=0)
        {
            this.balance=poczatkoweSaldo;
        }
        else
        {
            System.out.println("Początkowe saldo nie może być ujemne!");
        }
    }
    public void deposit(double kwota) {
        if (kwota > 0) {
            this.balance += kwota;
            System.out.println("Wpłacono: " + kwota+". Twoje saldo wynosi: "+balance);
        } else {
            System.out.println("Błąd: Kwota wpłaty musi być dodatnia!");
        }
    }
    public void withdraw(double kwota) {
        if (kwota > 0 && kwota <= balance) {
            this.balance -= kwota;
            System.out.println("Wypłacono: " + kwota+". Twoje saldo wynosi: "+balance);
        } else {
            System.out.println("Błąd: Brak środków na koncie lub nieprawidłowa kwota!");
        }
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount konto = new BankAccount(500);
        konto.deposit(200);
        konto.withdraw(120);
        konto.withdraw(1000);
        konto.deposit(-200);
        System.out.println("Saldo: " + konto.getBalance());
    }
}