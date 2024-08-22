import Clases.Juego;

public class Main {

    public static void main(String[] args){

        Juego vidas1 = new Juego();
        Juego vidas2 = new Juego();

        vidas1.setVidas(5);
        System.out.println(vidas1.getVidasRestantes());
        vidas1.setVidas(vidas1.getVidasRestantes() - 1);
        System.out.println(vidas1.getVidasRestantes());

        System.out.println("Vidas 1: " + vidas1.getVidasRestantes() + " Vidas 2: " + vidas2.getVidasRestantes());

    }

}
