import javax.swing.JOptionPane;

public class EX12 {
    public static void main(String[] args) {
        // Solicitar a data no formato dd/mm/aa
        String data = JOptionPane.showInputDialog("Entre com uma data no formato dd/mm/aa:");
        
        // Separar o dia, mês e ano
        String[] partesData = data.split("/");

        // Atribuir dia, mês e ano a variáveis individuais
        String dia = partesData[0];
        String mes = partesData[1];
        String ano = partesData[2];

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "Dia: " + dia + "\nMês: " + mes + "\nAno: " + ano);
    }
}
