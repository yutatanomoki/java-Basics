//入力した回数分
import java.util.*;


public class Main {
    public static void main(String[] args) {
        String name = "paiza";
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0;i<n; i++){
            System.out.println(name);
        }
    }
}

//for文を使用した複数行にわたる出力
 
import java.util.*;


public class Main {
    public static void main(String[] args) {
        String name = "paiza";
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0;i<n; i++){
            System.out.println(name);
        }
    }
}

//複数行入力値の出力

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            System.out.println(a);
        }
    }
}

//複数行で入力した整数の中から一番大きな値のみ出力
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int max =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            if(1<=n && n<=50){
                for (int i = 0; i < n; i++) {
                    int a = sc.nextInt();
                     if(max < a){
                     max=a;
                    }
                }
            }
        System.out.println(max);
    }
}

//黒電話問題　未完成
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String s = sc.next();
        String[] s2 = s.split("");
        for (int i = 0; i < s2.length; i++) {
          if(s2[i]=="0"){
              sum += 24;
          }else if(s2[i]=="1"){
              sum += 6;
          }else if(s2[i]=="2"){
              sum += 8;
          }else if(s2[i]=="3"){
              sum += 10;
          }else if(s2[i]=="4"){
              sum += 12;
          }else if(s2[i]=="5"){
              sum += 14;
          }else if(s2[i]=="6"){
              sum += 16;
          }else if(s2[i]=="7"){
              sum += 18;
          }else if(s2[i]=="8"){
              sum += 20;
          }else if(s2[i]=="9"){
              sum += 22;
          }
        }
        System.out.println(sum);
    }
}
//入力した数値、名前の占い結果表示
public class Main {
	public static void main(String[] args) {
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたのの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		int ageString = new java.util.Scanner(System.in).nextInt();
		int age = ageString;
		int fortune = new java.util.Random().nextInt(4);
		fortune = fortune + 1;
		System.out.println("占いの結果が出ました！");
		System.out.println(age+"歳の"+name+"さんあなたの運気番号は"+fortune+"です");
		System.out.println("1:大吉 2中吉 3:吉 4:凶 ");
	}
}

//数当てゲーム
public class Main {
	public static void main(String[] args) {
		System.out.println("【数当てゲーム】");
		int ans = new java.util.Random().nextInt(10) + 1;
		 for(int i=0;i<5;i++){
		     System.out.println("0〜9の数字を入力してください");
		     int num = new java.util.Scanner(System.in).nextInt();
		     if(num==ans){
		         System.out.println("アタリ！");
		         break;
		     }else{
		         System.out.println("違います");
		     }
		 }
		System.out.println("ゲームを終了します");
	}
}

//拡張for文を使用した記述

public class Main {
	public static void main(String[] args) {
		int[] moneyList = {121902, 8302, 55100};
		 for(int value: moneyList){
		     System.out.println(value);
		 }
	}
}
///円の面積、三角形の面積算出
public class Main {
	public static void main(String[] args) {
            double triangleArea = calcTriangleArea(10.0,5.0);
		    System.out.println("三角形の面積"+triangleArea+"平方cm");    
		    double circleArea = calcCircleArea(5.0);
		    System.out.println("円の面積"+circleArea+"平方cm");
	}
	public static double calcTriangleArea(double bottom ,double height) {
		    double area = (bottom*height)/2;
		    return area;
	}
	public static double calcCircleArea(double radius) {
		    double area = (radius)/2;
		    return area;
	}
}