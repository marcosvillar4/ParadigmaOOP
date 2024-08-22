package Clases;

public class Juego {

    private int vidas;

    private final int iniVidas;

    public Juego(int v){
        this.vidas = v;
        this.iniVidas = v;
    }


    public int getVidasRestantes(){
        return vidas;
    }

    void setVidas(int v){
        vidas = v;
    }

    public boolean QuitarVida(){
        if (vidas > 1){
            vidas--;
            return true;
        } else if (vidas == 1){
            vidas--;
            return false;
        } else {
            return false;
        }

    }

    public void reiniciaPartida(){
        vidas = iniVidas;
    }

    public int getIniVidas(){
        return iniVidas;
    }

}
