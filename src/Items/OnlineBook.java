package Items;

import LibraryManagementSystem.LibraryManagementSystem;

public class OnlineBook extends Item {
	
	public OnlineBook(int id,String name, String category) {
		super(id,name, category);
		
		LibraryManagementSystem system = LibraryManagementSystem.getInstance();
		system.getOnlineBooks().add(this);
	}

	@Override
	public String getDueDates() {
		return null;
	}
	
	public String getCourseName() {
		
		return "Not a course Textbook";
	}

	@Override
	public String setDueDates(String date) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
