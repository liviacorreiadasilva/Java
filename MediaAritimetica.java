public class Main {
    public static void main(String[] args) {
        // declara as variaveis//
        int media_987;
        int media_456;
        double media_geral;
        
        //declara os valores//
        media_987 = (9 + 8 + 7) / 3;
        media_456 = (4 + 5 + 6) / 3;
        media_geral = (media_987 + media_456) / 2;
        //imprime//
        System.out.println("Média entre 9, 8 e 7: " + media_987);
        System.out.println("Média entre 4, 5 e 6: " + media_456);
        System.out.println("Média das médias....: " + media_geral);
    }
}
