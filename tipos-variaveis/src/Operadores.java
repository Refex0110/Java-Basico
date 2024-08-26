public class Operadores {
    public static void main(String[] args) {
        boolean verdade = true; 
        verdade = !verdade; //converto o valor para o inverso

        //if else abreviado
        int a, b;
        a = 6;
        b = 6;
        String resultado = a==b ?"verdadeiro" : "falso";
                            // se sim       se não
        System.out.println(resultado);
        //objeto usa .equals() para comparar
        String nomeUm = "Rafael";
        String nomeDois = new String("Rafael");
    }   
}
