public class Strings {
    public static void main(String[] args) {
        String txt1 = "Ola aa Pessoal aa do aa IOS";
        String txt2 = "";
        String txt3 = "     Ola mundo!   ";

        // Verifica se a string está vazia
        System.out.println("String txt1 esta vazia? " + txt1.isEmpty());
        System.out.println("String txt2 esta vazia? " + txt2.isEmpty());

        System.out.println("Ultima posicao do aa: " + txt1.lastIndexOf("aa"));

        // Substituir algo na string
        String txt4 = txt1.replace('a', 'x');
        System.out.println(txt4);

        // Retirar espaços no inicio e no final
        System.out.println("String original: " + txt3);
        System.out.println("String sem espacos: " + txt3.trim());
    }
}
