
package this_keyword;

 class A{  
A getA(){  
return this;  
}  
void msg(){System.out.println("Hello java");}  
}  
class TestA{  
public static void main(String args[]){  
new A().getA().msg();  

}  
}
    

