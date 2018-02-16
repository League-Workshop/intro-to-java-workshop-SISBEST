int x=0;
void setup(){
  size(800,600);
}
void draw(){
  if(mousePressed){
  fill(0,255,0);
  x++;
  }
  else{
    fill(0,0,255);
    x++;
  }
  ellipse(x,500,200,200);
}

  