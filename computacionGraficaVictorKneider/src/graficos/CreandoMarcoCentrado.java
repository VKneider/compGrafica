package graficos;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado miMarco = new MarcoCentrado();
		miMarco.setDefaultCloseOperation(3);
		miMarco.setVisible(true);

	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado(){
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamaņoPantalla = miPantalla.getScreenSize();
		
		int alturaPantalla = (int) tamaņoPantalla.getHeight();
		int anchoPantalla = (int) tamaņoPantalla.getWidth();
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
	}
}
