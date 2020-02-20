package homework_08;

public enum Month {
	JANUARY (31,0),FEBRUARY(28,0),MARCH(31,1),APRIL(30,1),MAY(31,1),JUNE(30,2),
	JULY(31,2),AUGUST(31,2),SEPTEMBER(30,3),OCTOBER(31,3),NOVEMBER(30,3),DECEMBER(31,0);
	Season season;
	
	protected final int numberOfSeason;
	protected final int numberOfDay;
	
	private Month(int numberOfDay,int numberOfSeason) {
		this.numberOfDay=numberOfDay;
		this.numberOfSeason=numberOfSeason;
	}
	
	private Month(Season season,int numberOfDay,int numberOfSeason) {
		this(numberOfDay,numberOfSeason);
		this.season=season;
	}

	public int getNumberOfDay() {
		return numberOfDay;
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	public int getNumberOfSeason() {
		return numberOfSeason;
	}

}
