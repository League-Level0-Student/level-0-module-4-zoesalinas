void setup() {
  PImage waldo = loadImage("Where's Waldo.jpg"); // Change this to match your file name.
  size(500, 500);
  waldo.resize(width, height);
  image(waldo, 0, 0);
 woohoo = minim.loadSample("drum beats.mp3"); //drag and drop from project onto sketch
  //woohoo = minim.loadSample("drum beats.mp3"); //drag and drop from project onto sketch } 
}

void draw() {
      // Use this print statement to find out the coordinates of Waldo
       println("X: " + mouseX + " Y: " + mouseY); 
//210 95
      // If the mouse is on Waldo, print “Waldo found!”
if(mouseX==210&&mouseY==95){
  playDoh();
}
      // If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;
