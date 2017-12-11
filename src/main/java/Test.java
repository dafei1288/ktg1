import com.dafei1288.kt.Person;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("jack",11,"");
        p.setName("tom");

        System.out.println("args = [" + p + "]");
    }
}
