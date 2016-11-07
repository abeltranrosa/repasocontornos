
package creandoramas2;

import javax.swing.JOptionPane;


public class CreandoRamas2 {

   
    public static void main(String[] args) {
        float base;
        float altura;
        float area;
        
        base=Float.parseFloat(JOptionPane.showInputDialog("base"));
        altura=Float.parseFloat(JOptionPane.showInputDialog("altura"));
        area=base*altura/2;
        System.out.println("area es:"+(base*altura));
        
        //decido si hacer un triangulo o un rectangulo
    }
    
}
