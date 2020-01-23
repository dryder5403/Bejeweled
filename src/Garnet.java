import java.awt.Color;
import java.awt.Image;

public class Garnet extends Jewel {
	static Image garnetImage;
	// I found the locations below by a little bit of guess and 
	// check to find a rectangle that bounded the image of the 
	// Emerald.
	static final int EM_X=1069, EM_Y=183, EM_W = 1195, EM_H=295;
	
	public Garnet(int r, int co) {
		super(Color.GREEN, getImage(), r, co);
	}

	private static Image getImage() {
		if(garnetImage == null)
			garnetImage= openImageFromSpriteSheet(EM_X, EM_Y, EM_W, EM_H);
		return garnetImage;
	}

}
