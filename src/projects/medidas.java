
package projects;

import javax.swing.JOptionPane;


public class medidas {
     public static void main(String args[]){
     
         double conversion=0;
         int opcion=0;
         do{
         JOptionPane.showMessageDialog(null,"Elija una opcion: \n1.-Convertir de pulgadas a cm"
                 + "\n2.-Convertir de cm a pulgadas "+
                 "\n3.-Salir");
         opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion: "));
         if(opcion==1){
         
         double pulgadas=Double.parseDouble(JOptionPane.showInputDialog("Ingrese las pulgadas: "));
         conversion=pulgadas*2.54;
         JOptionPane.showMessageDialog(null,pulgadas+"pulgada(s) convertida a cm es"
                 + " igual a: "+conversion+" cm"); 
         }
         if(opcion==2){
         
             double cm=Double.parseDouble(JOptionPane.showInputDialog("Ingrese los cm: "));
             conversion=cm*2.54;
             JOptionPane.showMessageDialog(null,cm+" cm convertida a pulgadas es"
                 + " igual a: "+conversion+" pulgada (s)");
         }
          }while(opcion!=3);
         JOptionPane.showMessageDialog(null, "Programa finalizado!");
     }
}
