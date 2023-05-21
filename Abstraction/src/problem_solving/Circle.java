
package problem_solving;


public class Circle extends Shape {
    
    Circle(double r){
        super(r,r);
    }
    
    @Override
    void area(){
        result = 3.1416* dim1 * dim2;
        System.out.println("Circle: "+result);
        
    }
}
