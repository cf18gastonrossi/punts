import static org.junit.Assert.*;

import org.junit.Test;

public class TestSegment {

	public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestPunt");
    }
	
	@Test
	public void testSegmentLongitud() {
		Segment S = new Segment(5,5,5,5);
		AssertEquals(5.00,S.Longitud(5,5,5,5));
	}

	private void AssertEquals(double d, double longitud) {
		// TODO Auto-generated method stub
		
	}

}
