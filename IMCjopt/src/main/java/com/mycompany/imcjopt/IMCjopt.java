/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imcjopt;
import javax.swing.JOptionPane;
/**
 *
 * @author danilo
 */
public class IMCjopt {

    public static void main(String[] args) {
     
     String peso1;
     String altura1;
     
        float peso;
        float altura;
        float IMC;
        
        peso1=JOptionPane.showInputDialog("Insira deu peso:" );
        altura1=JOptionPane.showInputDialog("Digite sua altura:");
        peso=Float.parseFloat(peso1);
        altura=Float.parseFloat(altura1);
        
        IMC=peso/(altura*altura);
        
        if (IMC >=30){
            JOptionPane.showMessageDialog(null,"O seu imc é de:[] voce esta um pouco acima do peso "+IMC,
                    "Resultado",JOptionPane.PLAIN_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,"Voce esta magro seu imc é de: "+IMC,"Resultado",JOptionPane.PLAIN_MESSAGE);
        }
            
        
      
        System.exit(0);
        
        
        
        
            
            
    }
}
