package PracticeInheritance;

public class User {

	public static void main(String[] args) {
		System.err.println("Admin can do....");
		Admin admin = new Admin();
		admin.read();
		admin.write();
		admin.manage();
		System.out.println("Developer can do....");
		Developer developer = new Developer();
		developer.read();
		developer.write();
		System.out.println("Guest can do....");
        Guest guest = new Guest();
        guest.read();
	}

}
