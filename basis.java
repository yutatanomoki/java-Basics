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
        // 自分の得意な言語で
        // Let's チャレンジ！！
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