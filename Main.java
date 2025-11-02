package Smtrue;

public class Main {

	public static void main(String[] args) {
		Araba togg = new Araba("Togg T10F");
		
		togg.aracSağaDöndü(false);
		System.out.println();
		
		togg.surucusağaSinyalVer();
		togg.aracSağaDöndü(true);
		System.out.println();
		
		
		togg.aracSolaDöndü(false);
		System.out.println();
		
		
		togg.surucusağaSinyalVer();
		togg.aracSağaDöndü(true);
		System.out.println();
		

	}

}
