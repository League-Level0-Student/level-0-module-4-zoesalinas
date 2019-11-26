
void setup() {
  PImage face = loadImage("night_witch.png");
  size(1000,600);
    face.resize(width,height);
    background(face);
}

void draw() {
if(mouseX<348){
    mouseX=348;
  }
  if(mouseX>403){
   mouseX=403;
  }
  if(mouseY<174){
    mouseY=174;
  }
  if(mouseY>225){
    mouseY=225;
  }
  if(mousePressed){
    println(mouseX+" "+mouseY);
  }
  fill(#FFFFFF);//left eye
  ellipse(375, 200, 75, 75);
  fill(#000000);
  ellipse(mouseX, mouseY, 25, 25);
   fill(#FFFFFF); //right eye
  ellipse(631, 196, 75, 75);
   fill(#000000);
  ellipse(mouseX+256, mouseY-4, 25, 25);
}
