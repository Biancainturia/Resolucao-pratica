import javax.swing.JOptionPane;

public class AreaCirculo {
    public static void main(String[] args) {
        // Definir a constante PI
        final double PI = 3.14159;

        // Solicitar o raio do círculo ao usuário
        String inputRaio = JOptionPane.showInputDialog("Digite o valor do raio do círculo:");
        double raio = Double.parseDouble(inputRaio);

        // Calcular a área do círculo
        double area = PI * raio * raio;

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "A área do círculo é: " + area);
    }
}
