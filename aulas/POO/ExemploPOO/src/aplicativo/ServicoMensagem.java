package aplicativo;


public abstract class ServicoMensagem {
    
    public abstract void EnviarMensagem();

    public abstract void ReceberMensagem();

    protected void validarConectadoInternet() { 
    System.out.println("Validando se está conectado a internet");
    }
}
