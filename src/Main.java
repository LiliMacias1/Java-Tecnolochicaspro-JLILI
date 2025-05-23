package introduccion;

public class Main{

    public static void main(String[] args) {
        introduccion.MiPrimerHilo primerhilo = new introduccion.MiPrimerHilo();

        introduccion.MiSegundoHilo segundoHiloRunnable = new introduccion.MiSegundoHilo();
        Thread segundoHiloRunnable;
        segundoHiloRunnable = new Thread(segundoHiloRunnable);

        primerhilo.start();
        segundoHiloRunnable.start();


    }
}