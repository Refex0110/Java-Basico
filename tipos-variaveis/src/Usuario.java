public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligado);
        System.out.println("Canal atual " + smartTv.canal);
        System.out.println("Volume atual " + smartTv.volume);
        smartTv.ligar();
        System.out.println("TV ligada ? " + smartTv.ligado);
        smartTv.desligar();
        System.out.println("TV ligada ? " + smartTv.ligado);
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume " + smartTv.volume);

        System.out.println(smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println(smartTv.canal);

    }
}
