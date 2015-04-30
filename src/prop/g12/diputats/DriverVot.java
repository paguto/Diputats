package prop.g12.diputats;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DriverVot {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdueix 0 per provar el constructor de la classe Vot\n"
			+ "Introdueix 1 per provar getVot\n "
			+ "Introdueix 2 per provar getDiputat\n"
			+ "Introdueix 3 per provar getVotacio\n"
			+ "Introdueix -1 per a finalitzar l'execucio\n");
		int opt = sc.nextInt();
		sc.nextLine();
	
		Vot vot = new Vot();
		String tipusVot;
	
		boolean b = true;
		boolean correcte = true;
		while(b) {
			switch(opt) {
				case 0: 
					System.out.println("Introdueix el tipus de vot (favor/contra/abstencio):");
					while(!sc.hasNext());
					tipusVot = sc.nextLine();
					try {vot.SetVot(tipusVot);}
					catch (Exception ex) { 
						correcte = false;
						ex.printStackTrace(); 
					}
					
					
					StubDiputat sd = new StubDiputat();
					
					Diputat d = new Diputat();
					d.setNom(sd.getNom());
					d.setIdeologia(sd.getIdeologia());
					d.setProcedencia(sd.getProcedencia());
					
					vot.SetDiputat(d);
					
					StubVotacio sv = new StubVotacio();
					
					Votacio v = new Votacio();
					v.setCodi(sv.getCodi());
					v.setDescripcio(sv.getDescripcio());
					v.setData(sv.getData());
					
					vot.SetVotacio(v);
					
					if(correcte) System.out.println("Creat el vot amb tipus" + tipusVot + " del Diputat " + sd.getNom() + " a la Votaci�  " + sv.getCodi());
					
					break;
				case 1:;
				case 2:;
				case 3:;
				case -1:;
				default: 
			}
		}
		sc.close();
	}
}
/*		
		
	public void testVot() {
		votacio = new Vot("favor");
	}
		    
	public void testGetVot() {
		votacio.GetVot();
	}
		
	public void testStringToVot() {
		votacio.StringToVot("prova");
	}
		
	public void testSetVot() {
		votacio.SetVot("abstenci�");
	}

	public void testGetDiputat() {
		votacio.GetDiputat();
	}

	public void testSetDiputat() {
		Diputat dip;
		dip = new Diputat("nom","ideologia","procedencia");
		votacio.SetDiputat(dip);
	}

	public void testGetVotacio() {
		votacio.GetVot();
	}

	public void testSetVotacio() throws ParseException {
		Votacio votacio2;
		Date d2 = sdf2.parse("21/12/2012");
		votacio2 = new Votacio(3,"Votaci� contra els politics", d2);
		votacio.SetVotacio(votacio2);
	}
}*/
