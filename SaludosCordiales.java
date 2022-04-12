package semana2;

abstract class Hola{
    void saludar(){
        //Cómo lo hace
        System.out.println("¿Cómo estás?, Te ves bien eh");
    }
    abstract void  saludo()    abstractvoid show();
}

interface Mostrar {
    //Que hace
    void show();
    abstract void despide();
}

public class SaludosCordiales implements Mostrar {
    public void show(){
        System.out.println("Hola, ¿Comó estás?, espero no del todo mal...");
    }

    public static void main(String[] args) {
        SaludosCordiales saludo1 = new SaludosCordiales();
        saludo1.show();
    }

   public class Despide{
        System.out.println("Hola, ¿Comó estás?, espero no del todo mal...");

   }
}
