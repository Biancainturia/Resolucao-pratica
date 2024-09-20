import javax.swing.JOptionPane;

public class AreaRetangulo {
    public static void main(String[] args) {
        // Solicitar a base e altura ao usuário usando JOptionPane
        String baseString = JOptionPane.showInputDialog("Digite o valor da base do retângulo:");
        String alturaString = JOptionPane.showInputDialog("Digite o valor da altura do retângulo:");
        
        // Converter as entradas de String para double
        double base = Double.parseDouble(baseString);
        double altura = Double.parseDouble(alturaString);
        
        // Calcular a área
        double area = base * altura;
        
        // Exibir o resultado em uma janela de diálogo
        JOptionPane.showMessageDialog(null, "A área do retângulo é: " + area);
    }
}
