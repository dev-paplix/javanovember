public class Static {

    static int staticCounter = 0;
    
    public static void incremetCounter(){
        staticCounter++;
    }

    public static void main(String[] args) {
        System.out.println("Static Counter: " + staticCounter);
    }
}
