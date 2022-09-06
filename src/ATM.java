import java.util.HashMap;
<<<<<<< HEAD
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class ATM {
	private HashMap<Long, Double> accounts;
	private static final DecimalFormat df = new DecimalFormat("0.00");
=======

public class ATM {
	private HashMap<Long, Double> accounts;
	public ATM() {
		accounts = new HashMap<Long, Double>();
	}
	public void openAccount(long id) {
<<<<<<< HEAD
		accounts.put(id, 0.00);
	}
	public void openAccount(long id, double balance) {
		accounts.put(id, Math.floor(balance * 100.00 + 0.5) / 100.00);
=======
		accounts.put(id, 0.0);
	}
	public void openAccount(long id, double balance) {
		accounts.put(id, balance);
>>>>>>> main
	}
	public void closeAccount(long id) {
		accounts.remove(id);
	}
	public double checkBalance(long id) {
		if(accounts.get(id) == null) {
			return 0.0;
		}
		if(accounts.containsKey(id)) 
<<<<<<< HEAD
			return Math.round(accounts.get(id) * 100.00) / 100.00;
=======
			return accounts.get(id);
>>>>>>> main
		return 0.0; 
	}
	public boolean depositMoney(long id, double deposit) {
		if(!accounts.containsKey(id)) 
			return false;
		accounts.replace(id, deposit + accounts.get(id));
			return true;
	}
	public boolean withdrawMoney(long id, double withdrawal) {
<<<<<<< HEAD
		if(withdrawal < 0.0)
			return false;
=======
>>>>>>> main
		if(accounts.get(id) == null) 
			return false;
		if(!accounts.containsKey(id)) 
			return false;
		if(withdrawal > accounts.get(id))
			return false;
		accounts.replace(id, accounts.get(id) - withdrawal);
			return true;
	}

}
