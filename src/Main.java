public class Main {
    public static void main(String[] args) {
        Iphone11 iphone11 = new Iphone11();
        iphone11.tocarMusica();
        iphone11.pausarMusica();
        iphone11.ligar();
        iphone11.atender();
        iphone11.iniciarCorreioVoz();

        System.out.println("");

        Iphone14 iphone14 = new Iphone14();
        iphone14.tocarMusica();
        iphone14.pausarMusica();
        iphone14.ligar();
        iphone14.atender();
        iphone14.iniciarCorreioVoz();
    }
}