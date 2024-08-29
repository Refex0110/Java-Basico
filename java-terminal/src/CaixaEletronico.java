public class CaixaEletronico {
    public static void main(String[] args) {
        // int nota = 4;
        //Aula de condicionais
        // String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ?  "Recuperação" : "Reprovado";
        //     System.out.println("Nota: " + nota + " " + resultado);
        String sigla = "A";
        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Médio");
                break;
            case "G": case "B":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Indefinido!");
                break;
        }

    }    
}
    