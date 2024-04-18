package kadai_018;

abstract public class Kato_Chapter18 {
	
	public String familyName = "加藤"; //姓を表す
	
	public String givenName = "";
	
	public String address = "住所は東京都中野区○×です";    //住所を表す
	
	
	public void commonIntroduce(String givenName) { //共通の紹介を出力する
		
		this.givenName = givenName;
		
		//System.out.println("名前は" + this.familyName + this.givenName + "です");
		//System.out.println( address );
	}
	
	
	
	abstract public void eachIntroduce(); //個別の紹介を出力する
	
	
	
	public void execIntroduce() { //紹介を実行する
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println( address );
	}
}

