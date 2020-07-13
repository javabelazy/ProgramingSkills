package com.konzern.eight;

public class UsernamePattern {

	//^\d*[a-zA-Z][a-zA-Z\d]*$
	public static boolean validate(String username) {

		
		
		if (username.length() < 6 && username.length() > 20)
			return false;
		if(username.endsWith("\\."))
			return false;
//		if(!username.startsWith("[a-zA-Z]+"))
//			return false;
		
		 char[] u = username.toCharArray();
		 
		 if(!Character.isLetter(u[0]))
			 return false;
		 
		 if(username.matches("[.]{1,2}?")) 
			 return false;
		 
		 
		 if(username.matches("^\\\\d*[a-zA-Z][a-zA-Z\\\\d]*$"))
			 return true;
			 else
				 return false;
		 
/*		 boolean isPassed = true;
		 
		 for(int i=0;i<u.length;i++) {
			 if(!Character.isDigit(u[i]) || !Character.isLetter(u[i])) {
				 isPassed = false;
				 break;
			 }
		 }
		 
		 return isPassed;*/
		 
		 
		
		
//		String regex = "^\\d*[a-zA-Z][a-zA-Z\\d]*$";
//		return Pattern.matches(regex, username);

//		throw new UnsupportedOperationException("Waiting to be implemented.");
	}

	public static void main(String[] args) {
		System.out.println(validate("Robert.Domek")); // Valid username, returns true
		System.out.println(validate("Robert Domek")); // Invalid username, returns false
	}
}