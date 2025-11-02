package Smtrue;

public class Araba {
	
	private String  marka;
	private Sinyal sağaSinyal;
	private Sinyal solaSinyal;
	private boolean surucuSinyalVerdiMi;
	
	public Araba(String marka) {
		this.marka = marka;
		this.sağaSinyal = new Sinyal();
		this.solaSinyal = new Sinyal();
	}
	
	public void surucusağaSinyalVer() {
		surucuSinyalVerdiMi = true;
		sağaSinyal.yak("Sağa");
	}
	
	
	public void surucusolaSinyalVer() {
		surucuSinyalVerdiMi = true;
		solaSinyal.yak("Sola");
	}
	
	public void aracSolaDöndü(boolean surucuSinyalVerdi) {
		if (! surucuSinyalVerdi) {
			System.out.println("Sürücü Sinyal Vermedi Sistem Devreye Giriyor...");
			solaSinyal.yak("Sola (Otomatik) ");
		}
		else {
			System.out.println("Sürücü Zaten Sinyalverdi, Sistem devredışı.");
		}
	}
	
	
	
	public void aracSağaDöndü(boolean surucuSinyalVerdi) {
		if (! surucuSinyalVerdi) {
			System.out.println("Sürücü Sinyal Vermedi Sistem Devreye Giriyor...");
			solaSinyal.yak("Sağa (Otomatik) ");
		}
		else {
			System.out.println("Sürücü Zaten Sinyalverdi, Sistem devredışı.");
		}
	}
	

}
