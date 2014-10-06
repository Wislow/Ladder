package ladder;

public class Row {
	int[] rows;
	
	Row(int numOfRows){
		rows = new int[numOfRows];
	}
	
	void drawRows(int rowSeq) {
		rows[rowSeq] = 1;
		rows[rowSeq + 1] = 1;
		for (int a=0; a<rows.length ; a++) {
			System.out.print(rows[a]);
		}
	}
	
	int moveRow(int startPoint) {
		if (isNoLine(startPoint)) {
			return startPoint;
		}
		if (canMoveToRight(startPoint)) {
			return startPoint + 1;
		}
		return startPoint - 1;
	}

	private boolean canMoveToRight(int startPoint) {
		return startPoint < (rows.length-1) && rows[startPoint + 1] == 1;
	}

	private boolean isNoLine(int startPoint) {
		return rows[startPoint] == 0;
	}
}
