package aplicativo;

public class Telegram extends ServicoMensagem{

    
    public void EnviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviada Mensagem pelo Telegram");
        
    }

    
    public void ReceberMensagem() {
        System.out.println("Recebida Mensagem pelo Telegram");
        
    }
    
}
