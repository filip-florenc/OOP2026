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
