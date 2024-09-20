import javax.swing.JOptionPane;

public class AreaLosango {
    public static void main(String[] args) {
        // Entrada: solicitar ao usuário a diagonal maior e menor
        String diagonalMaiorStr = JOptionPane.showInputDialog("Informe o valor da diagonal maior do losango:");
        String diagonalMenorStr = JOptionPane.showInputDialog("Informe o valor da diagonal menor do losango:");

        // Converter as diagonais de String para double
        double diagonalMaior = Double.parseDouble(diagonalMaiorStr);
        double diagonalMenor = Double.parseDouble(diagonalMenorStr);

        // Cálculo da área do losango
        double area = (diagonalMaior * diagonalMenor) / 2;

        // Saída: mostrar a área calculada
        JOptionPane.showMessageDialog(null, "A área do losango é: " + area);
    }
}
