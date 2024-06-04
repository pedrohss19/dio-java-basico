package aplicativo;

public class MSNMensagem extends ServicoMensagem {

    
    public void EnviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviada Mensagem pelo MSN");
        
    }

    
    public void ReceberMensagem() {
        System.out.println("Recebida Mensagem pelo MSN");
        
    }
    
}
