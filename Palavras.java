import javax.swing.JOptionPane;
public class Palavras
 {
     public static void main(String[] args)
     {
          //lendo os dados 
          String sPalavra1 = JOptionPane.showInputDialog(
            "Digite sua primeira palavra:");
          String sPalavra2 = JOptionPane.showInputDialog(
             "Digite sua segunda palavra:");
          String sPalavra3 = JOptionPane.showInputDialog(
              "Digite sua terceira palavra:");
           
           //apresentando o resultado
           JOptionPane.showMessageDialog(null, "Palavras Invertida = " + sPalavra3 + " " + sPalavra2 + " " + sPalavra1);
     }
 }