import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by: Daniels
 * Date: 01/02/2021
 * Description:
 */
public class bingo {
    public ArrayList<Integer> carton1 = new ArrayList<>();
    public ArrayList<Integer> carton2 = new ArrayList<>();
    boolean salir = false;

    public static void main(String[] args) {
        bingo vi = new bingo();
        vi.crearCartones();
        vi.numerosBingo();
    }

    public void crearCartones() {

        for (int i = 0; i < 10; ++i) {
            carton1.add((int) ((Math.random() * 99) + 1));
            carton2.add((int) ((Math.random() * 99) + 1));
        }
        //System.out.println(carton1);
        //System.out.println(carton2);
    }

    public void numerosBingo () {
        ArrayList<Integer> insideBingo = new ArrayList<>();
        for (int i = 1; i < 100; ++i) {
            insideBingo.add(i);
        }
        //System.out.print(insideBingo);

        while (!salir){
            int numeroBingo = (int) ((Math.random() * 99) + 1);
            if (insideBingo.contains(numeroBingo)) {
                insideBingo.removeAll(Arrays.asList(numeroBingo));

                if (carton1.contains(numeroBingo)) {
                    carton1.removeAll(Arrays.asList(numeroBingo));
                    System.out.println("Jugador 1 tiene el numero " + numeroBingo);
                } else
                    System.out.println("Jugador 1 no tiene el numero: " + numeroBingo);


                if (carton2.contains(numeroBingo)) {
                    carton2.removeAll(Arrays.asList(numeroBingo));
                    System.out.println("Jugador 2 tiene el numero " + numeroBingo);

                } else
                    System.out.println("Jugador 2 no tiene el numero: " + numeroBingo);
            }
            comprovarCarton();

        }
    }

    public void comprovarCarton() {
        if (carton1.isEmpty()) {
            System.out.print("Bigooooo!!!! del Jugador 1");
            salir = true;
        }else if (carton2.isEmpty()){
            System.out.print("Bigooooo!!!! del Jugador 2");
            salir=true;
        }
    }
}