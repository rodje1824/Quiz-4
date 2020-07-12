/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_4;
import javax.swing.*;
/**
 *
 * @author DOTR
 */
public class Quiz_4 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
      
       String Words = JOptionPane.showInputDialog("Input a sentence: ");
        int Lenght = Words.length();
        
        while (Lenght > 0) {
            int counter = 1;
            String sentence = Words, input;
            char i;
            
            input = JOptionPane.showInputDialog("The sentence is: " + Words + "\n" + "Y to remove the last word or N if no: " + "\n");
            i = input.charAt(0);

           switch (i) {
               case 'Y':
               case 'y':
                   Lenght = Lenght - 1;
                   char ch = Words.charAt(Lenght);
                   while (ch != ' ') {
                       counter++;
                       if (Lenght == 0){
                           Lenght++;
                           JOptionPane.showMessageDialog(null, "Sentence has been removed");
                           return;
                       }
                       Lenght = Lenght - 1;
                       ch = Words.charAt(Lenght);
                   }  Words = Words.substring(0, Words.length() - counter);
                   JOptionPane.showMessageDialog(null, "Input Sentence:\n" + sentence + "\n"+ "\nNew Sentence: \n" + Words);
                   break;
               case 'N':
               case 'n':
                   JOptionPane.showMessageDialog(null, "End Program");
                   return;
               default:
                   JOptionPane.showMessageDialog(null, "Invalid Input");
                   break;
           }
        }
        
    }
    
}
