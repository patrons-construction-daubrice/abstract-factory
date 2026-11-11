package PatronAbstractFactory;

public class ProduitFactory2 implements IProduitFactory{

	@Override
	public ProduitA getProduitA() {
		// TODO Auto-generated method stub
		return new ProduitA2();
	}

	@Override
	public ProduitB getProduitB() {
		// TODO Auto-generated method stub
		return new ProduitB2();
	}

	@Override
	public ProduitC getProduitC() {
		// TODO Auto-generated method stub
		return new ProduitC2();
		
	}
}
