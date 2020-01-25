
void setup(){
  size(1000,1000);
 
}
void draw(){
  float a = 0.0;
float inc = TWO_PI/mouseX;
for (int i = 0; i < 25; i++) {
  line(i*4, 50, i*4, 50+cos(a)*40.0);
  a = a + inc;
}
  }
