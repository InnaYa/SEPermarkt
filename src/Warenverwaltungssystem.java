
public class Warenverwaltungssystem {
	
	//Mitarbeiter meldet sich an

	public [GUI Mitarbeitersicht] mitarbeiterAnmeldung (mitarbeiterID, passwort){
		
		if (mitarbeiterID && passwort == true){
			return [GUI Mitarbeitersicht]
		}
		
		else (mitarbeiterID && passwort != true){
			return [GUI Anmeldesicht]
	}	
}
	
	//Das System setzt Rabatt auf die Artikel
	
	public void rabattSetzen (artikelID, preis, mhd){
		if (mhd <= currentDate + 3){
			preis *= 0.5;
		}
		
		else;
	}
	
	
	//Der Artikel wird aus dem System entfernt, der Mitarbeiter wird benachrichtigt
	
	public [benachrichtigung GUI Mitarbeiter: "Ware entfernen"] wareEntfernen (artikelID, preis, mhd){
		
		if (mhd = currentDate){
			artikelID = null;
			benachrichtigung GUI Mitarbeiter: "Ware entfernen";
		}
		
		else;
		
	}
	
	
	//Eine neue Ware wird in die Datenbank hinzugefuegt
	
	public void wareEinfuegen (warennummer, bezeichnung, kategorie, standortid, verkaufsflaechenbestand, lagerbestand, fsk){
		
		insert Daten in die Datenbank
	}
	
	
	//Die Ware wird nachgelegt
	
	public [GUI Mitarbeiterbenachrichtigung: "Bitte Ware nachfuellen!"] bestandVerkaufsflächerAuffuellen (warennummer, verkaufsflaechenbestand, standortID){
		
		if (verkaufsflaechenbestand < 5){
			[GUI Mitarbeiterbenachrichtigung: "Bitte Ware nachfuellen!"], 
			verkaufsflaechenbestand += 5;
			
		}
		
	}


	//Die Ware wird nachbestellt
	
	public [GUI Mitarbeiterbenachrichtigung: "Bitte Ware nachbestellen!"] wareNachbestellen (warennummer, Lagerbestand, standortID){
		
		if (verkaufsflaechenbestand < 5){
			[GUI Mitarbeiterbenachrichtigung: "Bitte Ware nachfuellen!"], 
			verkaufsflaechenbestand += 5;
			
		}
		
	}
	
}
