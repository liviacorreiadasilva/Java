import java.util.Scanner; // Importa a classe Scanner

public class Main {
    public static void main(String[] args) {
      
        
        
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada padrão (teclado)
        System.out.print("Digite seu nome: "); // Exibe uma mensagem para o usuário
        String nome = scanner.nextLine(); // Lê a linha digitada pelo usuário e a armazena na variável nome
        
        System.out.print("Digite sua idade: "); 
        int anos = scanner.nextInt(); 
        
        System.out.print("Digite o mês que você nasceu: "); 
        int meses = scanner.nextInt(); 

        System.out.print("Digite o ano que você nasceu: "); 
        int dias = scanner.nextInt(); 
        
        
        int total = (anos * 365) + (meses * 30) + dias;
        System.out.println(nome + " tem " + anos + " anos e " + meses + " meses. Sendo assim, você já viveu por "  + total + " dias.");
        
        scanner.close(); // Fecha o Scanner para liberar recursos
    }
}


