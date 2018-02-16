int x=0;
void setup(){
  size(800,600);
}
void draw(){
  if(mousePressed){
  fill(0,0,255);
  }
  else{
    fill(0,255,0);
  }
  ellipse(x,500,200,200);
}

  