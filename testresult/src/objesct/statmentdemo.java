package objesct;

public class statmentdemo {
    // If , else , elseif
	
	public static void main(String[] args) {
		
		 int age= 60;
		String AgeGroup = "";
		if(age <20){
			AgeGroup="child";
		}else if(age >=30 && age <=45) {
			AgeGroup="Adult";
		}else if (age>=45 && age <=60) {
			AgeGroup="old";
		}
		System.out.println(AgeGroup);
	}
}

		
		
		
	
// <18 = child, 18-30=Adult, 30-45=Mature,45-60=old
		
