package UserInterface;

import java.util.HashMap;
import java.util.ArrayList;

import java.rmi.registry.Registry; 
import java.rmi.registry.LocateRegistry; 
import java.rmi.RemoteException;
import java.rmi.NotBoundException;

import javax.swing.*;

import UserInterface.*;
import Elaborazione.*;

public class UiNotifica extends JOptionPane implements UiNotificaInterfaccia
{
	// registri
	private Registry registryUI;
	private Registry registryGestore;

	// componenti
	private GestoreNotificheInterfaccia gestoreNotifiche;

	// attributi
	
	// elementi grafici
	
	public UiNotifica(String hostGestore) throws RemoteException, NotBoundException
	{
		registryUI = LocateRegistry.getRegistry("127.0.0.1", 1100); // default: 1099
		registryGestore = LocateRegistry.getRegistry(hostGestore, 1099); 

		gestoreNotifiche = (GestoreNotificheInterfaccia) registryGestore.lookup("gestoreNotifiche"); 
	}
	
	public void avvioVisualizzaNotifiche() throws RemoteException
	{ 	// RF01
	}

	public void avvioGeneraNotifica() throws RemoteException
	{ 	// RF04
	}

	public void avvioRicercaNotifiche() throws RemoteException
	{ 	// RF21	
	}
}
