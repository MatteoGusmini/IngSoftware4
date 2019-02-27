import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import MyLib.Utility;

public class Utente implements Serializable{
	
	final String NOME="Nome categoria: ";
	final String DESCRIZIONE="Descrizione: ";
	final String SCELTACATEGORIA="Quale categoria vuoi aggiungere ai preferiti?";
	
	
	private String nomeUtente;
	private ArrayList<Integer> fasciaEtà;
	private ArrayList<Categoria> categorieInteresse= new ArrayList<>();
	private ArrayList<Evento> eventiUtente = new ArrayList<>();
	private ArrayList<Messaggio> messaggiUtente = new ArrayList<>();
		
		
		public Utente(String _nomeUtente)
		{
			nomeUtente=_nomeUtente;
		}
		
		
		public Boolean confrontaUtente(Utente uConfronto){
			Boolean uguale;
			if(nomeUtente.equalsIgnoreCase(uConfronto.getNomeUtente()))
				uguale=true;
			else
				uguale=false;
			
			return uguale;
		}
		
		
		public void inserisciDatiPersonali(ArrayList<Categoria> elencoCategorie){
			int inserimento= Utility.leggiIntero(0,1, "Vuoi creare l'elenco delle tue categorie preferite? Digita 1 per SI e 0 pre NO");
			if(inserimento==0){
			
			}
			else{
				int numCat=0;
				do{
					System.out.println("0) Esci");
					for (int i=0; i<elencoCategorie.size();i++){
						System.out.println(i+1+")");
						System.out.println(NOME + elencoCategorie.get(i).getNome());
						System.out.println(DESCRIZIONE + elencoCategorie.get(i).getDescrizione()+"\n");
					}
					
					numCat=Utility.leggiIntero(1, elencoCategorie.size()+1, SCELTACATEGORIA);
					if(numCat!=0){
						numCat=numCat-1;
						categorieInteresse.add(elencoCategorie.get(numCat));
						elencoCategorie.remove(numCat);
					}
					
				}while(elencoCategorie.size()>0 && numCat!=0);
			}
			
			int inserimento2= Utility.leggiIntero(0,1, "Vuoi inserire la tua fascia di età? Digita 1 per SI e 0 pre NO");
			if(inserimento2==0){
			
			}
			else{
				fasciaEtà= Utility.leggiFaciaEtà("Seleziona la tua fascia d'eta");
			}
			
			
		}
		
		public String getNomeUtente() {
			return nomeUtente;
		}


		public ArrayList<Evento> getEventiUtente() {
			return eventiUtente;
		}


		public ArrayList<Messaggio> getMessaggiUtente() {
			return messaggiUtente;
		}


		public void setNomeUtente(String nomeUtente) {
			this.nomeUtente = nomeUtente;
		}


		public void setEventiUtente(ArrayList<Evento> eventiUtente) {
			this.eventiUtente = eventiUtente;
		}


		public void setMessaggiUtente(ArrayList<Messaggio> messaggiUtente) {
			this.messaggiUtente = messaggiUtente;
		}




		public ArrayList<Categoria> getCategorieInteresse() {
			return categorieInteresse;
		}




		public void setCategorieInteresse(ArrayList<Categoria> categorieInteresse) {
			this.categorieInteresse = categorieInteresse;
		}


		public ArrayList<Integer> getFasciaEtà() {
			return fasciaEtà;
		}


		public void setFasciaEtà(ArrayList<Integer> fasciaEtà) {
			this.fasciaEtà = fasciaEtà;
		}
		
		
		
	
	
}
