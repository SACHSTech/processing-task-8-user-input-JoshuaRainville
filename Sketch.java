import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

  //String Variable
  String yourMessage = "";

  //KeyCode Variables
  float circleX = 100;
  float circleY = 100;
  
  public void setup() {
    background(210, 255, 173);
    textSize(30);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

  //Makes small blue circles
   if (mousePressed) {
    fill(0, 255, 255);
    ellipse(mouseX, mouseY, 25, 25);
  }

    //Changes background
   if(keyPressed){
     if(key == '1'){
       background(255, 0, 0);
     }
     else if (key == '2'){
       background(0, 255, 0);
     }
     else if (key == '3'){
       background(0, 0, 255);
     }
   }

    //Makes Text appear
   text(yourMessage, 25, 75);

    
}

    public void mouseDragged(){

    fill(0);
    rect((float) (width/1.333), (float) (height*.175), (float) (width/5), (float) (height/5));
}

    public void mouseClicked() {
    fill(255);
    ellipse(mouseX, mouseY, 50, 50);
}

    public void keyTyped(){
      yourMessage += key;
    }

    public void keyPressed(){
      if (keyPressed) {
    if (keyCode == UP) {
      circleY--;
    } 
    else if (keyCode == DOWN) {
      circleY++;
    } 
    else if(keyCode == LEFT){
      circleX--;
    }
    else if(keyCode == RIGHT){
     circleX++; 
    }
  } 

  ellipse(circleX, circleY, 50, 50);
}
    }
  
