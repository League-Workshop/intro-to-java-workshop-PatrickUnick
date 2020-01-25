PImage zucc;
PImage mustache;
void setup() {
  size(1000,1000);
zucc = loadImage("zucc.jpg");
zucc.resize(width,height);
mustache = loadImage("moustache.png");
mustache.resize(100,300);
}


void draw() {
background(zucc);
if (mousePressed) {
  image(mustache, 150, 400);
}

}
