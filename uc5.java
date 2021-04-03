
public class uc5 {
	public static void main(String[] args) {
		int Wage_perhr=20;
		int Day_hr=8;
		int dailywage=0;
		
		int day_of_month=20;
		int Wage_month=0;
	
		System.out.println("****calculating wages for a month****" );
		dailywage=Wage_perhr*Day_hr;
		Wage_month=dailywage*day_of_month;
		System.out.println("wage for a month of a employee :"+Wage_month);
		
	}

}
