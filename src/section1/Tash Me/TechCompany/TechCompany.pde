PImage Facebook;

PImage Google;

PImage Apple;

void setup(){
   Google = loadImage("Google.jpg");
   Facebook = loadImage("Facebook.png");
   Apple = loadImage("Apple.png");
size(800, 600);

Google.resize(width,height);
Facebook.resize(200,200);
Apple.resize(300,300);

}
void draw(){
  background(Google);
  if (mousePressed){
    if (mouseButton == LEFT){
      image(Facebook,mouseX,mouseY); 
    }
    
    if (mouseButton == RIGHT){
      image(Apple,mouseX,mouseY);
                }
  }
}