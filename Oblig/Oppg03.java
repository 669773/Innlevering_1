package Oblig;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppg03 {

	public static void main(String[] args) {
	
		String nTxt = showInputDialog("Oppgi et positivt tall:");
		int n = parseInt(nTxt);
int i,fact=1;
String feil = "Ugyldig tall";

//om n er negativt:
if (n<=0) {
	showMessageDialog(null, feil);
	
}
else {
//utregning av n!
for (i=1; i<= n; i++) {
	fact = fact*i;
}
String hei = "Fakultet av ";
String ho = " er: ";
showMessageDialog(null, hei + n + ho + fact);
	}
	}

}
//Tror jeg er ferdig, men usikker, matte er vanskelig
