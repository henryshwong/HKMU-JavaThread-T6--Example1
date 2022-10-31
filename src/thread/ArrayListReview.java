package thread;

import java.util.ArrayList;

/*
  Review ArrayList, Array的用法.
 */
public class ArrayListReview {

    public static void main(String[] args) {

        // 在<>內的是ArrayList內item保存的數據type. 例如Interger, String ...
        // <String> 是代表一個String array 例如: {"Name1","Name2"}
        ArrayList<Integer> arrayListInt = new ArrayList<>();
        ArrayList<String> arrayListString = new ArrayList<>();

        // ArrayList 是用 get, add, remove 來取數, 新增和刪除 item.

        for(int x=0; x<10; x++){
            arrayListInt.add(x);
            arrayListString.add("Hello");
        }

        // 用 size() 取 arrayList內有多少個 items.
        for(int x = 0; x< arrayListInt.size(); x++ ) {
            System.out.println(arrayListInt.get(x));
            System.out.println(arrayListString.get(x));
        }


        // 利用一般array實現. 由於一般array沒有add, remove, get等功能. 需要在建立時就說明array的size.

        int[] arrayInt = new int[10];
        String[] arrayString = new String[10];
        int[] emptyArrayInt = {};  // 建立一個空白的array.
        int [] array1 = {1,2,3};    // 建立一個有3個item的array 和放入array的value.  array1[0]=1

        for(int x = 0; x<10; x++){
            arrayInt[x] = x;
            arrayString[x] = Integer.toString(x);    //將int 改成 String
        }
    }



}
