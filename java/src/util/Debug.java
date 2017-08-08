package util;

public class Debug {
	public static void debugln(String str) {
		// スタックトレース配列
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();

		// ログ文字列
		String log = "";

		// スタックトレースのリミット
		int underLimit = 2;

		// スタックトレースをログに格納
		for (int i = ste.length - 1; underLimit <= i; i--) {
			String clazz = ste[i].getClassName();
			String method = ste[i].getMethodName();
			log += clazz + "::" + method + "()";
			if (i != underLimit) {
				log += "->";
			}
		}

		// ログメッセージ追加
		log += " : " + str;

		// ログ出力
		System.out.println(log);
	}
}