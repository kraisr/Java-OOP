import java.io.*;
import java.util.*;

/*
ZADANIE 2
1.  Napisz program, który wczytuje dane z pliku.
    Na podstawie tych danych tworzy klasy interfejsu Figura.
    Te klasy to Trójkąt, Prostokąt, Kwadrat, Koło.
    Następnie po wczytaniu danych wylicza pole i obwód tych figur i wypisuje wynik na konsolę.
    Do napisania programu użyj poniższego kodu po wcześniejszym jego przeanalizowaniu.
 */

interface Figura {
    double obliczPole();
    double obliczObwod();
}

class Trojkat implements Figura {
    private double a, b, c;

    public Trojkat(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double obliczPole() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double obliczObwod() {
        return a + b + c;
    }
}

class Prostokat implements Figura {
    private double length;
    private double width;

    public Prostokat(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double obliczPole() {
        return length * width;
    }

    @Override
    public double obliczObwod() {
        return 2 * (length + width);
    }
}

class Kwadrat implements Figura {
    private double length;

    public Kwadrat(double length) {
        this.length = length;
    }

    @Override
    public double obliczPole() {
        return length * length;
    }

    @Override
    public double obliczObwod() {
        return 2 * (length + length);
    }
}

class Kolo implements Figura {
    private double radius;

    public Kolo(double radius) {
        this.radius = radius;
    }

    @Override
    public double obliczPole() {
        return Math.PI * radius * radius;
    }

    @Override
    public double obliczObwod() {
        return 2 * (Math.PI * radius);
    }
}


class FiguraFactory {
    public static Figura utworzFigure(String figura, double... parametry) {
        switch (figura) {
            case "Trojkat":
                if (parametry.length == 3) {
                    return new Trojkat(parametry[0], parametry[1], parametry[2]);
                }
                break;

            case "Prostokat":
                if (parametry.length == 2) {
                    return new Prostokat(parametry[0], parametry[1]);
                }
                break;

            case "Kwadrat":
                if (parametry.length == 1) {
                    return new Kwadrat(parametry[0]);
                }
                break;

            case "Kolo":
                if (parametry.length == 1) {
                    return new Kolo(parametry[0]);
                }
                break;
        }
        return null;
    }
}

public class FiguryProgram {
    public static void main(String[] args) {
        List<Figura> figury = wczytajFiguryZPliku("dane.txt");
        if (figury != null) {
            for (Figura figura : figury) {
                System.out.println(figura);
                System.out.println("Pole: " + figura.obliczPole());
                System.out.println("Obwod: " + figura.obliczObwod());
            }
        }
    }

    public static List<Figura> wczytajFiguryZPliku(String nazwaPliku) {
        List<Figura> figury = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nazwaPliku))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length > 0) {
                    String figura = parts[0];
                    double[] parametry = new double[parts.length - 1];
                    for (int i = 1; i < parts.length; i++) {
                        parametry[i - 1] = Double.parseDouble(parts[i]);
                    }

                    Figura utworzonaFigura = FiguraFactory.utworzFigure(figura, parametry);
                    if (utworzonaFigura != null) {
                        figury.add(utworzonaFigura);
                    } else {
                        System.out.println("Nieprawidlowe dane: " + line);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return figury;
    }
}
