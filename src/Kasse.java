
public class Kasse {
	
	public void Altesrueberpruefen (VSK, geburtsdatum){
		
		if(alter(geburtsdatum) < VSK){
			(Ware entfernen);
		}
		
	}

	public void artikelEntfernen(warennummer, bezeichnung, preis){ //falls ein artikel???
		
		warennummer = null;
		bezeichnung = null;
		Gesamtbetrag -= preis;
		verkaufsflaechenbestand +=1;
		

	}
	
	
	//Der Kunde hat genuegend Guthaben und kann bezahlen
	
	public [Benutzeroberflaeche] genuegendGuthaben (gesamtbetrag, guthaben){
		
		if (guthaben >= gesamtbetrag){
			
			guthaben -= gesamtbetrag;
			[Kauf erfolgt!]
			Waren
			
		}
			else {
				
				//die Meldung: Guthaben reicht nicht aus!
				//besteht die Möglichkeit, die Sachen zu entfernen;
				// neben jedem Artikel steht Button "Artikel entfernen":
				artikelentfernen(artikel);
				
			}
				
			
		
}
