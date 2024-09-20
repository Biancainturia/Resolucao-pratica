import javax.swing.JOptionPane;

public class Logaritmo {
    public static void main(String[] args) {
        try {
            // Solicita ao usuário o número e a base
            String numeroStr = JOptionPane.showInputDialog("Digite o número para calcular o logaritmo:");
            String baseStr = JOptionPane.showInputDialog("Digite a base do logaritmo:");

            // Converte as entradas para double
            double numero = Double.parseDouble(numeroStr);
            double base = Double.parseDouble(baseStr);

            // Calcula o logaritmo
            double logaritmo = Math.log(numero) / Math.log(base);

            // Exibe o resultado
            JOptionPane.showMessageDialog(null, String.format("O logaritmo de %.4f na base %.4f é %.4f", numero, base, logaritmo));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro de cálculo. Verifique se o número e a base são válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
