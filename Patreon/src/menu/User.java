package menu;

import java.util.ArrayList;

public class User {
	private String username;
	private ArrayList<Work> workList = new ArrayList<>();
	private ArrayList<Subscriber> subList = new ArrayList<>();
	private ArrayList<SupportedCreator> supportedCreatorList = new ArrayList<>();
	
	public User(String username, ArrayList<Work> workList, ArrayList<Subscriber> subList,
			ArrayList<SupportedCreator> supportedCreatorList) {
		super();
		this.username = username;
		this.workList = workList;
		this.subList = subList;
		this.supportedCreatorList = supportedCreatorList;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public ArrayList<Work> getWorkList() {
		return workList;
	}

	public void setWorkList(ArrayList<Work> workList) {
		this.workList = workList;
	}

	public ArrayList<Subscriber> getSubList() {
		return subList;
	}

	public void setSubList(ArrayList<Subscriber> subList) {
		this.subList = subList;
	}

	public ArrayList<SupportedCreator> getSupportedCreatorList() {
		return supportedCreatorList;
	}

	public void setSupportedCreatorList(ArrayList<SupportedCreator> supportedCreatorList) {
		this.supportedCreatorList = supportedCreatorList;
	}
}
