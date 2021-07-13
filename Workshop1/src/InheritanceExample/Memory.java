package InheritanceExample;

public class Memory {
	private int Memory_id,size;

	public Memory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Memory(int memory_id, int size) {
		super();
		Memory_id = memory_id;
		this.size = size;
	}

	public int getMemory_id() {
		return Memory_id;
	}

	public void setMemory_id(int memory_id) {
		Memory_id = memory_id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}
