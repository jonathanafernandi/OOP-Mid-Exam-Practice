package menu;

import java.util.ArrayList;

public class Work {
	ArrayList<WorkType> workTypeList = new ArrayList<>();
	private String genre;
	private Integer duration;
	private String imageType;
	private String title;
	
	public Work(ArrayList<WorkType> workTypeList, String genre, Integer duration, String imageType, String title) {
		super();
		this.workTypeList = workTypeList;
		this.genre = genre;
		this.duration = duration;
		this.imageType = imageType;
		this.title = title;
	}

	public ArrayList<WorkType> getWorkTypeList() {
		return workTypeList;
	}

	public void setWorkTypeList(ArrayList<WorkType> workTypeList) {
		this.workTypeList = workTypeList;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
