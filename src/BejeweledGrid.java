import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BejeweledGrid {
	/**
	 * The 2D array of jewels
	 */
	private Jewel[][] jewels;
	/** Offsets for drawing the grid of Jewels*/
	public static final int OFFSET_X = 40, OFFSET_Y = 20; 
	private boolean firstClick = true;
	private int TYPE = 7;
	public BejeweledGrid() {
		jewels = new Jewel[5][5];
		jewels[2][2] = new Emerald(2,2);
	}

	/** directs each Jewel to draw itself.  The Jewel knows its row
	 * and column and can ask the grid for the offset info
	 * @param g Graphics context onto which the Jewels will draw themselves
	 */
	public void draw(Graphics g) {
		for(Jewel[] row:jewels) {
			for(Jewel j:row) {
				if(j!=null)
				{
					j.draw(g);
				}
			}
		}

	}

	/** swaps the Jewels at the specified locations.  Also must
	 * tell the Jewels to set their rows and cols appropriately.
	 * @param r1 row of Jewel 1
	 * @param c1 col of Jewel 1
	 * @param r2 row of Jewel 2
	 * @param c2 col of Jewel 2
	 */
	public void swap(int r1, int c1, int r2, int c2) {
		Jewel temp = jewels[r1][c1];

		// more of course tell the Jewels they are changing locations
	}

	/**
	 * Creates an ArrayList<Jewel> of all Jewels that are part of a
	 * three-in-a-row.  The same Jewel may appear in the List more than
	 * once.
	 * @return
	 */
	public ArrayList<Jewel> _3InARow() {
		ArrayList<Jewel> list = _3InARowHor();
		list.addAll(_3InARowVert());
		return list;
	}

	/**
	 * 
	 * @return returns an ArrayList of Jewels that make up three or more in 
	 *         a row vertically or an empty list if fewer than 3 in a row exist
	 */
	private ArrayList<? extends Jewel> _3InARowVert() {

		return null;
	}
	/**  
	 * @return returns an ArrayList of Jewels that make up three or more in 
	 *         a row horizontally or an empty list if fewer than 3 in a row exist
	 */
	private ArrayList<Jewel> _3InARowHor() {

		return null;
	}
	/**
	 * This method drops all Jewels that should drop...
	 * Basically, any Jewel that has no Jewel below it needs to 
	 * be in a higher row.  Lots of ways to approach this.
	 */
	public void drop() {

	}

	/**
	 * Fill in any empty positions in the grid with randomly selected Jewel
	 */
	public void refill() {
		for(int r; r< jewels.length;r++) {
			for(int c = 0; c < jewels.length;c++) {
				if(jewels) [r][c] == null){
					jewels[r][c] = 
				}
			}
		}
	}

	/**
	 * Generates a random Jewel that will have its starting location
	 * at the specified row and col.
	 * @param r row where the Jewel will be placed
	 * @param c col where the Jewel will be placed
	 * @return random type of Jewel constructed at r,c
	 */
	private Jewel randomJewel(int r, int c) {
		int num = (int)(Math.random()* TYPE);
		if(num == 1)return new Emerald(r,c);
		if(num ==2) return new Ruby(r,c);
		if(num == 3)return new Garnet(r,c);
		if(num == 4)return new Pearl(r,c);
		if(num == 5)return new Amethyst(r,c);
		if(num == 6)return new Diamond(r,c);
		if(num == 7)return new Sapphire(r,c);
		return null;
	}

	/**
	 * This method is called by the game when a click has been made 
	 * on the panel.  Must determine if the click makes sense (is it 
	 * a valid location, is there a Jewel at the location, can that 
	 * Jewel be clicked).  If it is the first click, then note it and
	 * the next click will attempt a move (maybe).
	 * @param me
	 */
	public void justClicked(MouseEvent me) {


	}

}
