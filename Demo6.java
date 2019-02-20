package Demo6;

class Demo{
	public static void main(String[] args) {
		Koe ab = new Koe("Moo", "Zwart", 2);
		Koe ba = new Koe("Boo", "Bruin", 4);
		Koe ac = new Koe("Sjaak", "Wit", 6);
		Koe da = new Koe("Koe", "LichtBruin", 8);
		
		System.out.println(ab.naam);
		ab.naam = "Milka";
		System.out.println(ab.naam);
		System.out.println(ba.naam);
		System.out.println(ac.kleur);
		System.out.println(ac.leeftijd);
		ac.kleur = "Paars";
		System.out.println(ac.kleur);
		System.out.println(ac.naam);
		System.out.println(da.kleur);
	}
}
class Koe{
    String naam;
	static String kleur;
	static int leeftijd;
	
	Koe(String naamKoe, String kleurKoe, int leeftijdKoe ){
		naam = naamKoe;
		kleur = kleurKoe;
		leeftijd = leeftijdKoe;
		
	}
}
