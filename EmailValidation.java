import java.util.regex.*;
import java.util.*;
public class EmailValidation {
	public static void main(String args[]){
		ArrayList<String> emails = new ArrayList<String>();
		
		emails.add("Ram@domain.co.in");
		emails.add("Vankat@domain.com");
		emails.add("Krishna@domain.com");
		emails.add("Balu@domain.com");
		emails.add("Kumar@domain.com");
		emails.add("Rahual@domain.com");
		emails.add("@yahoo.com");
		emails.add("Ram#domain.com");
		
		String regex="^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		for(String email:emails){
		Matcher matcher = pattern.matcher(email);
		System.out.println(email+":"+matcher.matches()+"\n");
		}
		
	}

}
