package PatronAbstractFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IProduitFactory produitFactory1 = new ProduitFactory1();
		IProduitFactory produitFactory2 = new ProduitFactory2();
		
		ProduitA produitA  = null;
		ProduitB produitB  = null;
		ProduitC produitC  = null;
		
		
		System.out.println("Utilisation de la Premiere Fabrique");
		produitA = produitFactory1.getProduitA();
		produitB = produitFactory1.getProduitB();
		produitC = produitFactory1.getProduitC();
		produitA.methodA();
		produitB.methodB();
		produitC.methodeC();
		
		
		
		
		System.out.println("Utilisation de la Seconde Fabrique");
		produitA = produitFactory2.getProduitA();
		produitB = produitFactory2.getProduitB();
		produitC = produitFactory2.getProduitC();
		produitA.methodA();
		produitB.methodB();
		produitC.methodeC();
		
	}

}
