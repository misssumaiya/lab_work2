package problem_E2_7;

public class ReplaceTester {
    public static void main(String[]args){
        String name="Mississippi";
        String Replace=name.replace("i","!").replace("s","$");
        System.out.println("expected string :" +Replace);
        System.out.println("actual string :" +name);
    }
}
