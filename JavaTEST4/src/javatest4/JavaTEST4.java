/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest4;
//import java.math.BigDecimal;
//import java.math.RoundingMode;
//import java.text.DecimalFormat;
//swingの機能を使用したいのでインポートする
//ActinListenerの機能を使用したいのでインポートする

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author SENOO
 */
public class JavaTEST4 {

    /**
     * @param args the command line arguments
     */
    //変数の宣言
    //変数名myframeタイトルGUItestというJFrameクラスオブジェクト作成
    static JFrame myframe = new JFrame("GUItest");
    //変数名mybuttonというJbuttonクラスオブジェクト作成
    static JButton mybutton = new JButton("ＯＫ");
    //変数名mytextgareaというJTextAreaクラスオブジェクト作成
    static JTextField mytextfield = new JTextField(); 
    //変数名mytextgareaというJTextAreaクラスオブジェクト作成
    static JTextArea mytextarea = new JTextArea(); 

    public static void main(String[] args) {
        // TODO code application logic here


        // フレーム作成
        //フレームのPC画面表示位置と大きさを決める(PC画面左上座標(X座標,Y座標),画素数)
        myframe.setBounds(100, 100, 640, 480);
        //フレームの非表示解除
        myframe.setVisible(true);
        //コンポーネントの位置を直接指定しているので自動調整の機能をオフにする
        myframe.setLayout(null);
        //作成したフレームの×ボタンをクリックした場合にプログラムを終了させる設定
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //ボタンの作成
        //作成したボタンをmyframeに追加する
        myframe.add(mybutton);
        //フレーム上のボタンの位置、大きさを決める
        mybutton.setBounds(520, 10, 100, 50);

        //入力用のテキストフィールドを作成する
        //テキストフィールドは1行のテキストの入出力を行う
        //作成したフィールドをmyframeに追加する
        myframe.add(mytextfield);
        //フレーム上のフィールドの位置、大きさを決める
        mytextfield.setBounds( 10, 10,500, 50);

        //テキストエリア(複数行のテキスト入出力を行う為のコンポーネント)の作成
        //作成したボタンをmyframeに追加する
        myframe.add(mytextarea);
        //ボタンの位置、大きさを決める
        mytextarea.setBounds( 10, 70,600,360);

        //mybuttonに対する処理
        mybutton.addActionListener(
        //新しいActionListenerの作成。イベント処理を行うActionListenerの設定　
            new ActionListener(){
        //ボタンをクリックした場合の処理                
                public void actionPerformed(ActionEvent e){
        //入力された文字列を表示させる
                    mytextarea.setText(mytextarea.getText()+"\n"
 //                   + mytextarea.getText()+"\n"
                    + "「"+mytextfield. getText()+"」って言いましたね？");

                                                            }
                                }       
                                  );



                }
                        }
