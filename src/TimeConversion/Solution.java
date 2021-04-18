package TimeConversion;

public class Solution {

    static String timeConversion(String s) {
    	String[] split = s.split(":");
    	
    	if(s.substring(8).equals("PM") && Integer.valueOf(split[0]) < 12) {
    		
    	Integer hora = 	Integer.valueOf(split[0]) + 12;
    		
    		return hora.toString() + ":" + split[1] + ":" +  split[2].split("")[0] + split[2].split("")[1];
    	}
    	
    	if(s.substring(8).equals("AM")) {
    		
        	Integer hora = 	Integer.valueOf(split[0]) - 12;
        	
        	if(hora == 0) {
        		return "0" + hora.toString() + ":" + split[1] + ":" +  split[2].split("")[0] + split[2].split("")[1];
        	}
        		
        		return hora.toString() + ":" + split[1] + ":" +  split[2].split("")[0] + split[2].split("")[1];
        	}
    	Integer hora = 	Integer.valueOf(split[0]);
    	
		return hora.toString() + ":" + split[1] + ":" +  split[2].split("")[0] + split[2].split("")[1];
    	

    }


    public static void main(String[] args){
        String result = timeConversion("04:59:59AM");
        System.out.println(result);
    }
}
