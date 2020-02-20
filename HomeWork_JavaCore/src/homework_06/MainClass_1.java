package homework_06;
public class MainClass_1 {

	public static void main(String[] args) {
		monthSalary worker1 = new monthSalary();
		hourSalary worker2 = new hourSalary();
		Salary worker_hour = worker1;
		Salary worker_month = worker2;
		 System.out.println("Worker earns in a hour : "+worker_hour.salary()+" $");
		 System.out.println("Worker earns in a month : "+worker_month.salary()+" $");
	}

}
