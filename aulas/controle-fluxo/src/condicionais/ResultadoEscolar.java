package condicionais;
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 4;

        /**se houver mais de uma instrução usar "{}"
        if (nota >= 7) 
            System.out.println("Aprovado");

        else if(nota >= 5 && nota < 7)
            System.out.println("Prova de recupereção");
              
        else
            System.out.println("Reprovado");
        **/

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Recuperação";
        System.out.println(resultado);
    }
}
