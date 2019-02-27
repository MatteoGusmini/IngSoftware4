import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import MyLib.Utility;

public class Partita extends Categoria {
	private Campo genere=new Campo("Genere","Indica se i partecipanti sono maschi o femmine",true,STRING);
	private Campo fasciaEta=new Campo("Fascia di età","Indica l'età massima e minima per partecipare all'evento",true,ETA);
	private ArrayList<Campo> elencoCampi = new ArrayList<>();
	
	
	
	
	public Partita(){
		super("Partita di Calcio","Evento sportivo che prevede un match di 90 minuti");
		creaArray();
	}

	
	
	public void creaArray(){
		
		elencoCampi.add(super.getTitolo());
		elencoCampi.add(super.getnPartecipanti());
		elencoCampi.add(super.getTolleranzaPartecipanti());
		elencoCampi.add(super.getTermineIscrizione());
		elencoCampi.add(super.getLuogo());
		elencoCampi.add(super.getData());
		elencoCampi.add(super.getOra());
		elencoCampi.add(super.getDurata());
		elencoCampi.add(super.getQuotaIndividuale());
		elencoCampi.add(super.getCompresoQuota());
		elencoCampi.add(super.getDataFine());
		elencoCampi.add(super.getDataRitiroIscrizione());
		elencoCampi.add(super.getOraFine());
		elencoCampi.add(super.getNote());
		elencoCampi.add(genere);
		elencoCampi.add(fasciaEta);
	}
	
	//Metodo che visualizza tutti i campi della categoria partita
    public void visualizzaCampi(){
		super.visualizzaCampi();
		for (int i=0; i< elencoCampi.size(); i++){
			
			System.out.println(elencoCampi.get(i).visualizzaCampo());
		}
	}
	
    
    //metodo che fa inserire i valori ai campi di partita
    public void inserisciCampi()throws Exception{
    	super.inserisciCampi();
    	for (int i=0; i< elencoCampi.size(); i++){
			elencoCampi.get(i).inserisciValore();
			
		}
	}
    
    public void inserisciValoriPredefiniti(){
    	ArrayList<Integer> eta = new ArrayList<Integer>();
    	eta.add(16);
    	eta.add(45);
    	genere.getValore().setValore("Maschi");
    	fasciaEta.getValore().setEta(eta);
    }
	
	// Getters and Setters generati automaticamente

	public Campo getGenere() {
		return genere;
	}

	public Campo getFasciaEta() {
		return fasciaEta;
	}

	public void setGenere(Campo genere) {
		this.genere = genere;
	}

	public void setFasciaEta(Campo fasciaEta) {
		this.fasciaEta = fasciaEta;
	}


	public ArrayList<Campo> getElencoCampi() {
		return elencoCampi;
	}


	public void setElencoCampi(ArrayList<Campo> elencoCampi) {
		this.elencoCampi = elencoCampi;
	}

	
	
	
}

