import javax.swing.JOptionPane;
public class Numero
 {
     public static void main(String[] args)
     {
        //lendo os dados 
        String sNumero = JOptionPane.showInputDialog(
            "Digite um Número");
            
         //convertendo para reais 
         int numero = Integer.parseInt(sNumero);
         
         //apresentando o resultado 
         JOptionPane.showMessageDialog(null,"O valor do número digitado é:" + " " + numero);
         
      }
      
      
 }