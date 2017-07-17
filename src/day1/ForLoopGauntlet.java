package day1;

public class ForLoopGauntlet {
public static void main(String[] args) {
challenge5();
	
}
public static void challenge1(){
for (int i = 0; i < 101; i++) {
System.out.println(i);
	
}
}
public static void challenge2(){
for (int i = 100; i > -1; i--) {
System.out.println(i);
	
}
}
public static void challenge3(){
for (int i = 2; i < 101; i=i+2) {
System.out.println(i);
	
}
}
public static void challenge4(){
for (int i = 1; i < 100; i=i+2) {
System.out.println(i);
	
}
}
public static void challenge5(){
for (int i = 1; i < 501; i++) {
	System.out.print(i);
if(i%2==0){
System.out.println(" even");
}
else{
System.out.println(" odd");
}
}






}
}
