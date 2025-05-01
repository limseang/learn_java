public class Hello {
    public static void main(String[] args) {
        System.out.println("hello world");
        greet();
        farewell();
        konpapa();
    }

    public static void greet() {
        System.out.println("Greetings from the greet method!");
    }
    public static void farewell() {
        System.out.println("Goodbye from the farewell method!");
    }

    public static void konpapa(){
        System.out.print(2.33);
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("c = " + c + "" + a + b );
    }


}
