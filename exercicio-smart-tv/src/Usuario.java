public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();


        System.out.println("Status Inicial da TV....");
        System.out.println("A Smart Tv está ligada ? " + smartTv.ligada);
        System.out.println("A Smart Tv está em qual canal? " + smartTv.canal);
        System.out.println("A Smart Tv está em qual volume? " + smartTv.volume);

        System.out.println("----------Efetuar Ajustes-------------");
  
        smartTv.subirCanal();
        smartTv.diminuirCanal();
        smartTv.subirCanal();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();        
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.escolherCanal(24);
        smartTv.ligarTv();

        System.out.println("----------Depois dos ajustes-------------");

        System.out.println("Status Atual da TV....");
        System.out.println("A Smart Tv está ligada ? " + smartTv.ligada);
        System.out.println("A Smart Tv está em qual canal? " + smartTv.canal);
        System.out.println("A Smart Tv está em qual volume? " + smartTv.volume);

    }
}
