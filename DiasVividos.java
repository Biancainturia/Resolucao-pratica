import javax.swing.JOptionPane;

public class DiasVividos {
    public static void main(String[] args) {
        // Solicita a idade do usuário
        String idadeTexto = JOptionPane.showInputDialog("Digite sua idade:");

        // Converte a entrada de String para double
        double idade = Double.parseDouble(idadeTexto);

        // Aproximando o número de dias por ano (considerando anos bissextos)
        double diasPorAno = 365.25;

        // Calcula o número de dias vividos
        double diasVividos = idade * diasPorAno;

        // Arredonda o resultado para o número inteiro mais próximo
        int diasVividosAproximado = (int) Math.round(diasVividos);

        // Exibe o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "Você viveu aproximadamente " + diasVividosAproximado + " dias.");
    }
}
