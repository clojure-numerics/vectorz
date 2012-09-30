package mikera.vectorz;

@SuppressWarnings("serial")
abstract class IndexedVector extends AVector {
	protected final int[] indexes;
	protected final int length;

	protected IndexedVector(int length) {
		indexes=new int[length];
		this.length=length;
	}
	
	public IndexedVector(int[] indexes) {
		this.indexes=indexes;
		this.length=indexes.length;
	}
	
	@Override
	public boolean isReference() {
		return true;
	}

	@Override
	public int length() {
		return length;
	}
}