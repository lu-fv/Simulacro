import INTERRFACES.SportCategory;

import javax.swing.text.Utilities;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List< Utilitary> utilitaries = getUtilitaryList();
        mostrarUtilitary();

        List<Motocycle> motocycles = getMotocycleList();
        mostrarMotocycle();

        List<Automovile> automoviles = getAutomovile();
        mostrarAutomoviles();


    }

    private static List<Utilitary> getUtilitaryList() {
        List<Utilitary> utilitaries = new ArrayList<Utilitary>();

        Utilitary utilitaries1 = new Utilitary(" Ford ", 10000f, 500, 2);
        Utilitary utilitaries2 = new Utilitary(" Chevrolet ", 20000f, 550, 3);
        Utilitary utilitaries3 = new Utilitary(" Ford ", 18000f, 600, 3);

        utilitaries.add(utilitaries1);
        utilitaries.add(utilitaries2);
        utilitaries.add(utilitaries3);

        return utilitaries;
    }

    public static  void mostrarUtilitary (){ getUtilitaryList().forEach(System.out::println);}

    private static List<Motocycle> getMotocycleList(){
        List <Motocycle> motocycles = new ArrayList<Motocycle>();

        Motocycle motocycles1 = new Motocycle( "Suzuki", 15000f, 3);
        Motocycle motocycles2 = new Motocycle( "Honda", 25000f, 3);
        Motocycle motocycles3 = new Motocycle( "Kawasaki", 10000f, 2);

        motocycles.add(motocycles1);
        motocycles.add(motocycles2);
        motocycles.add(motocycles3);

        return motocycles;
    }

    public static  void mostrarMotocycle (){ getMotocycleList().forEach(System.out::println);}

    private static List <Automovile> getAutomovile(){
        List <Automovile> automoviles = new ArrayList<Automovile>();


        Carrer auto =  new Carrer("Fiat",20000f,2, 300.00);
        Urbans auto1 = new Urbans("Fiat",20000f,2, 4);
        Carrer auto2 = new Carrer("Fiat",20000f,2, 300.00);
        automoviles.add(auto);
        automoviles.add(auto1);
        automoviles.add(auto2);

        return automoviles;
    }

    public static  void mostrarAutomoviles (){ getAutomovile().forEach(System.out::println);}


}
