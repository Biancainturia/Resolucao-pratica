import javax.swing.JOptionPane;
import java.lang.Math;

public class Trigonometria {

    // Função para converter graus para radianos
    public static double grausParaRadianos(double graus) {
        return Math.toRadians(graus);
    }

    // Função principal para calcular e exibir as funções trigonométricas
    public static void main(String[] args) {
        // Obtendo o ângulo do usuário
        String input = JOptionPane.showInputDialog("Digite o ângulo em graus:");
        double anguloGraus = Double.parseDouble(input);

        // Convertendo para radianos
        double anguloRadianos = grausParaRadianos(anguloGraus);

        // Calculando as funções trigonométricas
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);

        // Calculando secante, cossecante e cotangente
        double secante = (cosseno != 0) ? 1 / cosseno : Double.POSITIVE_INFINITY;
        double cossecante = (seno != 0) ? 1 / seno : Double.POSITIVE_INFINITY;
        double cotangente = (tangente != 0) ? 1 / tangente : Double.POSITIVE_INFINITY;

        // Criando a mensagem a ser exibida
        String mensagem = String.format(
            "Ângulo: %.2f graus\n" +
            "Seno: %.4f\n" +
            "Cosseno: %.4f\n" +
            "Tangente: %.4f\n" +
            "Secante: %.4f\n" +
            "Cossecante: %.4f\n" +
            "Cotangente: %.4f",
            anguloGraus, seno, cosseno, tangente, secante, cossecante, cotangente
        );

        // Exibindo a mensagem
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
