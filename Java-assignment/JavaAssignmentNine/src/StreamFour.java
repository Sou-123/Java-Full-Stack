
public class StreamFour {
	  private StreamThree t;
	  private int year;
	  private int value;
	  
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public StreamFour(StreamThree t,int year, int value) {
		super();
		this.t =t;
		this.year = year;
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transactions [t=" + t + ", year=" + year + ", value=" + value + "]";
	}   
	
}