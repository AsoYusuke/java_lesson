package JavaBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_102_2 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("時間を入力してください。");
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			if (0 <= n && 11 >= n) {
				System.out.println("おはようございます");
			} else if (12 == n) {
				System.out.println("お昼です");
			} else if (13 <= n && 18 >= n) {
				System.out.println("こんにちは");
			} else if (19 <= n && 23 >= n) {
				System.out.println("こんばんは");
			} else {
				System.out.println("時刻の範囲を超えています");
			}			
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字の形式が正しくありません");
		}
	}
}
