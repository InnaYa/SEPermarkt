
public class Benutzerverwaltung {
	

	public [GUI ("Sie haben sich erfolgreich registriert"), Log-In Feld] 
	
			sichRegistrieren (benutzername, vorname, nachname, passwort, geburtsdatum){
	
		if (Eingaben entsprechen && Buttonklick){
			speichere Daten in die Datenbank;
			GUI ("Sie haben sich erfolgreich registriert"), Log-In Feld;
	}
	
	else {
		;
	}
}
	
	public [GUI Warensuche] login (benutzername, passwort){
		
		if (benutzername == true && passwort == passwort){
			GUI Warensuche;
		}
		
		else{
			GUI "Versuchen Sie noch Mal";
		}
	}

}
