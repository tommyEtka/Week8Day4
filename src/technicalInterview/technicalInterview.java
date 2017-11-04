package technicalInterview;

public class technicalInterview {
	
	public static void main(String[] args) {
		getOcc("tometka",'t');
	}


	

	
  public static int getOcc(String s, char c){
		int counter = 0;
		for(int i = 0;i<s.length();i++){
			if(s.charAt(i) == c){
				counter++;
			}
		}
		System.out.println(counter);
		return counter;


}
}