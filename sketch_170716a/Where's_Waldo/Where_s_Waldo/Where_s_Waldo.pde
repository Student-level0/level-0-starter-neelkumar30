// 1. Find a really hard Where’s Waldo puzzle, save it, and drop it onto this sketch.
import ddf.minim.*;
Minim minim = new Minim(this);   
AudioSample doh;
AudioSample woohoo;
void playWoohoo() {
  woohoo.stop();
  woohoo.trigger();
}

void playDoh() {
  doh.stop();
  doh.trigger();
}
void setup() {
  PImage waldo = loadImage("Waldo.jpg"); // 2. Change this to match your file name.
  size(1500, 900);
  doh = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-doh.wav");
  woohoo  = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-woohoo.wav");
  waldo.resize(1500, 900);
  background(waldo);
  size(waldo.width, waldo.height);
  image(waldo, 0, 0);
}

void draw() {
  // 3. Use this print statement to find out the coordinates of Waldo
  // println("X: " + mouseX + " Y: " + mouseY); 
  //println("X:  " + mouseX + " Y: " + mouseY);
boolean WaldoFound = false;
  // 4. If the mouse is on Waldo, print “Waldo found!”
  if(mousePressed){
    if(mouseX > 963 && mouseX < 1026 && mouseY > 816 && mouseY < 880){
      println("Waldo Found");
      WaldoFound = true;
       }
  

  // 5. If Waldo is found, also use the method below to play “Woohoo”
   if(WaldoFound == true){
      playWoohoo();
   } 

  // 6. If the mouse is pressed and they’re not on Waldo, play “Doh”
  else{
    playDoh();
  }
  }
   






}