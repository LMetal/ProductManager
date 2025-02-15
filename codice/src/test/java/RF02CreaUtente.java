import static org.junit.Assert.*;

import org.junit.Test;

import DataBase.DbUtenti;
import Elaborazione.GestoreAccessi;

public class RF02CreaUtente {

	DbUtenti dbUtenti = new DbUtenti();
    GestoreAccessi gestoreAccessi = new GestoreAccessi(dbUtenti);
    
    /***********************************************************/
    
	@Test
	public void testFormatoNomeCognome() {
		
		//nome corto
		assertEquals(1, gestoreAccessi.controlloFormatoNomeCognome("am", "Rossi"));
		//nome contenente numeri
		assertEquals(1, gestoreAccessi.controlloFormatoNomeCognome("Rick3", "Baloxxi"));
		
		//cognome corto
		assertEquals(2, gestoreAccessi.controlloFormatoNomeCognome("Pippo", "Ro"));
		//cognome contenente numeri
		assertEquals(2, gestoreAccessi.controlloFormatoNomeCognome("Poldo", "Baloxxi21"));
		
		//uso corretto
		assertEquals(0, gestoreAccessi.controlloFormatoNomeCognome("Giacomo", "Poretti"));
		assertEquals(0, gestoreAccessi.controlloFormatoNomeCognome("Aldo", "Rossi"));
	}

}
