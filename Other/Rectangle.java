class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        /*
        1.  Do przykładu z klasą Rectangle dopisz kod,
            który przetestuje działanie metod, które liczą obwód i pole.
        */

        // Stworz obiekt prostokat o wymiarach 2 x 4
        Rectangle prostokat = new Rectangle(2, 4);
        System.out.println("Obwod prostokata: " + prostokat.getPerimeter());
        System.out.println("Pole prostokata: " + prostokat.getArea());
    }
}

class Book {
    /*
    2.  Stwórz klasę Book, reprezentującą książkę z polami takimi jak "tytuł" i "autor".
        Dodaj konstruktor, metody dostępu (getter i setter) do tych pól
        oraz metodę, która wyświetli informacje o książce.
    */
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }
}

/*
4.  Stwórz klasę abstrakcyjną Vehicle z polem name oraz abstrakcyjną metodą start().
    Następnie stwórz dwie klasy dziedziczące: Car i Bicycle, implementujące metodę start().
    Napisz program, który tworzy obiekty różnych klas i uruchamia je.
*/
abstract class Vehicle {
    String name;

    public Vehicle(String name) {
        this.name = name;
    }
    public abstract void start();
}

class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.printf("Car - %s startuje wrum wrum\n", this.name);
    }
}

class Bicycle extends Vehicle {
    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.printf("Bicycle - %s pedaluje wrum wrum\n", this.name);
    }
}

class Program {
    public static void main(String[] args) {
        Car Toyota = new Car("Samochod");
        Toyota.start();
        Bicycle Rowerek = new Bicycle("Rowerek wyscigowy");
        Rowerek.start();
    }
}

/*
5.  Stwórz interfejs Flyable, który definiuje metody takeOff() i land().
    Następnie stwórz pięć różnych klas reprezentujących obiekty.
    Przed ich implementacją zastanów się jaka powinna być hierarchia klas i które klasy powinny implementować interfejs Flyable.
    Te klasy to:
        a.	Klasa Airplane, reprezentująca samolot
        b.	Klasa Bird, reprezentująca ptaka
        c.	Klasa Penguin, reprezentująca pingwina.
        d.	Klasa Eagle, reprezentująca orła.
        e.	Klasa Sparrow, reprezentująca wróbla.
*/

interface Flyable {
    void takeOff();
    void land();
}

class Airplane implements Flyable {
    public void takeOff() {

    }

    public void land() {

    }
}

class Bird implements Flyable {
    public void takeOff() {

    }

    public void land() {

    }
}

class Eagle implements Flyable {
    public void takeOff() {

    }

    public void land() {

    }
}

class Sparrow implements Flyable {
    public void takeOff() {

    }

    public void land() {

    }
}



