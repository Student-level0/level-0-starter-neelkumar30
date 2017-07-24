package day1;

public class Fibonacci {
public static void main(String[] args) {

int firstnumber = 0;
int secondnumber = 1;
int thirdnumber = 1;
System.out.println(firstnumber);
System.out.println(secondnumber);
for (int i = 0; i < 13; i++) {
thirdnumber = secondnumber + firstnumber;
System.out.println(thirdnumber);
firstnumber = secondnumber;
secondnumber= thirdnumber;
	
}	
}
}
