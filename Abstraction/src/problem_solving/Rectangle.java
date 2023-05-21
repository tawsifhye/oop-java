
package problem_solving;

public class Rectangle extends Shape {
    
    Rectangle(double l, double w){
        super(l,w);
    }
    
    @Override
    void area(){
         result = dim1 * dim2;
        System.out.println("Rectangle: "+result);
    }
            
    
}
