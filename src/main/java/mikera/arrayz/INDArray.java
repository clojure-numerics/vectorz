package mikera.arrayz;

import mikera.vectorz.AVector;
import mikera.vectorz.IOp;
import mikera.vectorz.Op;

/**
 * Interface for general multi-dimensional arrays of doubles
 * @author Mike
 */
public interface INDArray {
	
	public int dimensionality();
	
	public int[] getShape();
	
	public double get(int... indexes);
	
	public AVector asVector();
	
	public INDArray reshape(int... dimensions);
	
	public INDArray slice(int majorSlice);
	
	public long elementCount();
	
	/**
	 * Returns true if the INDArray is mutable (at least partially)
	 * @return
	 */
	public boolean isMutable();
	
	/**
	 * Returns true if the INDArray is fully mutable in all positions
	 * i.e. every position can store any valid double value
	 * @return
	 */
	public boolean isFullyMutable();
	
	/**
	 * Return true if this is a view
	 * @return
	 */
	public boolean isView();

	public INDArray clone();

	/**
	 * Applies a unary operator to all elements of the array (in-place)
	 * @param op
	 */
	void applyOp(Op op);

	/**
	 * Applies a unary operator to all elements of the array (in-place)
	 * @param op
	 */
	void applyOp(IOp op);
	
	public boolean equals(INDArray a);
	

}
