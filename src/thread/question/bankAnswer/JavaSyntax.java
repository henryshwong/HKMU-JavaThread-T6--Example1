package thread.question.bankAnswer;

class Student {
    private String name;
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
}

public class JavaSyntax {
    //variables
    // types:  int - Integer, double - decimal. String ="abcd"
    private static int amount;
    private static String name ;

    private static Student student;


    public static void main(String[] args) {

        amount = 10;
        String namehenry = "henry";
        student = new Student();
        student.setName("wallace");
        student.setName(namehenry);
        System.out.println(student.getName());

        // operators
        int i = 1;
        double d = 2.0;
        String s = "3a";
        boolean b = false;

        System.out.println( ( i+s ));
        System.out.println( "i+i " + (i+i) );
        System.out.println( "i+d " + (i+d) );
        System.out.println( "d+d " + (d+d) );
        System.out.println( "d%d " + (d%d) );
        System.out.println( "d+=d " + (d+=d) );
        System.out.println( "d-=d " + (d-=d) );
        System.out.println( "i+d " + (i+d) );

        String[] s1 = {"a","b","c"};
        System.out.println("s1[0] " + s1[0]);
        System.out.println("s1[0] " + s1[2]);

        for(int x=0; x<=s1.length-1; x++){
            System.out.println("S["+x+"]"+ s1[x]);
        }

        String name = "Wallace Henry Mandy";

        System.out.println("name start " + name.startsWith("W"));

    }


}
