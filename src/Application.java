import Singleton.Singleton;

public class Application {
    public static void main(String[] args) {

        Singleton abc = Singleton.getInstance();
        abc.setX(2);
        System.out.println(abc.getX());

        Singleton bca = Singleton.getInstance();
        bca.setX(3);
        System.out.println(bca.getX());
        System.out.println(abc.getX());

        System.out.println(abc == bca);
        
        System.out.println("Hash code of object abc:" + abc.hashCode());
        System.out.println("Hash code of object bca:" + bca.hashCode());

    }
}

