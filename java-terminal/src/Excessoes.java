import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class Excessoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try{
            System.out.println("Digite seu nome:");
            String nome = scanner.next(); 
            
            System.out.println("Digite seu sobrenome");
            String sobrenome =  scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();


            System.out.println(nome + " " + sobrenome);
            System.out.println(idade);
            System.out.println(altura);
            scanner.close();    
                
    }catch(InputMismatchException e){
            System.out.println("Digite os campos de idade de altura com elementos numéricos");
    }

    }
}
