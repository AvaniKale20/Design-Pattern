package Factory;


public  class laptop extends computer {
private String ram;
private String cpu;
private String hdd;
public laptop(String ram, String cpu, String hdd)
{
	super();
	this.ram=ram;
	this.cpu=cpu;
	this.hdd=hdd;
}
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
	return "laptop [ram=" + ram + ", cpu=" + cpu + ", hdd=" + hdd + "]";
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
