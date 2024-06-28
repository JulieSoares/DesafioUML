public class iphone implements Musical, AparelhoTelefonico, Navegador {

    //ReprodutorMusical
    
    public void tocar() {
        System.out.println("Reproduzindo música");
    }


    public void pausar() {
        System.out.println("Música pausada");
    }

    
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    //AparelhoTelefonico
    
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    //NavegadorInternet
    
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public static void main(String[] args) {
        iphone meuIphone = new iphone();

        // Teste reprodutor musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("The Summoning - Sleep Token");

        // Teste aparelho telefônico
        meuIphone.ligar("912345678");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Teste navegador de internet
        meuIphone.exibirPagina("www.trilha-java-basico-dio.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
