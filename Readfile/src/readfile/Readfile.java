/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readfile;
//ファイル入出力機能を利用できるようにインポートする
import java.io.*;
        
/**
 *
 * @author SENOO
 */
public class Readfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ファイル読み込み
        String ss[]=new String[1000];

        int n, k = 0;
          try{
            //デスクトップのパスを格納
            String mydesktop =
                System.getProperty("user.home") + "/Documents/放送大学/JAVAプログラミング/";
            //タブ形式のテキストファイルをmyfileへ新しく格納
            File myfile=new File(mydesktop+"mygaba_phrase.txt");
 
            //
            FileInputStream fis = new FileInputStream(myfile);
            //
            InputStreamReader isr = new InputStreamReader(fis, "Shift_JIS");
            //
            BufferedReader br = new BufferedReader(isr);

            System.out.println(mydesktop);
            System.out.println(myfile);
            System.out.println(isr);
            System.out.println(br);


            //
            for (k=0;k<1000;k++){
               
                //ファイルの中身が無い時はif文を抜ける
                if ((ss[k]=br.readLine()) == null) break;
                               }           
                //
                br.close();
            } catch (Exception ex){
              System.out.println("エラーが起きました。");
                                  }           
            System.out.println("データ数="+k);
            //
            for (n=0;n<k;n++)
                System.out.println(n+"行目："+ss[n]);

            
        //ファイルの書き出し
        try{
            String mydesktop =
                System.getProperty("user.home") + "/Documents/放送大学/JAVAプログラミング/";

            File myfile = new File(mydesktop+"keshiteyoi.txt");
        
        FileOutputStream fos = new FileOutputStream(myfile);
        OutputStreamWriter osw
                = new OutputStreamWriter(fos, "Shift_JIS");
        BufferedWriter bw = new BufferedWriter(osw);
        
        bw.write("ファイルに書き出してみました。");
        
        bw.write("\n");
        
        bw.write("うまく書けていますか？");
        
        bw.write("\n");
        
        bw.close();
        } catch (Exception ex){        
            System.out.println("エラーが起きました。");
        }        
           




    }        

    }
    

