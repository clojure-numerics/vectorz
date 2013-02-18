package mikera.arrayz;

import mikera.vectorz.AVector;

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
	 * Returns true if the INDArray is mutable in all positions
	 * @return
	 */
	public boolean isFullyMutable();
	
	/**
	 * Return true if this is a view
	 * @return
	 */
	public boolean isView();

	public INDArray clone();


}
