import javax.swing.JOptionPane;

public class EmbaralharFrases {

    public static void main(String[] args) {
        // Lê as três frases usando JOptionPane
        String frase1 = JOptionPane.showInputDialog("Digite a primeira frase:");
        String frase2 = JOptionPane.showInputDialog("Digite a segunda frase:");
        String frase3 = JOptionPane.showInputDialog("Digite a terceira frase:");

        // Divide as frases ao meio
        String[] partesFrase1 = dividirAoMeio(frase1);
        String[] partesFrase2 = dividirAoMeio(frase2);
        String[] partesFrase3 = dividirAoMeio(frase3);

        // Concatena as partes na ordem especificada
        String fraseEmbaralhada = partesFrase2[0] + partesFrase3[1] + partesFrase2[1] + partesFrase1[0] + partesFrase3[0] + partesFrase1[1];

        // Concatena as frases originais
        String frasesConcatenadas = frase1 + frase2 + frase3;

        // Mostra os resultados usando JOptionPane
        JOptionPane.showMessageDialog(null, "Frases concatenadas:\n" + frasesConcatenadas);
        JOptionPane.showMessageDialog(null, "Frase embaralhada:\n" + fraseEmbaralhada);
    }                                               

    // Função para dividir uma frase ao meio
    public static String[] dividirAoMeio(String frase) {
        int meio = frase.length() / 2;
        String primeiraMetade = frase.substring(0, meio);
        String segundaMetade = frase.substring(meio);
        return new String[] { primeiraMetade, segundaMetade };
    }
}
