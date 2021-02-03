import java.util.ArrayList;

/**
 * Created by: Daniels
 * Date: 01/02/2021
 * Description:
 */
public class bingo {
    public ArrayList<Integer> carton1 = new ArrayList<>();
    public ArrayList<Integer> carton2 = new ArrayList<>();

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
        System.out.println(carton1);
        System.out.print(carton2);
    }

    public void numerosBingo () {

    }

    public void comprovarCarton() {
        if (carton1.isEmpty())
            System.out.print("Bigooooo!!!! del Jugador 1");
        else if (carton2.isEmpty())
            System.out.print("Bigooooo!!!! del Jugador 2");
    }
}