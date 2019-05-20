package Factory;


public class TestFactory {
	public static void main(String[] args) {
		computer pc = computer_factory.getcomputer("pc","2 GB","500 GB","2.4 GHz");
		computer server = computer_factory.getcomputer("server","16 GB","1 TB","2.9 GHz");
		computer laptop=computer_factory.getcomputer("laptop", "32 GB", "2 TB", "3.9GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
		System.out.println("Factory laptop config::"+laptop);
	}

}
