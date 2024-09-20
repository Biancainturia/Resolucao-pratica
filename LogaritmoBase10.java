import javax.swing.JOptionPane;

public class LogaritmoBase10 {
    public static void main(String[] args) {
        // Solicitar ao usuário que insira um número
        String input = JOptionPane.showInputDialog("Digite um número:");
        
        // Converter a entrada para um número
        double numero;
        try {
            numero = Double.parseDouble(input);
            if (numero <= 0) {
                JOptionPane.showMessageDialog(null, "O número deve ser positivo.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número válido.");
            return;
        }
        
        // Calcular o logaritmo na base 10
        double logaritmo = Math.log10(numero);
        
        // Mostrar o resultado
        JOptionPane.showMessageDialog(null, "O logaritmo de " + numero + " na base 10 é " + String.format("%.4f", logaritmo));
    }
}
