package homework_24;

import java.util.ArrayList;
import java.util.TreeMap;

public class Cinema {
	TreeMap<Days,Schedule> seances= new TreeMap<>() ;
	ArrayList<Movie> moviesLibrary = new ArrayList<>();
	Time openTime;
	Time closeTime;
	
	public Cinema() {
		this.seances.put(Days.MONDAY,new Schedule());
		this.seances.put(Days.TUESDAY,new Schedule());
		this.seances.put(Days.WEDNESDAY,new Schedule());
		this.seances.put(Days.THURSDAY,new Schedule());
		this.seances.put(Days.FRIDAY,new Schedule());
		this.seances.put(Days.SATURDAY,new Schedule());
		this.seances.put(Days.SUNDAY,new Schedule());
	}
	
	@Override
	public String toString() {
		return "Cinema " +"\n"+ seances;
	}

	public void addMovie(Movie movie) {
		moviesLibrary.add(movie);
	}
	
	public void addSeance(Seance seance,String day) {
		Days dayNew;
		Schedule schedule = new Schedule();
		dayNew=Days.valueOf(day.toUpperCase());
		
		schedule=seances.get(dayNew);
		schedule.addSeanceToSet(seance);
		seances.put(dayNew, schedule);
		
	}
	
	public void removeMovie(Movie movie) {
		if(moviesLibrary.contains(movie)) {
			moviesLibrary.remove(movie);
		}
	}
	
	public void removeSeance(Seance seance,String day) {
		Days dayOfSeance;
		dayOfSeance=Days.valueOf(day.toUpperCase());
		Schedule schedule2 = new Schedule();
		schedule2=seances.get(dayOfSeance);
		schedule2.removeSeanceFromSet(seance);
		seances.put(dayOfSeance, schedule2);
	}	
}
