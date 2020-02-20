package homework_24;

public class Time {
	int min;
	int hour;
	
	public Time() {}
	
	public Time(int hour,int min) {
		if((min>60||min<0)||
				(hour>24||hour<0)){
			System.out.println("You entered the wrong time");
		}else {
		this.min=min;
		this.hour=hour;
		}
	}
	
	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if(min>60||min<0){
			System.out.println("You entered the wrong time");
		}else {
		this.min=min;
		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if(hour>24||hour<0){
			System.out.println("You entered the wrong time");
		}else {
		this.hour=hour;
		}
	}

	public Time addToo(Time time) {
		Time time1=new Time(0,0);
		time1.hour=this.hour+time.hour;
		time1.min=this.min+time.min;
		if(time1.min>60) {
			time1.min=time1.min%60;
			time1.hour++;
		}
		return time1;
	}

	@Override
	public String toString() {
		return hour +":" + min ;
	}
	
	
}
