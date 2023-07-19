package problem_E2_8;

public class SwitchLetter {
    public static void main(String[]args){
        String name="Hello, world!";
        name=name.replace("e","@");
        name=name.replace("o","e");
       String encode=name.replace("@","o");
        System.out.println(encode);

    }
}
