package homework_24;

public class Movie {
	String title;
	Time duration;
	
	public Movie() {}
	
	public Movie(String title,Time duration) {
		this.duration=duration;
		this.title=title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Time getDuration() {
		return duration;
	}

	public void setDuration(Time duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return  title + ", movie last " + duration ;
	} 
	
}
