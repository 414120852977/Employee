
public class uc2 {
	public static void main(String[] args) {
		int Wage_perhr=20;
		int Day_hr=8;
		int dailywage=0;
		int min=0;
		int max=1;
		int a=(int)(Math.random()*(max-min+1)+min);
		if(a==1){
			System.out.println("Employee is present");
			System.out.println("**daily employee wage**");
			dailywage=Wage_perhr*Day_hr;
			System.out.println("daily wage of a employee is :"+dailywage);
		}
		
	}

}
