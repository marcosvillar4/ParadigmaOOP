import Clases.Juego;

public class Main {

    public static void main(String[] args){

        ej1();

    }

    static void ej1(){
        Juego vidas1 = new Juego(5);
        Juego vidas2 = new Juego(5);

        //vidas1.setVidas(5);
        System.out.println(vidas1.getVidasRestantes());
        System.out.println("Quedan vidas: " + vidas1.QuitarVida());
        System.out.println(vidas1.getVidasRestantes());

        System.out.println("Vidas 1: " + vidas1.getVidasRestantes() + " Vidas 2: " + vidas2.getVidasRestantes());

        while (vidas1.getVidasRestantes() > 0){
            System.out.println("Quedan vidas: " + vidas1.QuitarVida() + " Vidas: " + vidas1.getVidasRestantes());
        }

        vidas1.reiniciaPartida();

        System.out.println("_______________________________");

        while (vidas1.getVidasRestantes() > 0){ // Empieza con 4 porque primero se llama quitar y despues se llama getVidas
            System.out.println("Quedan vidas: " + vidas1.QuitarVida() + " Vidas: " + vidas1.getVidasRestantes());
        }

    }

}
