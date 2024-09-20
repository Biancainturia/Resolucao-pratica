import javax.swing.JOptionPane;

public class EX13 {
    public static void main(String[] args) {
        // Leitura dos números reais a, b e c
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c:"));

        // Cálculo da expressão: x = 2 * ( ( a – c ) / 8 ) – b * 5
        double x = 2 * ((a - c) / 8) - b * 5;

        // Exibindo o resultado
        JOptionPane.showMessageDialog(null, "O resultado de x é: " + x);
    }
}
