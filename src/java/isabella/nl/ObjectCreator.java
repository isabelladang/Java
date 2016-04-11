package isabella.nl;

/**
 * Created by dannytran on 4/4/16.
 */
public class ObjectCreator {

    public static void main(String[] args){
        GoldenRetriver dog = new GoldenRetriver("Cat", 5);
        System.out.println(dog.dang());
        dog.setAge(34);
        System.out.println(dog.dang());


        Dog dog2 = new GoldenRetriver("Kitty", 7);
        dog2.getName();

        Dog dog3 = new SaintBernard();
        System.out.println(dog3.getName());

    }

}
public static void main(String[] args){
    
}