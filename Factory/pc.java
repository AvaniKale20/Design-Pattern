package Factory;



public  class pc extends computer {
	private String ram;
	public pc(String ram, String cpu, String hdd) {
		super();
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}
	public pc()
	{
		
	}
	private String cpu;
	private String hdd;
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	@Override
	public String toString() {
		return "pc [ram=" + ram + ", cpu=" + cpu + ", hdd=" + hdd + "]";
	}
	@Override
	public String RAM() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String HDD() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String cpu() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
