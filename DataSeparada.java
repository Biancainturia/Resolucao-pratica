import javax.swing.JOptionPane;

public class DataSeparada {
    public static void main(String[] args) {
        // Entrada da data no formato ddmmaa
        String inputData = JOptionPane.showInputDialog("Entre com a data no formato ddmmaa:");

        // Conversão da string para inteiro
        int data = Integer.parseInt(inputData);

        // Separando dia, mês e ano
        int dia = data / 10000;
        int mes = (data / 100) % 100;
        int ano = data % 100;

        // Exibindo os resultados
        JOptionPane.showMessageDialog(null, "Dia: " + dia + "\nMês: " + mes + "\nAno: " + ano);
    }
}
