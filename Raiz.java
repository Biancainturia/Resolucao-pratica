import javax.swing.JOptionPane;

public class Raiz {
    public static void main(String[] args) {
        // Entrada de dados
        String input = JOptionPane.showInputDialog("Digite um número:");
        
        // Convertendo a entrada para um número
        double numero = Double.parseDouble(input);
        
        // Calculando o quadrado e a raiz quadrada
        double quadrado = Math.pow(numero, 2);
        double raizQuadrada = Math.sqrt(numero);
        
        // Saída de resultados
        String mensagem = String.format("Número: %.2f\nQuadrado: %.2f\nRaiz Quadrada: %.2f", numero, quadrado, raizQuadrada);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
