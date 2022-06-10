import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String txt = "Ola Pessoal do IOS";
        // imprime o tamanho da string
        System.out.println("O tamanho da string txt e: " + txt.length());
        // imprime os caracteres da string em maiusculo
        System.out.println(txt.toUpperCase());
        //imprime os caracteres da string em minusculo
        System.out.println(txt.toLowerCase());
        //imprime a posicao da primeira ocorrencia de um valor na string
        System.out.println(txt.indexOf("s"));
        System.out.println(txt.indexOf("IO"));
        // não encontra o texto na string
        System.out.println(txt.indexOf("io")); // Case Sensitive
    }
}
