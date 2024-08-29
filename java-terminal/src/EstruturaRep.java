public class EstruturaRep {
    public static void main(String[] args) {
        // for(int i = 1; i <= 20; i++)
        //     System.out.println("Contando carneirinhos: " + i);
        // System.out.println("Joazinho dormiu");    
        
        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};
        // for(int i = 0; i < alunos.length; i++)
        //     System.out.println(alunos[i]);
        //print do que está no array
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
        // continue; da um "skip" no comando
    }
    
}
