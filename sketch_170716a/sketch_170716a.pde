void setup(){
  size(500,500);
  
  
   
}

void draw(){
  noFill();
  for(int i=150; i>0; i= i-15){
    if(i%2 ==0){
      fill(255,0,0);
      ellipse(250,250,i,i);
    }
     else{
       fill(255,255,255);
       ellipse(250,250,i,i);
      
  
  
  
  
     } 
  
}
}