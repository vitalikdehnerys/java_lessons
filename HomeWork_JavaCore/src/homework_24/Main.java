package homework_24;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Movie avatar = new Movie("Avatar", new Time(3, 20));
		Movie avengers = new Movie("Avengers", new Time(3, 30));
		Movie sonik = new Movie("Sonik", new Time(1, 50));

		Seance seance1 = new Seance(sonik, new Time(16,30));
		Seance seance2 = new Seance(avatar, new Time(19,10));
		Seance seance3 = new Seance(avengers, new Time(18,30));
		
		Cinema cinema = new Cinema();

		
		cinema.addSeance(seance1, "monday");
		cinema.addSeance(seance2, "monday");
		cinema.addSeance(seance3, "monday");
		
		cinema.moviesLibrary.add(sonik);
		cinema.moviesLibrary.add(avatar);
		cinema.moviesLibrary.add(avengers);
		
		/* cinema's menu*/
		
		while(true) {
			System.out.println("Hello , Welcome to our Cinema 'BIG RED CAT' ");
			Scanner scanner= new Scanner(System.in);
			System.out.println("Enter that number what you need :");
			System.out.println("1- i am visitor");
			System.out.println("2- i am admin");
			System.out.println("10- i want exit");
			int number =scanner.nextInt(); 
			
			switch(number) {
				
				case 1:
					while(true) {
						System.out.println("Hello visitor");
						System.out.println("Enter that number what you need :");
						System.out.println("if you want see a schedule of cinema enter 1");
						System.out.println("if you want see list of movie in cinema enter 2");
						int numberVisitor =scanner.nextInt();
						switch(numberVisitor) {
		
							case 1:
								System.out.println(cinema);
								break;
					
							case 2:
								System.out.println(cinema.moviesLibrary);
								break;
								
							case 10:
								System.exit(0);
								break;
						}
					}
					
				case 2:
					
					while(true) {
						System.out.println("Hello admin, please enter password :");
						int password =scanner.nextInt();
						if (password==543210) {
							System.out.println("Enter that number what you need :");
							System.out.println("if you want see a schedule of cinema enter 1");
							System.out.println("if you want see list of movie in cinema enter 2");
							System.out.println("if you want add movie enter 3");
							System.out.println("if you want add seance enter 4");
							System.out.println("if you want to remove movie enter 5");
							System.out.println("if you want to remove seance enter 6");
							int numberAdmin =scanner.nextInt();
							
							switch(numberAdmin) {
								
								case 1:
									System.out.println(cinema);
									break;
					
			
								case 2:
									System.out.println(cinema.moviesLibrary);
									break;
						
								case 3:
									System.out.println("Please enter name of film :");
									String nameOfFilm = scanner.next();
									System.out.println("Please enter how many hours last film :");
									int numberOfHour =scanner.nextInt();								
									System.out.println("and minutes :");
									int numberOfMinutes =scanner.nextInt();								
									
									Movie newMovie = new Movie(nameOfFilm, new Time(numberOfHour, numberOfMinutes));
									cinema.moviesLibrary.add(newMovie);
									break;
									
								case 4:
									Movie returnMovie = new Movie();
									System.out.println("Please enter name of film :");
									String nameOfFilmOfSeance = scanner.next();
									System.out.println("Please enter how many hours last film :");
									int numberOfHourOfSeance =scanner.nextInt();								
									System.out.println("and minutes :");
									int numberOfMinutesOfSeance =scanner.nextInt();	
									System.out.println("Please enter the day of week :");
									String dayOfSeance = scanner.next();
									
									Iterator<Movie> it = cinema.moviesLibrary.iterator();
									while(it.hasNext()) {
										Movie mov = it.next();
										if(mov.title.equals(nameOfFilmOfSeance)) {
											returnMovie=mov;
										}else {
											System.out.println("Our Cinema does not have this film");
										}
									}
									
									Seance newSeance = new Seance(returnMovie, new Time(numberOfHourOfSeance, numberOfMinutesOfSeance));
									cinema.addSeance(newSeance, dayOfSeance);
									System.out.println(cinema);
									break;
									
								case 5:
					
									System.out.println("Please enter name of film :");
									String nameOfFilmToDelete = scanner.next();
									Iterator<Movie> iteee = cinema.moviesLibrary.iterator();
									while(iteee.hasNext()) {
										Movie movieToDelete = iteee.next();
										if(movieToDelete.title.equalsIgnoreCase(nameOfFilmToDelete)) {
											iteee.remove();
										}
									}
									
									break;								
									
								case 6:
									Seance returnSeance = new Seance();
									Movie returnMov = new Movie();
									System.out.println("Please enter name of film :");
									String nameTheFilm = scanner.next();	
									System.out.println("Please enter the day of week :");
									String dayOfSeanceDelete = scanner.next();
									
									Iterator<Movie> ite = cinema.moviesLibrary.iterator();
									while(ite.hasNext()) {
										Movie mov = ite.next();
										if(mov.title.equalsIgnoreCase(nameTheFilm)) {
											returnMov=mov;
										}
									}
									Iterator<Schedule> itera = cinema.seances.values().iterator();
									while(itera.hasNext()) {
										Set<Seance> seanceSet = itera.next().seances;
										for(Seance seanceUse:seanceSet) {
											if(seanceUse.movie.equals(returnMov)) {
												returnSeance=seanceUse;
											}
										}
										
									}
									
									cinema.removeSeance(returnSeance, dayOfSeanceDelete);
									System.out.println(cinema);
									break;
								case 10:
									System.exit(0);
							}
						}
					}
					
				case 10:
					System.exit(0);
					break;
			}	
			scanner.close();
		}
	}
}
