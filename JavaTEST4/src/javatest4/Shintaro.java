/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package javatest4;

import static javatest4.JavaTEST4.mytextarea;
import static javatest4.JavaTEST4.mytextfield;

/**
 *
 * @author SENOO
 */
/*
class Shintaro {
    //Shintaroclass
    //switch文の場合
        public String hanasu(String str1){
                   String buf = mytextfield.getText();
            switch(buf){
                case "": 
                    mytextarea.setText(
                    "Shinny：「Please continue.」");
                    break;
                case "What do you doing ?": 
                    mytextarea.setText(mytextarea.getText()+"\n"
                    + "You     ：「"+mytextfield.getText()+"」\n"
                    + "Shinny：「I'm working for Gabacorp as trainer.And you ?」");
                    break;
                case "Where are you from ?": 
                    mytextarea.setText(mytextarea.getText()+"\n"
                    + "You     ：「"+mytextfield.getText()+"」\n"
                    + "Shinny：「I'm from Australia. And you ?」");
                    break;
                case "What kind of sports do you like ?": 
                    mytextarea.setText(mytextarea.getText()+"\n"
                    + "You     ：「"+mytextfield.getText()+"」\n"
                    + "Shinny：「It's interesting. "
                    + "my favorite sports is "
                    + "Tennis, Rugby, Soccer, Lifesaving. "
                    + "And you ?」");
                    break;
                case "What kind of music do you like ?": 
                    mytextarea.setText(mytextarea.getText()+"\n"
                    + "You     ：「"+mytextfield.getText()+"」\n"
                    + "Shinny：「I love R&B music. And you ?」");
                    break;
                default :                   
                    mytextarea.setText(mytextarea.getText()+"\n"
                    + "You     ：「"+mytextfield.getText()+"」\n"
                    + "Shinny：「Could you say that again ?」");
                        
                        
                        
                        
                        
                        
                    }
                    
                    
                    
                    
                    
                    
                    
                    

    
}
*/
/*
    String hanasu(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
package javatest4;

import static javatest4.JavaTEST4.mytextfield;

class Shintaro {
    //Shintaroclass
    //switch文の場合
        public String hanasu(String str1){
            
        int key1 = 0,key2 = 0,key3 = 0,key4 = 0;           
        String buf = mytextfield.getText();
        
            switch(buf){
                //nullでも再検証すること
                 case "": 
                    return("Please continue.I'd like to more talk with you.");
//                    break;
                //あいさつ
                case "How are you?": 
                case "How are you doing?": 
                case "Hi!": 
                    return("Hi!, How are you?");
                    
                case "How have you been?": 
                    return("Good, thanks.");


                //あいさつ（時候）                    
                case "Good morning.": 
                    return("Good morning.How have you been?");
    
                //名前  
                case "What is your name?": 
                case "What's your name?": 
                case "Who are you?": 
                    return("I'm Shintaro.Please call me Shinny.");

                //職業
                case "What do you doing?": 
                    return("I'm working for Gabacorp as trainer.And you?");
//                    break;
                //年齢
                case "How old are you?": 
                    return("I'm eternal youth and immortality.");

                //出身地
                case "Where are you from?": 
                    return("I'm from Australia. And you?");
//                    break;

                //育った地域
                case "Where were you born?": 
                    return("I was born in... It's secret.And you?");
                    
                //好きなスポーツ
                case "What kind of sports do you like?": 
                    return(
                    "my favorite sports is "
                    + "Tennis, Rugby, football, Lifesaving,swim at the beach.\n"
                    + "I love to watch sport as well.It's interesting. And you?」");
//                    break;
                //好きな音楽
                case "What kind of music do you like?": 
                    return("I love R&B music. And you?");
//                    break;
                //好きな映画
                case "What kind of movie do you like?": 
                    return("I don't watch movie. And you?");

                //好きな食べ物
                case "What kind of food do you like?": 
                    return("I prefer California Roll. And you?");

                //好きな食べ物
/*                case "What kind of food do you like ?": 
                    return("I like California Roll. And you ?");
*/

                //ねぎらい
                case "I'm tired.": 
                    return("Are you OK? What's happened?");

                //あなたはいつも何をしていますか？
                case "What do you usually do weekend?": 
                    return("well...I usually ...");
                    
                //仕事はどうですか？
                case "How is work?":    
                case "How's work?":    
                    return("I'm very busy these day.but I enjoy it.");
                    
                //あいさつ（別れ）
                case "Good night.": 
                    return("Have a good night."
                          +"See you tomorrow!");

                //イベント
                //正月
                case "How are you going to spend the Christmas day and "
                    + "the New Year ?":
                    return("I'll come back to Australia and stay with my family"
                            + " and friends. ");
                    
                //2016/6/16Shintaro@Lesson
                case  "What do your coworkers think about the crashes?":
                    return("My job is today these problem. ");
                    
                case  "What are your coworkers goping about the systems?":
                    return("My job is to make a better system for companies. ");
                
                case  "Do you like a ice? I don't like a ice.":
                    return("...");
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                default :                   
                    return("Could you say that again?");
                        
                        
                        
                        
                        
                        
                    }
    public String speak(String str1){
        int k1 = 0,k2 = 0,k3 = 0,k4 = 0,k5 = 0;
        
        //1.2「How do you do ?」(挨拶）が含まれるか判断
        k1=str1.indexOf("How do you do");
        k2=str1.indexOf("Nice to meet you.");
        k3=str1.indexOf("Good to meet you.");
        k4=str1.indexOf("Pleased to meet you.");
 
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
    
        
        
        
        
        
        
        
        
        }
    }
}