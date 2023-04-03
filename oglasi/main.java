package oglasi;

public class main extends Oglas {

	public static void main(String[] args) {
		Oglas[] oglasi = new Oglas[2];
		
		Oglas oglas1 = new Oglas(10,"prodajem audi",2000,2001);
		oglas1.dodajOpremu("AirBag", 0, oglas1);
		Oglas oglas2 = new Oglas(20,"prodajem bmw",2500,2002);
		
		oglasi[0]= oglas1;
		oglasi[1] = oglas2;
		ispisOglasa(oglasi);
		ispisPoGodini(oglasi,2001);
		ispisOdDo(1900,2600,oglasi);
		ispisOd(2300,oglasi);
		ispisDo(2100,oglasi);
		ispisOdredjenogOglasa(10,oglasi);
		poOpremi("AirBag",oglasi);
		

	}

}
