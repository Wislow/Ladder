package ladder;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.junit.Assert .*;

import org.junit.Test;

public class LadderTest {

	
	private Ladder ladder;

	@Test
	public void noLine() {
		ladder = new Ladder(1, 1);
		//entry 입력받을 때, row.length 보다 큰 인자를 받을 수 없도록 처리필요.
		int endPoint = ladder.run(0);
		assertThat(endPoint, is(0));
	}
	
	@Test
	public void oneLineMoveRight() throws Exception {
		//0 1 1
		ladder = new Ladder(1, 3);
		ladder.drawLine(0, 1);
		
		int endPoint = ladder.run(0);
		assertThat(endPoint, is(0));
		
		endPoint = ladder.run(1);
		assertThat(endPoint, is(2));
		
		//1 1 0
		ladder = new Ladder(1, 3);
		ladder.drawLine(0, 0);

		endPoint = ladder.run(2);
		assertThat(endPoint, is(2));

		endPoint = ladder.run(0);
		assertThat(endPoint, is(1));
	}

	@Test
	public void oneLineMoveLeft() throws Exception {
		//0 1 1
		ladder = new Ladder(1, 3);
		ladder.drawLine(0, 1);
		
		int endPoint = ladder.run(2);
		assertThat(endPoint, is(1));
		
		//1 1 0
		ladder = new Ladder(1, 3);
		ladder.drawLine(0, 0);
		
		endPoint = ladder.run(1);
		assertThat(endPoint, is(0));
	}
	
	@Test
	public void matrixTest() throws Exception {
		// 0 0 1 1 
		// 1 1 0 0
		// 0 1 1 0
		// 0 1 1 0
		
		ladder = new Ladder(4, 4);
		ladder.drawLine(1, 0);
		ladder.drawLine(2, 1);
		ladder.drawLine(3, 1);
		ladder.drawLine(0, 2);
		
		int endPoint = ladder.run(0);
		assertThat(endPoint, is(1));
		
		endPoint = ladder.run(1);
		assertThat(endPoint, is(0));
		
		endPoint = ladder.run(2);
		assertThat(endPoint, is(3));
		
		endPoint = ladder.run(3);
		assertThat(endPoint, is(2));
		
	}
}