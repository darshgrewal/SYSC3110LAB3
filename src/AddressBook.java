import java.util.*;

public class AddressBook {

	private List<BuddyInfo> list;
	
	public AddressBook(){
		this.list=new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo x) {
		if (x != null ){
			list.add(x);
		}
	}
	
	public void removeBuddy(int x) {
		if (x >= 0 && x <list.size() ){
			list.remove(x);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo buddy = new BuddyInfo("Grewal",911,18,"Carleton");
		AddressBook AB = new AddressBook();
		System.out.println("Hello world!");
		AB.addBuddy(buddy);
		AB.removeBuddy(0);
	}

}