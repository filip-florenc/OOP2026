## I. Dokumentacja do lab. nr 2 - "Paradygmaty obiektowości"
## II. Filip Florenc - grupa ABC, semestr III
## III. Przedmiot - "Programowanie obiektowe"

## IV. Opis zadania do realizacji
Do zrealizowania były następujące zadania:  
  - opis zadania nr 1 Zaprojektuj klasę Book z polami `title`, `author`, `available` oraz metodami `borrow()` i `returnBook()`.,  
  - opis zadania nr 2 Zaimplementuj klasę `BankAccount` z prywatnym polem `balance` i metodami `deposit(double)` oraz `withdraw(double)` z walidacją danych.,  
  - opis zadania nr 3 Utwórz hierarchię `Vehicle -> Car` i pokaż w `main`, które pola/metody są dziedziczone., 
  - opis zadania nr 4 Dodaj klasę `ElectricCar`, która przesłania metodę `getDescription()` i zademonstruj polimorfizm na tablicy `Vehicle[]`.,

## V. Technologie wykorzystane w zadaniu
  - Java,

## VI. Realizacja zadania
<br>

#### 1. Kod Javy (lub Pythona)
W zadaniu wykorzystano:
- Wiedzę z wykładu oraz labolatorium
- Pętle
- Metody
- Klasy
- Nadpisywanie
- Polimorfizm

Kod wykorzystany do rozwiązania zadań:  

### Zadanie 1
```java
    public class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author)
    {
        this.title=title;
        this.author=author;
        this.available=true;
    }
    public void borrow()
    {
        if(available)
        {
            available=false;
            System.out.println("Książka \""+title+"\" została wypożyczona");
        }
        else
        {
            System.out.println("Książka jest niedostępna");
        }
    };
    public void returnBook()
    {
        if(available==true)
        {
            System.out.println("Książka \""+title+"\" nie była wypożyczona");
        }
        else
        {
            available = true;
            System.out.println("Książka została oddana!");
        }
    };
    public void pokazStatus()
    {
        if(available==true)
        {
            System.out.println("Książka \""+title+"\" jest dostępna");
        }
        else
        {
            System.out.println("Książka \""+title+"\" jest niedostępna");
        }
    }
    public static void main(String[] args) {
        Book ksiazka1 = new Book("Pan Tadeusz","Adam Mickiewicz");
        Book ksiazka2 = new Book("Harry Potter","J.K. Rowling");
        Book ksiazka3 = new Book("Rok 1984","George Orwell");

        ksiazka1.pokazStatus();
        ksiazka1.borrow();
        ksiazka1.pokazStatus();
        ksiazka1.borrow();
        ksiazka1.returnBook();
        ksiazka1.pokazStatus();

    }
};
```
### Zadanie 2
```java
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
```
### Zadanie 3 i 4 
```java
    class Vehicle {
    String marka;
    int rokProdukcji;
    Vehicle(String marka, int rokProdukcji) {
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
    }
    void getDescription() {
        System.out.println("=================\nMarka: " + marka + ", Rok produkcji: " + rokProdukcji);
    }
    static class Car extends Vehicle {
        int liczbaDrzwi;
        String silnik;
        public Car(String marka, int rokProdukcji, int liczbaDrzwi, String silnik) {
            super(marka, rokProdukcji);
            this.liczbaDrzwi = liczbaDrzwi;
            this.silnik = silnik;
        }
        @Override
        void getDescription() {
            System.out.println("=================\nMarka: " + marka + ", Rok produkcji: " + rokProdukcji + ", Liczba drzwi: " + liczbaDrzwi + ", Silnik: " + silnik);
        }
    }
    static class ElectricCar extends Car {
        int pojemnoscBaterii;

        public ElectricCar(String marka, int rokProdukcji, int liczbaDrzwi, int pojemnoscBaterii) {
            super(marka, rokProdukcji, liczbaDrzwi, "Elektryczny");
            this.pojemnoscBaterii = pojemnoscBaterii;
        }
        @Override
        void getDescription() {
            System.out.println("=================\nMarka: " + marka + ", Rok produkcji: " + rokProdukcji + ", Liczba drzwi: " + liczbaDrzwi + ", Silnik: " + silnik + ", Bateria: " + pojemnoscBaterii + " kWh");
        }
    }
    public static void main(String[] args) {
        Car auto1 = new Car("Audi", 1996, 5, "Benzyna");
        Car auto2 = new Car("Volkswagen", 2002, 5, "Diesel");
        ElectricCar auto3 = new ElectricCar("Tesla", 2023, 5, 85);
        Vehicle auto4 = new Vehicle("Ford", 2010);

        Vehicle[] samochody = new Vehicle[4];
        samochody[0] = auto1;
        samochody[1] = auto2;
        samochody[2] = auto3;
        samochody[3] = auto4;

        System.out.println("--- POLIMORFIZM ---");
        for (Vehicle v : samochody) {
            v.getDescription();
        }
        System.out.println("=================");
    }
    /*
      DLACZEGO TO JEST POLIMORFIZM?

      W pętli używamy jednej i tej samej linijki kodu: v.getDescription().
      Mimo to program nie wywołuje za każdym razem tej samej metody.

      Java w czasie działania programu sama sprawdza, czym naprawdę jest obiekt "v"
      (zwykłym autem, elektrykiem czy bazowym pojazdem) i automatycznie
      uruchamia odpowiednią dla niego wersję metody (odpowiednio Car, Electric i Vehicle.

      Jeden zapis (v.getDescription()) daje wiele różnych efektów.
     */
}

```

#### 2. Zrzuty ekranu pokazujące wynik działania aplikacji/skryptu:  
### Zadanie 1
![zadanie 1](/images/z1.png)
### Zadanie 2
![zadanie 2](/images/z2.png)
### Zadanie 3 i 4
![zadanie 3_4](/images/z3.png)


#### 2a. Struktura projektu/programu:  
![struktura-projektu](/images/struktura.png)

<br>

