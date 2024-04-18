package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		Kato_Chapter18 taro   = new KatoTaro_Chapter18();
		Kato_Chapter18 ichiro = new KatoIchiro_Chapter18();
		Kato_Chapter18 hanako = new KatoHanako_Chapter18();
		
		taro.commonIntroduce("太郎");
		taro.execIntroduce();
		taro.eachIntroduce();
		
		
		ichiro.commonIntroduce("一郎");
		ichiro.execIntroduce();
		ichiro.eachIntroduce();
		
		
		hanako.commonIntroduce("花子");
		hanako.execIntroduce();
		hanako.eachIntroduce();

	}
}
