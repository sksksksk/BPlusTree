
public class Data {
	private int data1;
	private int data2;
	private int data3;
	private int data4;
	
	public Data(int data1, int data2, int data3, int data4) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}

	@Override
	public String toString() {
		
		return "data1: "+data1+", data2: "+data2+", data3: "+data3+", data4: "+data4;
	}
}
