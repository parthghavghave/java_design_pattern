package Prototype;

public class NetworkConnection implements Cloneable{
	
	private String ip;
	private String importantData;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getImportantData() {
		return importantData;
	}
	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	
	public void loadVeryImportantData() throws InterruptedException {
		this.importantData = "Important Data";
		Thread.sleep(2000);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public String toString() {
		return this.ip+": "+this.importantData;
	}

}
