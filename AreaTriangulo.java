import javax.swing.JOptionPane;

public class AreaTriangulo {
    public static void main(String[] args) {
        // Solicita a base do triângulo
        String baseString = JOptionPane.showInputDialog("Digite a base do triângulo:");
        double base = Double.parseDouble(baseString);
        
        // Solicita a altura do triângulo
        String alturaString = JOptionPane.showInputDialog("Digite a altura do triângulo:");
        double altura = Double.parseDouble(alturaString);
        
        // Calcula a área do triângulo
        double area = (base * altura) / 2;
        
        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);
    }
}
