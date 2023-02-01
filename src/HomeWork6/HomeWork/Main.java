package HomeWork6.HomeWork;

public class Main {
	public static void main(String[] args){
		User user = new User("Bob");
		Persister ps = new Persister(user);
		Report report=new Report();
		report.report(user);
		ps.save();
	}
}