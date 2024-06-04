import aplicativo.Facebook;
import aplicativo.MSNMensagem;
import aplicativo.ServicoMensagem;
import aplicativo.Telegram;

public class computador {
    public static void main(String[] args) {
        ServicoMensagem smi = null;

        String appEscolhido = "tlg";

        if (appEscolhido.equals("msn")) 
            smi = new MSNMensagem();
        else if (appEscolhido.equals("tlg"))
            smi= new Telegram();
        else if (appEscolhido.equals("fcb"))
            smi = new Facebook();

        smi.EnviarMensagem();
        smi.ReceberMensagem();
        
    }
}
