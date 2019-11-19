
void setup() {
  PImage face = loadImage("night_witch.png");
  size(1000,600);
    face.resize(width,height);
    background(face);
}

void draw() {
  fill(#FFFFFF);
  ellipse(375, 200, 75, 75);
  fill(#000000);
  ellipse(375, 200, 25, 25);
}
