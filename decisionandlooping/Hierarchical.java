package decisionandlooping;

class FourWheeler{
	int wheel = 4;
}
class HondaAmaze extends FourWheeler{
	int speed = 100;
}
class JaguarXL extends FourWheeler{
	int speed = 200;
}
public class Hierarchical {
	public static void main(String args[]) {
		HondaAmaze ha = new HondaAmaze();
		JaguarXL jxl = new JaguarXL();
		
		System.out.println(ha.wheel + ", " + ha.speed);
	}

}

