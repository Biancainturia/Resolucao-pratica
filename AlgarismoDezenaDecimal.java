import javax.swing.JOptionPane;

public class AlgarismoDezenaDecimal {
    public static void main(String[] args) {
        // Solicita ao usuário que insira um número decimal com 3 casas decimais
        String input = JOptionPane.showInputDialog("Digite um número decimal com até 3 casas decimais (exemplo: 123.456):");
        
        try {
            // Converte a entrada para um número decimal
            double numero = Double.parseDouble(input);

            // Converte o número decimal para inteiro (ignora a parte decimal)
            int numeroInteiro = (int) numero;

            // Verifica se o número está no intervalo permitido
            if (numeroInteiro >= 100 && numeroInteiro <= 999) {
                // Extrai o algarismo da casa das dezenas
                int dezenas = (numeroInteiro / 10) % 10;
                // Exibe o algarismo da casa das dezenas
                JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas é: " + dezenas);
            } else {
                JOptionPane.showMessageDialog(null, "O número inteiro da parte decimal não está dentro do intervalo permitido (100 a 999).");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número decimal válido.");
        }
    }
}
