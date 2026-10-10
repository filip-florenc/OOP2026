## I. Dokumentacja do wykładu. nr 1 - "Paradygmaty obiektowości"
## II. Filip Florenc - grupa I, semestr III
## III. Przedmiot - "Programowanie obiektowe"

## IV. Opis zadania do realizacji
Do zrealizowania były następujące zadania:  
  - Sprawdź i zapisz w sprawozdaniu wyniki poleceń `java -version` oraz `javac -version`.
  - Utwórz i uruchom program **HelloWorld** z metodą `main`.
  - W sprawozdaniu opisz krótko różnicę między **JDK**, **JRE** i **JVM**.

## V. Technologie wykorzystane w zadaniu
  - Java,
  - Markdown

## VI. Realizacja zadania
<br>

#### 1. Kod Javy (lub Pythona)
W zadaniu wykorzystano język Java oraz środowisko IntelliJ IDEA.

Kod wykorzystany do rozwiązania zadań:  

### Zadanie 1
```text
    java -version
```


```text
    javac -version
```
### Zadanie 2 
```java
    public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

#### 2. Zrzuty ekranu pokazujące wynik działania aplikacji/skryptu:  
### Zadanie 1
![Zadanie 1a](/images/zadanie1.png)
![Zadanie 1b](/images/zadanie11.png)
### Zadanie 2
![Zadanie 2](/images/zadanie2.png)

#### 3. Inne
### Zadanie 3

* **JDK - Java Development Kit (Zestaw Programistyczny Javy)**
  > Zawiera JRE, kompilator (`javac`) i narzędzia niezbędne do pisania oraz kompilowania programów w Javie.

* **JRE - Java Runtime Environment (Środowisko Uruchomieniowe Javy)**
  > Zawiera JVM oraz zestaw bibliotek umożliwiających uruchomienie gotowej aplikacji.

* **JVM - Java Virtual Machine (Wirtualna Maszyna Javy)**
  > Wirtualna maszyna odpowiedzialna za bezpośrednie wykonywanie skompilowanego kodu.

 **Podsumowanie relacji:**
> JVM wykonuje kod $\rightarrow$ JRE dodaje biblioteki, aby użytkownik mógł uruchomić aplikację $\rightarrow$ JDK dodaje narzędzia deweloperskie (kompilator), aby programista mógł tworzyć oprogramowanie.