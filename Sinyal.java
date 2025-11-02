package Smtrue;

public class Sinyal {
	private boolean aktif = false;
	
	public void yak(String yön) {
		aktif = true;
		System.out.println(yön + "Sinyal Yandı");
	}
	
	public void  kapat (String yön) {
		aktif = false;
		System.out.println(yön + "Sinyal Kapandı");
		
	}
	
	public boolean isaktif() {
		return aktif;
		
	}

}
