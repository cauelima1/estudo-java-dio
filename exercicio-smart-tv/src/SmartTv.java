public class SmartTv {


    static boolean ligada = false;
    int canal = 1;
    int volume = 24;

    public void ligarTv(){
        SmartTv.ligada = true;
    }

    public void desligarTV(){
        SmartTv.ligada = false;
    }

    public void subirCanal(){
         canal++;
        System.out.println("Canal aumentado para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal diminuido para: " + canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume dimiuido para: " + volume);
    }

    public void escolherCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("O canal escolhido é: " + canal);
    }



}

