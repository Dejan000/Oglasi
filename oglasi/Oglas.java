package oglasi;

public class Oglas {
	
	protected int sifra;
	protected String naslov;
	protected int cena;
	protected int godiste;
	protected String[] oprema = new String[5];
	
	
	
	Oglas() {
		this.sifra = 0;
		this.naslov = "";
		this.cena = 0;
		this.godiste = 0;
		this.oprema[0]= "";
		this.oprema[1]= "";
		this.oprema[2]= "";
		this.oprema[3]= "";
		this.oprema[4]= "";
	}
	public Oglas(int sifra,String naslov, int cena, int godiste) {
		this.sifra = sifra;
		this.naslov = naslov;
		this.cena = cena;
		this.godiste = godiste;
		
	}
	public int getSifra() {
		return this.sifra;
	}
	public String getNaslov() {
		return this.naslov;
	}
	public int getCena() {
		return this.cena;
	}
	public int getGodiste() {
		return this.godiste;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public void setCena(int cena) {
		this.sifra = cena;
	}
	public void setGodiste(int godiste) {
		this.sifra = godiste;
	}
	public  String getOprema() {
		int i = 0;
		String oprema ="";
		while(i<this.oprema.length) {
			oprema += this.oprema[i] + " ";
			i++;
			
			
		}
		return oprema;
		
	}
	
	public static void ispisOglasa(Oglas[] oglas ) {
		int i = 0;
		String ispis = "";
		while(i<oglas.length) {
			 Oglas ispis1 = oglas[i];
			 ispis += (i+1)+ ". " + ispis1.getSifra() + " " + ispis1.getNaslov() + " "
					 + ispis1.getCena() + " " + ispis1.getGodiste() + "\n"	;
			 
			 i++;
				
		}
		System.out.println("Svi oglasi:");
		System.out.println(ispis);
		
	}
	public static void ispisPoGodini(Oglas[] oglas,int godina) {
		int i = 0;
		int godiste;
		String ispis = "";
		while(i<oglas.length) {
			Oglas ispis1 = oglas[i];
			godiste = ispis1.getGodiste();
			if(godiste == godina) {
				ispis += (i+1)+ ". " + ispis1.getSifra() + " " + ispis1.getNaslov() + " "
						 + ispis1.getCena() + " " + ispis1.getGodiste() + "\n"	;
				
			}
			i++;
		}
		System.out.println(ispis);
		
	}
	
	public static void ispisOdredjenogOglasa(int sifra,Oglas[] oglas) {
		String ispis = "";
		int i = 0;
		while(i<oglas.length) {
			Oglas ispis1 = oglas[i];
			if (sifra == ispis1.getSifra()) {
				String oprema = ispis1.getOprema();
				ispis += ispis1.getSifra() + " " + ispis1.getNaslov() + " "
						 + ispis1.getCena() + " " + ispis1.getGodiste() + "\n" +
						"Oprema: " + "\n" + oprema + "\n";
				
				
			}
			i++;
			
		}
		
		System.out.printf("Oglas pod sifrom: %d ",sifra);
		System.out.println();
		System.out.println(ispis);
		
		
		
	}
	public static void ispisOdDo(int donjaGr,int gornjaGr,Oglas[] oglas) {
		String ispis= "";
		int i = 0;
		while(i<oglas.length) {
			Oglas ispis1 = oglas[i];
			if(ispis1.getCena()>= donjaGr && ispis1.getCena()<= gornjaGr) {
				ispis += (i+1)+ ". " + ispis1.getSifra() + " " + ispis1.getNaslov() + " "
						 + ispis1.getCena() + " " + ispis1.getGodiste() + "\n"	;
				
				
			}
			i++;
		}
		System.out.printf("Oglasi od %d do %d evrica:",donjaGr,gornjaGr);
		System.out.println();
		System.out.println(ispis);
		
	}
	public static void ispisOd(int od,Oglas[] oglas) {
		String ispis = "";
		int i = 0;
		while(i<oglas.length) {
			Oglas ispis1 = oglas[i];
			if(ispis1.getCena()>= od) {
				ispis += (i+1)+ ". " + ispis1.getSifra() + " " + ispis1.getNaslov() + " "
						 + ispis1.getCena() + " " + ispis1.getGodiste() + "\n"	;
				
			}
			i++;
			}
		System.out.printf("Oglasi skuplji od %d :",od);
		System.out.println();
		System.out.println(ispis);
		
	}
	public static void ispisDo(int doo,Oglas[] oglas) {
		String ispis = "";
		int i = 0;
		while(i<oglas.length) {
			Oglas ispis1 = oglas[i];
			if(ispis1.getCena()<= doo) {
				ispis += (i+1)+ ". " + ispis1.getSifra() + " " + ispis1.getNaslov() + " "
						 + ispis1.getCena() + " " + ispis1.getGodiste() + "\n"	;
				
			}
			i++;
			}
		System.out.printf("Oglasi jeftiniji od %d :",doo);
		System.out.println();
		System.out.println(ispis);
		
	}
	public static void dodajOpremu(String oprema,int mesto, Oglas oglas) {
		oglas.oprema[mesto] = oprema;
		
		
	}
	public static void poOpremi(String oprema,Oglas[] oglas) {
		String ispis = "";
		int i = 0;
		
		while(i<oglas.length) {
			Oglas ispis1 = oglas[i];
			int j = 0;
			while(j<ispis1.oprema.length) {
				if(oprema.equals(ispis1.oprema[j])) {
					ispis += ispis1.getSifra() + " " + ispis1.getNaslov() + " "
							 + ispis1.getCena() + "\n";
					
				}
				j++;
			}
			i++;
			}
		System.out.printf("Oglasi koji sadrze '%s' su :",oprema);
		System.out.println();
		System.out.println(ispis);
	}

}
