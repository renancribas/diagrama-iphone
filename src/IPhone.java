import apps.NavegadorInternet;
import apps.ReprodutorMusical;
import apps.Telefone;
  
public class IPhone implements NavegadorInternet, ReprodutorMusical, Telefone {    

    public void ligar() {
        //Implementação para ligar o iPhone
        System.out.println("Apple");
    }

    
    public void desligar() {
        // Implementação para desligar o iPhone
        System.out.println(" Desligando o iPhone");       
    }

    @Override
    public void fazerLigacao() {
        // Implementação para fazer uma ligação       
    }

    @Override
    public void enviarMensagem() {
        // Implementação para enviar uma mensagem
        System.out.println(" ");       
    }

    @Override
    public void abrirNavegador() {
        // Implementação para abrir o navegador
        System.out.println(" ");       
    }

    @Override
    public void reproduzirMusica() {
        // Implementação para reproduzir música
        System.out.println(" ");
    }

    @Override
    public void pausarMusica() {
            System.out.println(" ");
    }

    @Override
    public void iniciarCorreioVoz() {
            System.out.println(" ");
    }

    @Override
    public void adicionarNovaAba() {
    }


    @Override
    public void atenderLigacao() {
    }


    @Override
    public void desligarLigacao() {
    }


    @Override
    public void selecionarMusica() {
    }


    @Override
    public void atualizarPagina() {
    }
}
