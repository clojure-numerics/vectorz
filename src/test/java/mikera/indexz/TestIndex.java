package mikera.indexz;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestIndex {
	@Test public void testCreate() {
		Index ind=Index.of(0,1,2);
		assertEquals(3,ind.length());
		
		for (int i=0; i<3; i++) {
			assertEquals(i,ind.get(i));
		}
	}
	
	@Test public void testEquals() {
		Index ind1=Index.of(0,1,2);
		Index ind2=Indexz.createSequence(3);
		Index ind3=Indexz.createSequence(0,3);
		
		assertEquals(ind1,ind2);
		assertEquals(ind2,ind3);
	}
	
	@Test public void testReverse() {
		// length 3
		Index ind1=Index.of(0,1,2);
		Index ind2=Index.of(2,1,0);
		
		assertTrue(!ind1.equals(ind2));
		ind2.reverse();
		assertEquals(ind1,ind2);
		
		// length 4 progressions
		ind1=Indexz.createProgression(10, 4, 2);
		ind2=Indexz.createProgression(16, 4, -2);
		
		assertTrue(!ind1.equals(ind2));
		ind2.reverse();
		assertEquals(ind1,ind2);
	}
}