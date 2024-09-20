import javax.swing.JOptionPane;

public class CalculoDivida {
    public static void main(String[] args) {
        // Obtendo os valores de entrada do usuário
        String valorInicialStr = JOptionPane.showInputDialog("Digite o valor inicial da dívida:");
        String jurosStr = JOptionPane.showInputDialog("Digite a taxa de juros ao mês (em %):");
        String mesesStr = JOptionPane.showInputDialog("Digite o número de meses:");

        // Convertendo as entradas para os tipos corretos
        double valorInicial = Double.parseDouble(valorInicialStr);
        double juros = Double.parseDouble(jurosStr);
        int meses = Integer.parseInt(mesesStr);

        // Calculando o valor final usando a fórmula de juros compostos
        double valorFinal = valorInicial * Math.pow((1 + juros / 100), meses);

        // Exibindo o resultado
        JOptionPane.showMessageDialog(null, 
            String.format("O valor final da dívida será: R$ %.2f", valorFinal));
    }
}
