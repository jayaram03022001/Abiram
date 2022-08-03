
 class MyException extends Exception {
	 String str3;
	 MyException(String str4){
		 str3=str4;
	 }
	 public String toString(){
		 return("MyException Occurred:"+str3);
	 }
 }
 class Example1{
	 public static void main(String args[]){
		 try{
			 System.out.println("Starting of try block");
			 throw new MyException("This is My error");
		 }
		 catch(MyException exp){
			 System.out.println("Catch Block");
			 System.out.println(exp);
			 
		 }
	 }
 }
