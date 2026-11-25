import java.util.Scanner;

class algo006{
    public static void main(String[] args){

        //初期処理
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] score = new int[n]; //得点差を入れる配列

        //AとBの各点数を取得
        String[] aScores = sc.nextLine().split(" ");
        String[] bScores = sc.nextLine().split(" ");

        //得点差を計算
        for (int i = 0; i < n; i++){
            int a = Integer.parseInt(aScores[i]);
            int b = Integer.parseInt(bScores[i]);
            score[i] = a-b;
        }

        //出力
        for(int j = 0; j < n; j++){
            System.out.print(score[j] + " ");
        }
    }
}