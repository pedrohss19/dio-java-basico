package condicionais;
public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(saldo > valorSolicitado)
            saldo = saldo - valorSolicitado;
        
        System.out.println(saldo);
    }
}
