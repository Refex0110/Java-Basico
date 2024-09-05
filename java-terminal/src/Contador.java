import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class Contador{
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }        
    
    }
    public static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;
            do{
                atendeu = atender();
                continuarTentando = !atendeu;
                if(continuarTentando)
                    tentativasRealizadas++;
                else
                System.out.println("Contato Realizado com Sucesso");
            }while(continuarTentando && tentativasRealizadas < 3);
            if (atendeu)
                System.out.println("Conseguimos contato com o(a) " + candidato + " na " + tentativasRealizadas + " tentativa");
            else
            System.out.println("Não conseguimos entrar em contato com o(a) " + candidato + ", numero maximo de tentaivas " + tentativasRealizadas + " realizadas.");
            
    }

    //Método auxiliar
    public static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    public static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de numero " + (indice+1) + " é " + 
            candidatos[indice]);
        }
        System.out.println("Forma abriada de interação for each");
        for(String candidato: candidatos)
            System.out.println("O candidado selecionado foi " + candidato);
    }
    public static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Joao"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato =  candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + "\nSolicitou este valor de Salario: " + salarioPretendido);
            if (salarioBase > salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecinado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    public static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido)
            {System.out.println("Ligar para o Candidato");}
        else
            if(salarioBase == salarioPretendido)
                System.out.println("Ligar para o candidato com contra proposta");
            else
                System.out.println("Aguardando resultados dos demais candidatos");
    }
    
}
