package gui_module;

import processing.core.PApplet;
import processing.core.PImage;

public class MyDisplay extends PApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PImage img;
	
	public void setup()
	{
		size(400,400);
		background(255);
		stroke(0);
		img = loadImage("http://cseweb.ucsd.edu/~minnes/palmTrees.jpg","jpg");
		img.resize(0, height);
		image(img,0,0);
	}
	
	public void draw()
	{
		
		int[] color = sunColorSec(second());
		fill(color[0],color[1],color[2] );
		ellipse(width/4,height/5,width/4,height/5);
		/*
		fill(0,0,0);
		ellipse(120,130,50,70);
		ellipse(280,130,50,70);
		noFill();
		strokeWeight(6);  // Thicker
		arc(200,250,250,200,0,PI);
*/
		
	}

	private int[] sunColorSec(float seconds) {
		int[] rgb =new int[3];
		float diffFrom30 = Math.abs(30-seconds);
		float ratio =diffFrom30/30;
		rgb[0]=(int)(255*ratio);
		rgb[1]=(int)(255*ratio);
		rgb[2]=0;
		
		return rgb;
	}

}
