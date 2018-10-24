/**
 * 
 */
package generator;

/**
 * @author Zhijie
 *
 */
public class MazeGenerator {
	private String row1 = "+-+-+-+-+";
	private String row2 = "| | | | |";
	public void gMaze() {
		System.out.println(row1);
		System.out.println(row2);
		System.out.println(row1);
		System.out.println(row2);
		System.out.println(row1);
		System.out.println(row2);
		System.out.println(row1);
		System.out.println(row2);
		System.out.println(row1);
	}
	
	public void gMaze(int seed) {
		
	}
	
	public static void main(String[] args) {
		MazeGenerator gen = new MazeGenerator();
		gen.gMaze();
	}
}
