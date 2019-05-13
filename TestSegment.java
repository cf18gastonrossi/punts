import static org.junit.Assert.*;

import org.junit.Test;

public class TestSegment {

	public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestPunt");
    }
	
	@Test
	public void testSegmentLongitud() {
		Punt p1 = new Punt(3,3);
		Punt p2 = new Punt(3,3);
		Segment H = new Segment(p1,p2);
		AssertEquals(3,H.longitud(p1, p2));
	}

	private void AssertEquals(double d, double longitud) {
		// TODO Auto-generated method stub
		
	}

}
