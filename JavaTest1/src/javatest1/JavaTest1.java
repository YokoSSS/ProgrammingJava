/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javatest1;

import java.util.Scanner;

/**
 *
 * @author SENOO
 */
//import java.util.Scanner;

public class JavaTest1 {


    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here

/****************************************************
 * 初めて書いたJavaプログラム　　　　SENOO
 ***************************************************/

/****************************************************
 * 放送大学ありがとう　　　　　　　　SENOO
 ***************************************************/        
        
/*System.out.println("こんにちは世界！");*/        
System.out.println("こんにちは世界！");
System.out.println( 
"放送大学ありがとう"
);        


/************************
 char A;
 char B;
 A="おひめまろ大好き";
System.out.println(A);
 ***********************/
//int i =100;
//System.out.println(i);
//System.out.println(i+i);

//int n =-100;
//System.out.println("nの値="+n);
//double x;
//x=-12345.678;
//System.out.println("xの値="+x);

//i =200;
//System.out.println("xの値="+i);

//double zz;
//zz=-12345.678;
//System.out.println("xの値="+zz);
/**********************************
int a;
int b;
int c;
a =10;
b =3;
**********************************/
//int a,b,c;
//a = 10;b = 3;
//c=a+b;
//System.out.println(a+"と"+b+"の和は"+c+"です");
//c=a-b;
//System.out.println(a+"と"+b+"の差は"+c+"です");
//c=a*b;
//System.out.println(a+"と"+b+"の積は"+c+"です");
//c=a/b;
//System.out.println(a+"と"+b+"の商は"+c+"です");
//c=a%b;
//System.out.println(a+"と"+b+"の剰余は"+c+"です");

/*-平均点を求める
double ten1,ten2,ten3;
double heikin;
ten1=70;
ten2=80;
ten3=90;
heikin=(ten1+ten2+ten3)/3;
System.out.println("平均="+heikin+"です");
*/
//平均点を求める2
//double ten[]=new double[3];
//double heikin;
//ten[0]=70;
//ten[1]=80;
//ten[2]=90;
//heikin=(ten[0]+ten[1]+ten[2])/3;
//System.out.println("平均="+heikin+"です");

/*データを読み込む
java.util.Scannerscan=
        new java.util.Scanner(System.in);
scan.nextline();
System.out.println("「"+scan.nextline()+"」です");
*/
//文字列を1行読み込むプログラム
//java.util.Scanner scan =
//new java.util.Scanner(System.in);
//System.out.println("好きな言葉を入力して下さい");
//System.out.println("「"+scan.nextLine()+"と入力しましたね");*/
/*int i, j;
java.util.Scanner scan
        scan = new java.util.Scanner(System.in);
System.out.println("整数を入力して下さい");
i=scan.nextInt();
System.out.println("整数を入力して下さい");
j= scan.nextInt();
System.out.println(i+"と"+j+"が入力されました");

/*
int i, j;
java.util.Scanner scan =
    new java.Scanner(System.in);
System.in.println("整数を入力してください．");
i= nextInt();
System.out.println("整数を入力してください．");
j= scan.nextInt();
System.out.println(i+"と"+j+"が入力されました");
*/
/*
double ten[]=new double[3];

double heikin;

Scanner scan =

  new Scanner(System.in);

System.out.println("点数を入力してください．");

ten[0]= scan.nextDouble();

System.out.println("点数を入力してください．");

ten[1]= scan.nextDouble();

System.out.println("点数を入力してください．");

ten[2]= scan.nextDouble();

heikin=(ten[0]+ten[1]+ten[2])/3;

System.out.println("平均= "+heikin);

//int型の変数にデータを読み込むプログラム
double k;
double l;
//Scanner scan =
//  new Scanner(System.in);
System.out.println("整数を入力してください. ");
k=scan.nextDouble();
System.out.println("整数を入力してください. ");
l=scan.nextDouble();
System.out.println(+k+"と"+l+"が入力されました");
*/

//「こんにちは」プログラム1
//int n ;
//for(n=1;n<=3;n++){
//System.out.println("Hello!World");

//「こんにちは」プログラム2    
//int n;
//for(n=1;n<=3;n++)
//    System.out.println(n+"回目のこんにちは");
//累乗プログラム
//int i=3,j=5;
//int n,kekka=1;
//for(n=1;n<=j;n++){
//    kekka=kekka*i;
//system.out.println(i+"の"+n+"乗は、"+kekka"です.");    
//}    
//階乗プログラム
//int j=5;
//int n, kekka=1;
//for(n=1;n<=j;n++)
//    kekka*=n;
//System.out.println(j+"の階乗は"+kekka+"です.");
/*平均点を求める2
double ten[]=new double[3];
double heikin=0;
int n;
ten[0]=70;    
ten[1]=80;
ten[2]=90;    
heikin=(ten[0]+ten[1]+ten[2])/3;
System.out.println("平均="+heikin);
 */   
/*平均点を求める3
double ten[]=new double[3];
double heikin =0;
int n;
ten[0]=70;
ten[1]=80;
ten[2]=90;
for(n=0;n<3;n++)
    heikin+=ten[n];
heikin/=3;
System.out.println("平均="+heikin);
*/
/*フィボナッチ数列
int f[]=new int[10]
int n;
f[0]=1;
f[1]=1;
for(n=2;n<10;n++) 
    f[n]=f[n-1]+f[n-2]
System.out.println("フィボナッチ数列は以下の通り.");
for(n=0;n<10;n++)
System.out.println(f[n]);*/
///データ数の入力

/*java.util.Scanner scan =

  new java.util.Scanner(System.in);

System.out.println("データ数を入力してください．");

int k= scan.nextInt();

System.out.println("データ数="+k);

//点数の入力
double ten[];
ten=new double[k];
int n;
for(n=0;n<k;n++){
System.out.println("点数を入力してください.");
ten[n]=scan.nextDouble();
}
*/
//値の比較

int i;

Scanner scan =  new Scanner(System.in);

System.out.println("整数を入力してください．");

i= scan.nextInt();

if(i<=100)

  System.out.println("入力された値は100以下です．");



String[] ss = {

"阿部    80  70",

"井上    90  60",

"上山    70  80"

};
int n;

for(n=0;n<3;n++)

  System.out.println(ss[n]);

String sss[]=ss[0].split("\t");

  System.out.println(sss[0]);
  System.out.println(sss[1]);
  System.out.println(sss[2]);
    }

}    


