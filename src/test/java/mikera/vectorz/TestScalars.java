package mikera.vectorz;

import org.junit.Test;
import static org.junit.Assert.*;

import mikera.arrayz.TestArrays;
import mikera.vectorz.impl.DoubleScalar;

public class TestScalars {

	private void testAsVector(AScalar s) {
		AVector v=s.asVector();
		assertEquals(1,v.length());
		assertEquals(s.get(),v.get(0),0.0);
	}

	private void testScalar(AScalar s) {
		testAsVector(s);
		assertEquals(0,s.dimensionality());
		assertEquals(new Double(s.get()).hashCode(),s.hashCode());
		
		new TestArrays().testArray(s);
	}
	
	@Test public void genericTests() {
		testScalar(new DoubleScalar(1.0));
	}

}
