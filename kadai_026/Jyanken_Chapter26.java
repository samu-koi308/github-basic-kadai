package kadai_026;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	
	String myKey;
	String yourKey;
	String yourSelect;
	String yourHand;
	String myHand;
	
	
	public String getMyChoice() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();

		while(input != null) {
		
    	    if(input.equals("r")) {
        		myKey = input;
        		break;
        	} else if(input.equals("s")) {
    	    	myKey = input;
	        	break;
	        } else if(input.equals("p")) {
	        	myKey = input;
	        	break;
    	    } else {
    	    	System.out.println("入力した手が間違っています、もう一度じゃんけんの手を入力してください");
    	    	getMyChoice();
    	    	break;
    	    }
		}
	    
		scanner.close();
		return myKey;
	}
	
	
	
	public String getRandom() {
		String[] select = {"グー", "チョキ", "パー"};
		int random = (int) (Math.floor(Math.random() * 3));
		
		if(random == 0) {
			yourSelect = select[0];
			yourKey = "r";
		}else if(random == 1) {
			yourSelect = select[1];
			yourKey = "s";
		}else {
			yourSelect = select[2];
			yourKey = "p";
		}
		return yourSelect;
	}
	
	
	
	public void playGame() {
		HashMap<String, String> hand = new HashMap<String, String>();
    	hand.put("r", "グー");
    	hand.put("s", "チョキ");
    	hand.put("p", "パー");
    	
    	myHand = hand.get(myKey);
    	yourHand = hand.get(yourKey);
    	
    	System.out.println("自分の手は" + myHand + ",対戦相手の手は" + yourHand);

		if((myHand == "グー" && yourHand == "グー") || (myHand == "チョキ" && yourHand == "チョキ") || (myHand == "パー" && yourHand == "パー" )) {
			System.out.println("あいこです");
		}else if((myHand == "グー" && yourHand == "チョキ") || (myHand == "チョキ" && yourHand == "パー") || (myHand == "パー" && yourHand == "グー" )) {
			System.out.println("自分の勝ちです");
		}else if((myHand == "グー" && yourHand == "パー") || (myHand == "チョキ" && yourHand == "グー") || (myHand == "パー" && yourHand == "チョキ" )) {
			System.out.println("自分の負けです");
		}
	}
}
