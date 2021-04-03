
public class uc4 {
	public static void main(String[] args) {
		int Wage_perhr=20;
		int Day_hr=8;
		int dailywage=0;
		int Part_timehr=8;
		int min=0;
		int max=1;
		int a=(int)(Math.random()*(max-min+1)+min);
		if(a==1){
			System.out.println("Employee is present");
			System.out.println("**daily employee wage**");
			switch(a){
			case 1:
				dailywage=Wage_perhr*Day_hr;
				System.out.println("daily wage of a employee is :"+dailywage);
			case 2:
				System.out.println("***part time wage of a employee***");
				int dailywage2=Wage_perhr*Part_timehr;
				System.out.println("part time employee wage :"+dailywage2);
				
				
			
			}
			
			
			
		
		}
		else{
			System.out.println("Employee is abscent");
		}
		
	}

}
