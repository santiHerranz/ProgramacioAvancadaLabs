package Exercici22;

import edlineals.*;
import ednolineals.*;

public class Barca {

	/*** Els socis es magatzeman amb 10 arbres, cada soci anira a un arbre en funcio del seu numero de soci
	 *  Acb de la primera posicio emmagatzema els socis amb un nomero de soci acabat en 0, etc..
	 */
	private Acb<Soci>[]socis;

	/* Magatzem de les diferents seccions del club */
	private Pila seccions;

	/*
	 * TODO Solucio Exercici 5.1
	 */
	public Barca(){
		socis = new Acb[10];
		for (int i=0; i<10; i++) 
			socis[i]=new AcbEnll<Soci>();
		seccions=new PilaEnll();		
	}
	/*
	 * TODO Solucio Exercici 5.2
	 */
	public void addSoci(Soci p) throws Exception{
		int index = (int) (p.getNumeroSoci()%10);
		socis[index].Inserir(p);
	}

	/*
	 * TODO Solucio Exercici 5.3
	 */
	public void remSoci(Soci q) throws Exception{
		int index = (int) (q.getNumeroSoci()%10);
		socis[index].Esborrar(q);
	}
	
	@Override
	public String toString(){
		
		StringBuilder stringBuilder = new StringBuilder();
		for (int i=0; i< socis.length; ++i){
			stringBuilder.append("Socis["+ i +"] ");
			stringBuilder.append(" "+((AcbEnll)socis[i]).inordre().toString());
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();
	}	
}