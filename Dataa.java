import javax.swing.JOptionPane;
public class Dataa 
 { 
    public static void main(String[] arg)
    {
       //lendo os dados 
        String sDia = JOptionPane.showInputDialog(
        "Digite a data que voce nasceu:");
        String sMes = JOptionPane.showInputDialog(
        "Digite o mes que voce nasceu:");
        String sAno = JOptionPane.showInputDialog(
        "Digite o ano que voce nasceu:");
        
        //convertendo para reais 
        int dia = Integer.parseInt(sDia);
        int mes = Integer.parseInt(sMes);
        int ano = Integer.parseInt(sAno);
        
        //apresentando o resultado
        JOptionPane.showMessageDialog(null,"A data do seu aniversário é:" + " " + dia + "/ " + mes + "/ " + ano);
     }
 }