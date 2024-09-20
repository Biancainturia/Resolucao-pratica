import javax.swing.JOptionPane;

public class ElevarAoQuadrado {
    public static void main(String[] args) {
        // Solicita que o usuário insira um número inteiro por meio de um diálogo
        String input = JOptionPane.showInputDialog(null, "Digite um número inteiro:");
        
        // Converte a entrada do usuário (String) para um número inteiro
        int numero = Integer.parseInt(input);
        
        // Calcula o quadrado usando Math.pow
        double resultado = Math.pow(numero, 2);
        
        // Exibe o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "O quadrado de " + numero + " é: " + resultado);
    }
}
