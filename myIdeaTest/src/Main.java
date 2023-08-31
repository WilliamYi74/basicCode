import com.yunwuyun.constructor.Constructor;

public class Main {
    public static void main(String[] args) {
        testConstructor();
    }

    private static void testConstructor() {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor("william");
        Constructor c3 = new Constructor("william", 17);
        System.out.println("c1->name:" + c1.getName());
        System.out.println("c2->name:" + c2.getName());
        System.out.println("c3->toString:" + c3);
    }
}