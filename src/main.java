public class main {
public static void main(String[] args) {
    son s=new son();
    daughter d=new daughter();
    
    parent.hello();//hello is static method so wrking if it declared public gives error because parent is abstract class
    s.career();
    d.career();
}
}
//object cannot be created for parent because it is abstract.to create object use daugher like in polymorphism.
//static method in abstract class cannot be overridden.