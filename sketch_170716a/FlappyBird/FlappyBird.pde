void setup(){
size (700,700);
  
  
}
int birdX = 350;
int birdY = 350;
double Velocity = 15;
double Gravity = 6;
double Right = 0;
double Left = 5;
int PipeX = 100;
int PipeY = 350;
int random = (int) random(100, 400);
boolean Check = true;
void draw(){
    background(255, 255, 255);
    fill(10,255,154);
    ellipse(birdX,birdY, 30,30);
    if(mousePressed && Check == true){
      birdY -= Velocity;
      Check = false;
    }
    else{
      birdY += Gravity;
    }
    if(mousePressed){
      Check = true;    
    }
    fill(0,230,0);
    rect(PipeX,PipeY, 80,700);
     if(mousePressed){
      PipeX -= Left;
    }
    else{
      PipeX -= Left;
    }
    if(PipeX == 0){
      PipeX = 700;
      PipeY = random;
    } 
    rect(PipeX, PipeY - 200, 80, -600);
    
    if(birdY >= 700){
      print("Game Over");
      exit();
    }
    if(birdY <= 0){
      print("Game Over");
      exit();
    }
    if(birdY >= PipeY && birdY <= PipeY + 700 && birdX >= PipeX && birdX <= PipeX + 100){
    print("Game Over");
    exit();
    }
}




//10. Set the pipes y value to a new random number each time it teleports
//int random = (int) random(100, 400)

//11. Make the game end when the bird hits the pipe. Figure it out by yourself, or use this method:
//boolean intersects(int birdX, int birdY, int paddleX, int paddleY, int paddleLength) {
//if (birdY > paddleY - 4 && birdX > paddleX && birdX < paddleX + paddleLength)
//return true;
//else 
//return false;
//}

//12. Make a second pipe that comes down from the sky
//fill(red, green, blue)    //in draw method
//rect(x, y, width, height)    //in draw method

//13. Repeat steps 8-10 for this pipe 
//  //it shouldn’t look any different from before yet

//14. Create a gap between the pipes
//  //the x values of the pipes need to be the same value
//  //make sure both pipes y values are set to the same random number
//  //then subtract (pipe height + gap length) from the upper pipe’s y value

//15. End the game when the bird hits the ground
//  //you can make a rectangle for the ground
//  //you’ll need a boolean  variable that is declared at the top of your sketch

//16. Create a score and make it increase each time the bird passes through a pipe
//text(text, xPosition, yPosition)

//17 (Optional). Make a sound when the bird flaps.
//  //drop the sound file onto your sketch

//  import ddf.minim.*;       //at the very top of your sketch
//  Minim minim;        //as a member variable
//  AudioSample sound;      //as a member variable
//  minim = new Minim (this);    //in the setup method
//  sound = minim.loadSample("BD.mp3", 128);//in the setup method
//  sound.trigger();        //in mouseReleased() method (when the bird flaps)
 