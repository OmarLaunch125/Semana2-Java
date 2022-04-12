package semana2.Lunes;

abstract class Sombra {
    abstract void   dibujarSombra(){
}

class  Arma extends Sombra{
        @Override
        void dibujarSombra(){
            System.out.println("Dibujando sombras en el arma color azul");
        }
    }
}


public class Personaje extends  Arma {
    public static void main(String[] args) {
        //Creando un objetivo  de tipo sombra1 de esta clase  que trae un metodo abstracto y abstraccion le va a decir como dibuje su sombra
        Sombra flecha = new Personaje();
        Sombra arco = new Arma();

        flecha.dibujarSombra();
        arco.dibujarSombra();
    }

    @Override
    void dibujarSombra(){
        System.out.println("Dibuja una sombra blanca");
    }
}
