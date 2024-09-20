import javax.swing.JOptionPane;

public class DivisaoNumeros {
    public static void main(String[] args) {
        // Ler o dividendo
        String input1 = JOptionPane.showInputDialog("Digite o dividendo (número inteiro):");
        int dividendo = Integer.parseInt(input1);

        // Ler o divisor
        String input2 = JOptionPane.showInputDialog("Digite o divisor (número inteiro):");
        int divisor = Integer.parseInt(input2);

        // Calcular quociente e resto
        int quociente = dividendo / divisor;
        int resto = dividendo % divisor;

        // Exibir os resultados
        JOptionPane.showMessageDialog(null, "Dividendo: " + dividendo + 
                                            "\nDivisor: " + divisor + 
                                            "\nQuociente: " + quociente + 
                                            "\nResto: " + resto);
    }
}
