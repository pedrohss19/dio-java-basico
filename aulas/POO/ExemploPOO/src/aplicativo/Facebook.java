package aplicativo;

public class Facebook extends ServicoMensagem {

    
    public void EnviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviada Mensagem pelo Facebook");
        
    }

    
    public void ReceberMensagem() {
        System.out.println("Recebida Mensagem pelo Facebook");
        
    }


    
}
