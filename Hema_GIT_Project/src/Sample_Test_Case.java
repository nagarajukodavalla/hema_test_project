
public class Sample_Test_Case {

	public static void main(String[] args) {
		
		String str1 = "This is my training";
		String str2 = "This is my TRAINING";
		if(str1.equalsIgnoreCase(str2)){
			System.out.println("Matching values");
		}
		else
		{
			System.out.println("Does not matching");
		}
	}

}
