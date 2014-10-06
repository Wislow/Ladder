package ladder;

public class Ladder {
	Row[] tempRows;
	
	Ladder(int rows, int entry){
		tempRows = new Row[rows];
		for (int i=0 ; i<rows ; i++) {
			tempRows[i] = new Row(entry);
		}
	}

	public int run(int startPoint) {
		for (Row row : tempRows) {
			startPoint = row.moveRow(startPoint);
		}
		return startPoint;
	}

	public void drawLine(int row, int startPoint) {
		tempRows[row].drawRows(startPoint);
	}
	
//	public static void main(String[] args) {
//		
//	}
}
