import org.junit.*;
import static org.junit.Assert.*;    // importa una classe static

public class TestPunt {
    @Test
    public void testPuntConstructor() {
        // comprova que el constructor Punt() pugui ser cridat
        Punt p = new Punt();
    }

    @Test
    public void testPuntBuit() {
        // comprova que el constructor Punt() deixi a 0 els valors
        Punt p = new Punt();
        assertEquals(0, p.getX()); // Afi rma que la coordenada x val 0
        assertEquals(0, p.getY());
    }
    
    @Test
    public void testPuntSetX() {
        // comprova que el constructor Punt() deixi a 0 els valors
        Punt p = new Punt();
        p.setX(12);
        p.setY(13);
        assertEquals(12, p.getX()); // Afi rma que la coordenada x val 0
        assertEquals(13, p.getY());
    }
    @Test
    public void testPuntDefinit() {
        // comprova que el constructor Punt(int,int) deixi els valors correctes
        Punt p = new Punt(3, 4);
        assertEquals(3, p.getX());
        assertEquals(4, p.getY());
    }
    
    @Test
    public void testPuntSuma() { 
    	Punt p = new Punt(3, 4);
    	p.suma(p);
    	assertEquals(6, p.getX());
    	assertEquals(8, p.getY());
    }

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestPunt");
    }
}