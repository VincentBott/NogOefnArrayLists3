package com.company;

import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Auto> autos = leesAutos(scanner);

        System.out.print("Geef nummerplaat die gezocht moet worden: ");

        String nummerplaat = scanner.nextLine();

        Auto auto = zoekAuto(autos, nummerplaat);

        if (auto != null) {

            System.out.printf("De bestuurder van de auto met nummerplaat %s is %s%n", auto.getNummerplaat(), auto.getBestuurder());

        } else {

            System.out.println("Nummerplaat is niet gevonden.");
        }
    }


    private static ArrayList<Auto> leesAutos(Scanner scanner) {


        ArrayList<Auto> autos = new ArrayList<>();


        String bestuurder;


        do {

            System.out.print("Geef bestuurder (<RETURN> om te stoppen): ");

            bestuurder = scanner.nextLine();


            if (!bestuurder.equals("")) {

                String nummerplaat;

                do {

                    System.out.print("Geef nummerplaat: ");

                    nummerplaat = scanner.nextLine();


                } while (nummerplaat.equals(""));

                Auto auto = new Auto(bestuurder, nummerplaat);

                autos.add(auto);

            }

        } while (!bestuurder.equals(""));


            return autos;
    }

    private static Auto zoekAuto(ArrayList<Auto> autos, String nummerplaat) {

        for (Auto auto: autos) {
            if (auto.getNummerplaat().equals(nummerplaat))
                return auto;

        }

        return null;
    }

}

/*
Geef bestuurder (<RETURN> om te stoppen)Karen
Geef nummerplaat: SKY-1
Geef bestuurder (<RETURN> om te stoppen)Kristel
Geef nummerplaat: 1-ABC-123
Geef bestuurder (<RETURN> om te stoppen)Kathleen
Geef nummerplaat: 1-BDF-324
Geef bestuurder (<RETURN> om te stoppen)
Geef nummerplaat die gezocht moet worden: SKY-1
De bestuurder van de auto met nummerplaat SKY-1 is Karen
of, wanneer de nummerplaat niet gevonden werd

Geef bestuurder (<RETURN> om te stoppen)Karen
Geef nummerplaat: SKY-1
Geef bestuurder (<RETURN> om te stoppen)Kristel
Geef nummerplaat: 1-ABC-123
Geef bestuurder (<RETURN> om te stoppen)Kathleen
Geef nummerplaat: 1-BDF-324
Geef bestuurder (<RETURN> om te stoppen)
Geef nummerplaat die gezocht moet worden: 1-ZZZ-999
Nummerplaat is niet gevonden.
 */
