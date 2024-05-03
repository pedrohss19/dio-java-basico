package repeticoes;
public class ExemploForArry {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        //Em arays o indice começa em ZERO

        for( int x = 0; x < alunos.length; x ++){

            System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
        }

        for(String aluno : alunos){
            System.out.println("Nome do alunos é " + aluno);
        }
    }
}
