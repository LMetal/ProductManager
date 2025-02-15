package UserInterface;

import java.rmi.Remote; 
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap; 

public interface UiListaInterfaccia extends Remote
{
	// RF11 Marino-Vecchio
	void avvioListaOrdini(String username, int codiceProdotto) throws RemoteException;
	void avvioListaPagamenti(String username) throws RemoteException;

	// RF 13 Benetti-Chiappa
	void avvioListaForniture( int  codice) throws RemoteException; ;
	void avvioListaForniture() throws RemoteException ;
	void mostraErrore(int esitoControllo) throws RemoteException ;
	void mostraFormRicercaPerData() throws RemoteException;
	void mostraLista(ArrayList<HashMap<String, Object>> listaForniture) throws RemoteException;
}

