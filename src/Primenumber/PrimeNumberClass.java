package Primenumber;

public class PrimeNumberClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("1から100の間の素数は下記になります。");
		System.out.println();
		for (int n = 2; n < 100; n++) { //1から100までの整数、1つずつ加算
			int a; //整数a定義
			for (a = 2; a <= n; a++) { //nと同じになるまで1つずつ加算
				if (n % a == 0) //nをaで割り切れるか
					break; //nをaで割り切れた場合breakで抜ける
			}
			if (a == n) //breakで抜けた後、nとaが同じ数であった場合素数となる
				System.out.println(n);
		}
	}

}
