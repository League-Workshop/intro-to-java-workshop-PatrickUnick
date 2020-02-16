PImage catPic;
int x1 = 649;
  int x2 = 578;
  int y1 = 310;
  int y2 = 324;
void setup(){
  size(1000,1000);
  catPic = loadImage("cat.jpg");
  catPic.resize(1000,1000);
  background(catPic);
}
void draw(){

fill(random(0,255),random(0,255),random(0,255));
noStroke();

ellipse(x1,y1,30,20);
ellipse(x2,y2,30,20);

}

void keyPressed() {
  x1++;
  x2++;
  y1++;
  y1++;
}
