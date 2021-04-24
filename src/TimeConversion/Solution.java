package TimeConversion;

public class Solution {

    static String timeConversion(String s) {

    	StringBuilder string = new StringBuilder(s);
		Integer firstPart = Integer.valueOf(string.substring(0,2));
		String ampm =  string.substring(8,10);

		if(ampm.equals("AM")){
			if(firstPart == 12){
				return "00" + string.substring(2,8);
			}
			return string.substring(0,8);
		}else{
			if(firstPart == 12){
				return "12" + string.substring(2,8);
			}
			return firstPart + 12 + string.substring(2,8);
		}

	}


    public static void main(String[] args){
        String result = timeConversion("12:45:54PM");
        System.out.println(result);
    }
}
