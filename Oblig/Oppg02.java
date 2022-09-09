package Oblig;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppg02 {

	public static void main(String[] args) {
		
		
		String karakter = "";	
		
for (int elev =1; elev <=10; elev++) {
	
	String poengTxt = showInputDialog("Oppgi poengsum:");
	int poeng = parseInt(poengTxt);
	
	
		if (100>= poeng && poeng > 89) {
			karakter = "Karakter: A";
		}
		else if (89>= poeng && poeng > 79) {
				karakter = "Karakter: B";
			}
		
	else if (79>= poeng && 59 < poeng) {
			karakter = "Karakter: C";
			
		} else if (59>= poeng && 49 < poeng) {
			karakter = "Karakter: D";
		} 
		else if (49 >= poeng && 39 < poeng) {
			karakter = "Karakter: E";
		} else if (39>= poeng && poeng >0) {
			karakter = "Karakter: F";
		}
		else {
			
			poengTxt = showInputDialog("Feil, prøv igjen:");
			poeng = parseInt(poengTxt);
		}
		showMessageDialog(null, karakter );
		}
		
		}
		
}
  //FERDIG!!