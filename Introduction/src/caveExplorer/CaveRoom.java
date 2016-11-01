package caveExplorer;

public class CaveRoom {

	public CaveRoom(String description){
		
	}
//	"final" never changes
//	constants are public and ALL-CAPS
//	example: Math.PI;
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;
	
	private String description;
	private String contents;
	private String defaultContents;
	
	private CaveRoom[] borderingRooms;
	private Door[] doors;
	
	public void enter() {
//		sets up cave when it gets entered
	}
	
}
