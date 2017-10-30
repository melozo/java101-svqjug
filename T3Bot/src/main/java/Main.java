import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from ParrotBit");
        Scanner scanner = new Scanner(System.in);

        String[] ListaDeFrasesCelebres = new String[10];
        ListaDeFrasesCelebres[0] = "Cuidadin";
        ListaDeFrasesCelebres[1] = "Cuidadin position 1";
        ListaDeFrasesCelebres[2] = "Cuidadin position 2";
        ListaDeFrasesCelebres[3] = "Cuidadin position 3";
        ListaDeFrasesCelebres[4] = "Cuidadin position 4";
        ListaDeFrasesCelebres[5] = "Cuidadin position 5";
        ListaDeFrasesCelebres[6] = "Cuidadin position 6";
        ListaDeFrasesCelebres[7] = "Cuidadin position 7";
        ListaDeFrasesCelebres[8] = "Cuidadin position 8";
        ListaDeFrasesCelebres[9] = "Cuidadin position 9";


        boolean end = false;
        do {
            String line = scanner.nextLine();
            int numeroRandom = (int) (Math.random() * 10);
            System.out.println(ListaDeFrasesCelebres[numeroRandom]);

            if (line.equalsIgnoreCase("quit")){
                end = true;
            }
        } while (!end);

    }
}
