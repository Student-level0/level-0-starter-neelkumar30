int x1 = 150;
int x2 = 650;
int height = 550;
int speed = 1;

void setup(){
  size(800,800);
  
  
   
}

void draw(){
  background(255,255,255);
  noFill();
  x1 = x1 + speed;
  x2 = x2 - speed;
  
  if(x2<150 || x1<150){
    speed = -speed;
  }
 
      
  for(int i=250; i>0; i= i-5){
       noFill();
      ellipse(x1, 550, i, i); 
  }
for(int j=250; j>0; j= j-5){
      ellipse(x2,550,j,j);
}     
  
     
  
}
