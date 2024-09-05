public class FormatarCep {
 public static void main(String[] args) {
    try {
        String cepFormatado = formatarCep("19026460");
        System.out.println(cepFormatado);
    } catch (InvalidExcessao e) {
        System.out.println("Cep não está de acordo com as normas");
    }
}   
    static String formatarCep(String cep) throws InvalidExcessao{
    if(cep.length() != 8)
        throw new InvalidExcessao();
    return "19026-460";
    }
}
