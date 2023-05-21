
package problem_solving;

public class Triangle extends Shape {
    
    Triangle(double l, double b){
        super(l,b);
    }
    
    @Override
    void area(){
        result = 0.5* dim1* dim2;
        System.out.println("Triangle: "+result);
    }
}
