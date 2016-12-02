package ednolineals;

public interface Acb<E>{

	void Inserir(Comparable<E> jugador) throws ArbreException;
	void Esborrar(Comparable<E> e) throws ArbreException;
	boolean Membre(Comparable<E> e);
	
	/*
	 * cal llen�ar una excepci� si es demana l�arrel d�un arbre buit
	 */
	Comparable<E> arrel() throws ArbreException;

	/*
	 * Exception si l�arbre this �s buit. Si no t� fill esquerre retorna un arbre buit.
	 */
	Acb<E> fillEsquerre()throws ArbreException;

	/*
	 * Excepcion si l�arbre this �s buit. Si no t� fill dret retorna una arbre buit.
	 */
	Acb<E> fillDret()throws ArbreException;

	boolean ArbreBuit();
	void Buidar();

	
}
