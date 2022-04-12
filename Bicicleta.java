package semana2.Lunes;

//Derivada bicicleta tipo montaña de bicicletas
abstract class Mountain{
    Mountain(){
        System.out.println("Se ah creado una bicicleta de montaña");
    }
    abstract void   cambiarVelocidad();
    void cambiarColor(){
        System.out.println("Cambiando color a rojo");
    }
}

class Magistroni extends Mountain{
    void cambiarVelocidad(){
        System.out.println("Se deben de desbloquear las perillas del manubrio primero");
    }
}

public class Bicicleta {
    void cambiarVelocidad(){
        System.out.println("Gira la perilla");

    }

    public static void main(String[] args) {
        Mountain bici1 = Magistroni(){
            bici1.cambiarVelocidad();
            bici1.cambiarColor();
        }
    }
}
