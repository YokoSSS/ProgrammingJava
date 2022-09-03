/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest4;

//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.InputStreamReader;
import java.io.*;
import static javatest4.JavaTEST4.myframe;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Yoko
 */
public class INOUTPUT {
    public static void main(String[] args){//GUITEXT Start
                    int n,k=0;
                    String ss[]=new String[200];
                    try{    //error回避    
                    String mydesktop =
                    System.getProperty("user.home") + "/Desktop/";
                    System.out.println(mydesktop);
                    File myfile = new File(mydesktop+"tab.txt");

                    FileInputStream Fis = new FileInputStream(myfile); //FileInputStream
                    InputStreamReader Isr =  //InputStreamReader
                      new InputStreamReader(Fis,"Shift_JIS");     //タブ形式
                    BufferedReader Br = new BufferedReader(Isr);
                
                    
                    //空白だったらIF文を抜ける（textの読み込みをやめる）
                    for (k=0;k<200;k++){
                        if((ss[k] = Br.readLine()) == null) break;
                    }
                    Br.close();
                } catch (Exception ex){
            //ポップアップで警告が出るようにする
                    System.out.println("エラーが起きました。");
                    JFrame error1Frame = new JFrame();
                    JOptionPane.showMessageDialog(myframe, "エラーが起きました。");
                }
            }
            }
