import javax.swing.JOptionPane;

public class Modul1Fase4App {

	public static void main(String[] args) {
		
		final int ANY=1948;
		int contador=0;
		boolean comprobacio=false;
		String correcte="El meu any de naixement es de trasp�s";
		String incorrecte="El meu any de naixement  no es de trasp�s";
		
		String nom=JOptionPane.showInputDialog("Introdueix el teu nom");
		String cognom=JOptionPane.showInputDialog("Introdueix els teus cognoms");
	    String dia=JOptionPane.showInputDialog("Introdueix el dia de naixement");
	    String mes=JOptionPane.showInputDialog("Introdueix el teu mes de naixement");
	    String naixement=JOptionPane.showInputDialog("Introdueix el teu any de naixement");
	    
	    int anyNaixement = Integer.parseInt(naixement);
		for(int i=ANY;i<=anyNaixement;i++){
			if((i % 4 == 0)&&(i % 100 != 100)|| (i % 400 == 0))
			{
			System.out.println("any " + i);
			contador++;	
			if(i == anyNaixement){
				comprobacio = true;
				
			}
		}
		}
			System.out.println("El total d'anys de trasp�s entre " + ANY + " y " + anyNaixement + ""
			+ " son " + contador);
			
			System.out.println("El meu nom �s " + nom + " " + cognom);
			System.out.println("Vaig neixer el "+ dia+"/"+mes+"/" + naixement);
			if (comprobacio == true){
				System.out.println(correcte);
			}
			else{
				System.out.println(incorrecte);
				
			}
	}
	
	}
	

