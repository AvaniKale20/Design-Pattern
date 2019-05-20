package adapter_design_pattern;

public class AdapterTesting {
public static void main(String[]args)
{
	SocketAdapter socket =new  SocketClassAdapterImpl();
	Volt v3=getVolt(socket, 3);
	Volt v12=getVolt(socket, 12);
	Volt v120=getVolt(socket, 120);
	System.out.println(v3.getVolts());
	System.out.println(v12.getVolts());
	System.out.println(v120.getVolts());
	
}

private static Volt getVolt(SocketAdapter socket, int i) {
	// TODO Auto-generated method stub
	switch(i)
	{

	case 3:return socket.get3Volt();
	case 12:return socket.get12Volt();
	case 120:return socket.get120Volt();
	
	default:return socket.get120Volt();
	}
	}
	
}
