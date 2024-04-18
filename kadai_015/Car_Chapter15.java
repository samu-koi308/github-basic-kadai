package kadai_015;

public class Car_Chapter15 {	
	
	private int gear = 1;   //1速から5速のギアを表す
	private int speed = 10; //ギアチェンジ後の速度を表す
		
	public void gearChange(int afterGear) { //ギアの値により速度を変える
		
		switch(afterGear) {
		    case 1  -> speed = 10;
		    case 2  -> speed = 20;
		    case 3  -> speed = 30;
		    case 4  -> speed = 40;
		    case 5  -> speed = 50;
		    default -> speed = 10;
		}
		    
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました。");
		
	}
	
	
	
	public void run() { 
		
		switch(speed) {
		case 10  -> System.out.println("速度は時速10kmです。");
		case 20  -> System.out.println("速度は時速20kmです。");
		case 30  -> System.out.println("速度は時速30kmです。");
		case 40  -> System.out.println("速度は時速40kmです。");
		case 50  -> System.out.println("速度は時速50kmです。");
		default  -> System.out.println("速度は時速10kmです。");
		}
	}
}
