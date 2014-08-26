package daos;

public class PersistenciExcpetion extends Exception {

	private static final long serialVersionUID = 771534369817587147L;

	
	public PersistenciExcpetion(String msg,Exception exception){
		super(msg, exception);
	}
	
	
}
