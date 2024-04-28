import java.util.*;

public class ContaTerminal {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int     numero;
        String  agencia;
        String  nomeCliente;
        Float  saldo;
        
        System.out.println("Por favor, digite o número da conta!");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da agência!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo!");
        saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
