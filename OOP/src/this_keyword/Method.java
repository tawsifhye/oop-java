
package this_keyword;


public class Method {
    
    void show(Method m){
        System.out.println("I am show method ");
        
    }
    
    void result(){
        System.out.println("result() invokes show() ");
        show(this);
     
    }
    
}
