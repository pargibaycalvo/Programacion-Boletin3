
package boletin3_1;

import javax.swing.JOptionPane;

public class Boletin3_1 {

    public static void main(String[] args) {
        //Centralita
        centralita cen1 = new centralita();
        cen1.setLitros (50f);
        cen1.setPGas (1.50f);
    
        centralita cen2 = new centralita ();
        cen2.setKms(Float.parseFloat(JOptionPane.showInputDialog("Kilometros recorridos ")));
        cen2.setLitros (Float.parseFloat(JOptionPane.showInputDialog("Litros recorrido ")));
        cen2.setPGas (Float.parseFloat(JOptionPane.showInputDialog("Precio Gasoil gastados ")));
        cen2.setvMed (Float.parseFloat(JOptionPane.showInputDialog("Velocidad media recorrida ")));
        
        System.out.println("Consumo medio = "+cen2.consumomedio()+ "  l por 100 km "); //consumo medio por cada 100km
        cen2.setLitros(Float.parseFloat(JOptionPane.showInputDialog("Cantidad de litros ")));
        System.out.println("Velocidade Media = "+cen2.getvMed()+ " km/h");
    }
}
    

