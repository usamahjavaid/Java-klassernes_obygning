import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Studerende elev1 = new Studerende();
        elev1.navn = "Patrick";
        elev1.alder = 26;
        elev1.by = "køge";
        elev1.studieretning = "datamatiker";

        Studerende elev2 = new Studerende();
        elev2.navn = "Daniella";
        elev2.alder = 28;
        elev2.by = "næstved";
        elev2.studieretning = "datamatiker";

        Studerende elev3 = new Studerende();
        elev3.navn = "Mikkel";
        elev3.alder = 27;
        elev3.by = "næstved";
        elev3.studieretning = "datamatiker";

        Studerende elev4 = new Studerende();
        elev4.navn = "Danjiel";
        elev4.alder = 18;
        elev4.by = "næstved";
        elev4.studieretning = "datamtiker";


        System.out.println(" Nu er alle studerende er oprettet");


        System.out.println("Vælg elev");
        Scanner scanner = new Scanner(System.in);
        String findnavn = scanner.next();
        switch (findnavn) {
            case "Patrick":
                System.out.println(elev1.alder); System.out.println(elev1.by);
                System.out.println(elev1.studieretning); break;
            case "Daniella":
                System.out.println(elev2.alder);
                System.out.println(elev2.by);
                System.out.println(elev2.studieretning); break;
            case "Mikkel":
                System.out.println(elev3.alder);
                System.out.println(elev3.by);
                System.out.println(elev3.studieretning); break;
            case "Danjiel":
                System.out.println(elev4.alder);
                System.out.println(elev4.by);
                System.out.println(elev4.studieretning);


        }

    }
}