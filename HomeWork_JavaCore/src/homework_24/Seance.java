package homework_24;

public class Seance implements Comparable<Seance> {
	Movie movie;
	Time startTime;
	Time endTime;
	
	public Seance() {}
	
	public Seance(Movie movie,Time startTime) {
		this.movie=movie;
		this.startTime=startTime;
		this.endTime=startTime.addToo(movie.duration);
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "\n"+" name of movie is " + movie + ",  seance start at " + startTime + ", seance end at " + endTime ;
	}

	public boolean equals(Seance obj) {
		if (this.movie.title == obj.movie.title) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int compareTo(Seance seance) {
		if((this.startTime.hour>=seance.startTime.hour)&&
				this.startTime.min>seance.startTime.min) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
	
}
