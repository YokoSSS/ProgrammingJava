package mojiretsu;

/**
 * @author SENOO
 */
public class Mojiretsu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1 = "Yoko";
        String str2 = "Senoo";

        //str1と同じ内容の文字列を新規で作成する
        String str3 = new String(str1);

        //2つの文字列を結合する
        String str4 = str1+str2;

        //文字列が同じであるかの判断
        System.out.println("str1="+str1+",str3="+str3);
        
        if(str1.equals(str3))
            System.out.println("文字列は同じです。");
        else            
            System.out.println("文字列は同じです。");


        //文字列の切り出し
        String str5 = "Yoko Senoo";
        //Senooを切り出す
        String str6 = str5.substring(5,10);
        //切り出した文字を表示する
        System.out.println(str6);
        
        //
        String str7 = str5.substring(5,str5.length());
        //切り出した文字を表示する
        System.out.println(str7);
        String str8 = str5.substring(5);
        System.out.println(str7);
        
        //文字列を置換する
        String str9 = str5.replaceAll("o","u");
        //切り出した文字を表示する
        System.out.println(str9);

        //文字列処理2
        String[] ss = {
        "阿部	80	70",        //ss[0]
        "井上	90	60",        //ss[1]
        "上山	70	80"         //ss[2]
                      };
        //配列の要素は0から始まる

        //整数型変数n
        int n;
        String sss[];
        double Mathematics[]=new double[200];
        double English[]=new double[200];
        String Name[]=new String[200];
        //nの初期値0、nが3より小さい時、n+1される                
        for(n=0;n<3;n++){
        //それぞれの行の文字列データを、氏名、数学の点数、英語の点数のそれぞれに分割する
        //そのためにsplit()メソッドを利用します。
        //ss[n]をタブ("\t")で分割する。
        //配列ss[n]に格納した値をsssに格納する
            sss=ss[n].split("\t");
        //配列Name[n]に格納した値をsssに格納する
            Name[n]=sss[0];
        //配列Name[n]に格納した値をsssに格納する
            Mathematics[n]=Double.parseDouble(sss[1]);
        //配列Name[n]に格納した値をsssに格納する
            English[n]=Double.parseDouble(sss[2]);
                        }        
        //nの初期値0、nが3より小さい時、n+1される                
        for(n=0;n<3;n++){
            System.out.println(Name[n]+"さんの数学の点数は"
            +Mathematics[n]+"点、英語の点数は"+English[n]+"点です。");
                        }  
 

        //指定した文字列が含まれるかの判断
        //indexOfメソッドを使用（文字列に含まれる部分文字列を返す）
        //指定された部分文字列が最初に登場した位置を文字列の先頭を0としたインデックス
        //番号で返す。文字列が見つからなかった場合戻り値は-1となる。
        //部分文字列を文字列の末尾から検索するならばlastIndexOfメソッドを利用する。
        int k;
        String str10 = "私はリンゴが好きです。";
        k = str10.indexOf("リンゴ");
        System.out.println("k="+k);
        
        //6-2-2課題
        int l;
        String str11 = "こんにちは、初めまして。私はプログラマーです。" ;
        l = str11.indexOf("こんにちは");
        if (l>=0)  {
        System.out.println("指定した文字列が含まれます。");        
                   }        
        else{
        System.out.println("指定した文字列が含まれません。");        
            }        
        
        
        //「私は」と「が好き」を探す
        String str12 = "I love chocolate very much.";
        int k1,k2;
        k1=0;
        k2=0;
        k1 = str12.indexOf("love");
        k2 = str12.indexOf("very");
        System.out.println("k1="+k1+ ",k2="+k2);
        //○番目から○番目の文字列を切り出すにはsubstring()メソッドを使用する
        String str13 = str12.substring(k1+4,k2);
        System.out.println("あなたが好きなのは「"+str13+"」ですね？");
      
        //好きな食べ物を答える
        //「どんな食べ物が好き？」や「好きな食べ物は何？」といった質問に答えられる
        //ように，文字列str1に「食べ物」と「好き」が含まれた場合，
        //「Elizaは夏みかんが好き．」と答えるプログラムを作成してみましょう．
        //String str14 = "Which do you prefer single room or shared room?";
        String str14 = "What kind of food do you like?";   
        String str15 = "Eliza likes Tempura.";    
        String str16 = "Which do you prefer apple or orange?";
        String str17 = "Eliza prefer orange than apple.";    
        String str18 = "Hi! How are you?";    
        String str19 = "Hi! How have you been?";    
        String str20 = "Good,thanks.And you?";    
        String str21 = "Long time no see!";    
        String str22 = "Yes.How have you been?";    
        String str23 = "Could you say that again?";    
        String str24 = "Could you repeat that?";    

        int k3=0,k4=0,k5=0,k6=0,k7=0; 
        k3 = str14.indexOf("food");
        k4 = str14.indexOf("like");
        k5 = str16.indexOf("Which");
        k6 = str16.indexOf("prefer");
        //    System.out.println(+k3);
        //    System.out.println(+k4);
        //    System.out.println(+k5);
        //    System.out.println(+k6);

        if (+k3>=0 && +k4>=0){
            System.out.println(str15);
                         }
        else{
            System.out.println(str23);
            }        
        if(+k5>=0 && +k6>=0){
            System.out.println(str17);
                               }
        else{
            System.out.println(str23);
            }        
        
        
    
    
    
    }
    
}
