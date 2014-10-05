package ladder;

public class Ladder {
	int[][] matrix;
	
	Ladder(int rows, int entry){
		matrix = new int[rows][entry];
	}
	
	public static void main(String[] args) {

	}

	public int run(int startPoint) {
		for (int[] row : matrix) {
			if (row[startPoint] == 0) {
				continue;
			}
			if (startPoint < (row.length-1) && row[startPoint + 1] == 1) {
				startPoint += 1;
				continue;
			}
			startPoint -= 1;
			continue;
		}
		return startPoint;
	}

	public void drawLine(int row, int startPoint) {
		matrix[row][startPoint] = 1;
		matrix[row][startPoint + 1] = 1;
	}
}
