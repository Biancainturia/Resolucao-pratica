import javax.swing.JOptionPane;

public class StringLengthSum {
    public static void main(String[] args) {
        // Ler as três strings usando JOptionPane
        String str1 = JOptionPane.showInputDialog("Digite a primeira string:");
        String str2 = JOptionPane.showInputDialog("Digite a segunda string:");
        String str3 = JOptionPane.showInputDialog("Digite a terceira string:");

        // Calcular a soma dos comprimentos das strings
        int totalLength = str1.length() + str2.length() + str3.length();

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "A soma do comprimento das três strings é: " + totalLength);
    }
}
