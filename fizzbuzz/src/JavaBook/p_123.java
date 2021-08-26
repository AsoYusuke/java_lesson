package JavaBook;


import java.io.*;

public class p_123 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("飲み物は何が好きですか？");
			System.out.println("1 オレンジジュース");
			System.out.println("2 コーヒー");
			System.out.println("3 ミルク");
			System.out.println("1~3 どれかを選択してください。");
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			switch (n) {
			case 1:
				System.out.println("オレンジジュースです。");
				break;
			
			case 2:
				System.out.println("コーヒーです。");
				break;
				
			case 3:
				System.out.println("ミルクです。");
				break;
				
			default:
				System.out.println("どれでもありません。");
				break;
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字の形式が正しくありません。");
		}
	}

}
