public class CaixaEletronico {
    public static void main(String[] args) {
        int nota = 4;
        //Aula de condicionais
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ?  "Recuperação" : "Reprovado";
            System.out.println("Nota: " + nota + " " + resultado);
        

    }    
}
