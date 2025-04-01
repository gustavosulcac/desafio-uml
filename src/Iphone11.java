public class Iphone11 implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void ligar() {
        System.out.println("Ligando... no Iphone 11");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo... no Iphone 11");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz... no Iphone 11");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página... no Iphone 11");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba... no Iphone 11");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página... no Iphone 11");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música... no Iphone 11");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música... no Iphone 11");
    }

    @Override
    public void seleccionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }
}