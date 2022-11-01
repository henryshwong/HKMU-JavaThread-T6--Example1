package basic;

//基本java語法

public class BasicJava {

    public static void main(String[] args) {
        // types;
        // 基本types:
        //  int - Integer(1,2,3)  double: 1.0,2.0,  String: "abc"  boolean: true/false
        //  char - Character (字符) 放一個單字.
        int i = 1;
        // double =1.0;
        String s = "abc";
        char c = 'a';      // 字符需要 單 ' ' 來表只  "" 是 String

        // array. 用[]來代表 array.
        // int i[] =Integer array, String[] = String array
       // int [] intArray = int[5];  // 開一個5位置的 array
        String[] sArray = new String[5];  // 開一個5位的 String array

        int[] intArray2 = {1,2,3,4,5};  // 開一個5位的array和給Array的內容
        String[] sArray2 = {"wallace","henry","mandy"} ;

        // Operators (運算符號)
        //   + - * / %  += -+ ++ --

        // Compare operators( 比較符號 )
        //  ==  != >= <= > <

        // Statements Expression: 表達局
        int i2 = 1 + 2;
        boolean b1 = (3>2);  // false
       // boolean b2 = (1==2):  // true

        // String operations (String 的操作)
        String w = "Wallace";
        w.equals("Wallace");   // equals = 等於
        w.startsWith("W");
        w.toLowerCase();     // 將w變爲 lower case
        w.contains("a");     // w內有沒有"a"
        w.length() ;          // w的長度

        // w[0] = "a"  ;      // 將a放入w string的第一個位置  String其實是個array

        // if
        //
       // if( 1==1){ boolean b2 = true; } else if (2==1) { b2 = false;} ;
       // if(3>2) { b2 = true) else {b2=false};

        // for loop
        for(int x = 1; x<=10; x++) { // pring x};

        // while loop
            int x1 = 1;
        while(true) {
            x1++;
            if (x1>10){
                break;   // exit while loop
            }
        }

        // switch and case
        int x2 = 10;
        int y = 0;
        switch(x2){
            case 1:
                y=1 ;
                break ;
            case 2:
                y=2;
                break;
            case 10:
                y=10;
                break;
            default:
                y=100;
        }


        }


    }


}
