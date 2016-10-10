package tda548;

public class LabSolver {

    public static void main(String[] args) {
        int width = 20;
        int height = 10;
        if (args.length > 1) {
            width = Integer.parseInt(args[0]);
            height = Integer.parseInt(args[1]);
        }
        Labyrinth l = new Lab(width,height);
        System.out.println("\nCreated a random labyrinth:");
        System.out.println(l);
        boolean success = findPath(0,0,width-1,height-1,l);
        if (success) {
            System.out.println("Solution found:");
            System.out.println(l);
        } else {
            System.out.println("Failed to find a solution. (Bug in LabSolver.java)");
        }
    }

    public static boolean findPath(int x0, int y0, int x1, int y1, Labyrinth l) {
        /*Upprepa tills det inte går, dvs man träffar vägg eller testat alla riktningar i korsning
                Flytta sig frammåt tills man når en korsning, spara positionen samt riktningar som redan testats, gå i en riktning som inte är sparad
          Då:
                Gå tillbaka till senaste korsning
                börja om.
         */
        if ((x0 == x1) && (y0 == y1)) {
            return true;
        }
        // ...
        return false;
    }

}
