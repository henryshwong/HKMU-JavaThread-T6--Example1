package basic;

import java.util.ArrayList;

public class ArrayPlay {
    private static void p(ArrayList<String> n){
        for(int x=0; x<=n.size()-1; x++){
            System.out.println(n.get(x));
        }
    }

    private static void pC(ArrayList<String> nc){
        for (int x=0 ;x<=nc.size()-1 ; x++){
            nc.set(x,nc.get(x).toUpperCase());
        }
        p(nc);
    }

    private static void paa(ArrayList<String> nc){
        ArrayList<String> newn = new ArrayList<>();
        for (int x=0 ;x<=nc.size()-1 ; x++){
            if(nc.get(x).contains("a")){
                newn.add(nc.get(x));
            }
        }
        pC(newn);
    }

    public static void main(String[] args){
        ArrayList <String> names = new ArrayList<>();
        names.add("wallace");
        names.add("Henry");
        names.add("Mandy");

       // names.remove(2);
       // names.set(1 ,"HENRY");
        pC(names);
        p(names);
        paa(names);

    }

}
