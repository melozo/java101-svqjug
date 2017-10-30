public class DiceGame {
    public static void main(String[] args) {

        Player Pep = new Player();
        Player Maquina = new Player();

        Turn turno = new Turn();

        Pep.name = "Pep";
        Maquina.name = "DeepBlue";

        System.out.println("Welcome to this game!");
        System.out.println("In the corner left we have Player " + Pep.name);
        System.out.println("In the corner right we have Player " + Maquina.name);
        System.out.println("Go to play!");

        System.out.println("Round one");
        // Using Turn (random number) to determine who start
        // System.out.println(turno.getRandom());
        System.out.println("Who...");

        // Determine who start 1 = Pep, 2 = Machine
        if (turno.getRandom() == 1){
            System.out.println("Pep, start!");
            Pep.setTurn(true);
        } else {
            System.out.println(Maquina.name + " start!");
            Maquina.setTurn(true);
        }

        System.out.println(Maquina.name + " ¿ have you the turn ? " + Maquina.getTurn());
        System.out.println(Pep.name + " ¿ have you the turn ? " + Pep.getTurn());

    }
}
