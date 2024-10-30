public class Zmienne {
    public static void main(String[] args) {
        int liczba;
        liczba = 13;
        double liczba2 = 17.7;

        System.out.println("Moja zmienna " + liczba + ", druga zmienna " + liczba2);

        int workHoursPerYear;
        int days = 5;
        int hours = 8;
        int weeks = 52;


        workHoursPerYear = days * hours * weeks;

        char znak = '#';

        String napis = "Dzisiaj jest \"ładna\" pogoda.";

        napis += "!";

        System.out.println("Mój napis: " + napis);
        System.out.print("Mój\t napis: " + napis + " koniec \n");
        System.out.print("Mój napis: " + napis);


        boolean sun = true; //false


    }
}
