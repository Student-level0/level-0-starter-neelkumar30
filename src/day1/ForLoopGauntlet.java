package day1;

public class ForLoopGauntlet {
public static void main(String[] args) {
challenge10();
	
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


public static void challenge6(){
for (int i = 7; i < 778; i=i+7) {
	System.out.println(i);

}
}

public static void challenge7(){
for (int i = 0; i < 3; i=i+1) {
	for (int j = 0; j <3; j++) {
		
	
	System.out.println(i + " " + j);
	}
}
}

public static void challenge8(){
for (int i = 1; i < 10; i=i+3) {
	for (int j = i; j < i + 3; j++) {
		
	
	
	System.out.print(j);
	}	
	System.out.println();
}
	
}

public static void challenge9(){
for (int i = 1; i < 101; i=i+10) {
	for (int j = i; j < i + 10; j++) {
		
	
	
	System.out.print(" " + j);
	}	
	System.out.println();
}	
}

public static void challenge10(){
for (int i = 1; i <8 ; i=i+1) {	
	for (int j = 0; j < i; j++) {
		
	
	System.out.print("*");	
	}
	System.out.println();
}	
}






}











