
package oop;


public class OverloadingConstructorTest {
    public static void main(String[] args) {
        OverloadingConstructor s1 = new OverloadingConstructor();
        
        OverloadingConstructor s2 = new OverloadingConstructor("Tawsif",247);
        s2.display();
        
        OverloadingConstructor s3 = new OverloadingConstructor("Tawsif Chowdhury", 94, 3.69);
        s3.display();
        
        
        
        
    }
}
