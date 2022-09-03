//GUITEST//
package practice8.pkg2;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author SENOO
 */
public class GUITEST {
    static JFrame myframe= new JFrame("GUItest");    
    static JTextField mytextfield= new JTextField("GUItest");    
    static JButton mybutton= new JButton("OK");    
    static JTextArea mytextarea= new JTextArea();
    static Eliza myEliza= new Eliza();

    public static void main(String[] args){//GUITEXT Start
    myframe.setBounds(100,100,640,480);
    myframe.setVisible(true);
    myframe.setLayout(null);
    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    myframe.add(mytextarea);
    mybutton.addActionListener(
        new ActionListener(){
        public void actionPerfomed(ActionEvent e){
        //ボタンをクリックした場合の処理    
    mytextarea.setText(mytextarea.getText()+"\n"
        + mytextfield.getText()+"\n"
        + "Eliza：「"
        +myEliza.speak(mytextfield.getText())+"」");
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        }
    );
    }
}//GUITEXT End

//*****Elizaクラス*****//
class Eliza {
    public String speak(String str1){
        int k1 = 0,k2 = 0,k3 = 0,k4 = 0,k5 = 0;
        
        //1.2「How do you do ?」(挨拶）が含まれるか判断
        k1=str1.indexOf("How do you do");
        k2=str1.indexOf("Nice to meet");
        k3=str1.indexOf("Good to meet you");
        k4=str1.indexOf("Pleased to meet you");
 
        if(k1>=0) return("I'm fine. And you ?");
        if(k2>=0) return("Nice to meet you too.");
        if(k3>=0) return("Pleased to meet you too.");

        //1.2「Hello」(挨拶）が含まれるか判断
        k1=str1.indexOf("Hello");
        k2=str1.indexOf("Good morning");
        k3=str1.indexOf("Good Evening");
        k4=str1.indexOf("Hi");
        k5=str1.indexOf("");
 
        if(k1>=0||k2>=0||k3>=0||k4>=0||k5>=0) return("Hi, How are you?");
        
        //2.私は○○が好きに対応 (時間ごとに返答を決定する）     //
        k1=str1.indexOf("I");
        k2=str1.indexOf("like");
        if(k1>=0 && k2>=0){
            String str2=str1.substring(k2+1,k2+50);
            return("You like 「" +str2+ "」,don't you ?");
        }            
            
            
        //どんな食べ物が好き？            
        k1=str1.indexOf("food");
        k2=str1.indexOf("like");
        if(k1>=0 && k2>=0){
            String str2=str1.substring(k1+2,k2);
            
            
            java.util.Date d = new java.util.Date();
            long t=d.getTime();
            if(t%3==0)
                return("Eliza like Orange.");
            else if(t%3==1)
                return("What kind of food do you like ?");
            else
                return("I'm full now.");
        }    

        return"Could you say that again ?";
    }
    }










