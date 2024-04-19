package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public void serch(String fruits) {
		
    	HashMap<String, String> dictionary = new HashMap<String, String>();
    	dictionary.put("apple", "りんご");
    	dictionary.put("peach", "桃");
    	dictionary.put("banana", "バナナ");
    	dictionary.put("lemon", "レモン");
    	dictionary.put("pear", "梨");
    	dictionary.put("kiwi", "キウイ");
    	dictionary.put("strawberry", "いちご");
    	dictionary.put("grape", "ぶどう");
    	dictionary.put("muscat", "マスカット");
	    dictionary.put("cherry", "さくらんぼ");
	    
	    int cnt = 0;
	    
	    for(String key : dictionary.keySet()) {
	    	if(key == fruits) {
	    		System.out.println(key + "の意味は" + dictionary.get(key));
	    	} else if(key != fruits) {
	    		cnt++;
	    	}
	    }
	    
	    if(cnt == 10) {
	    	System.out.println(fruits + "は辞書に存在しません");
	    }		
	}
}
