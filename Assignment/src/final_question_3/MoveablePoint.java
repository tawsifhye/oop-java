
package final_question_3;


public class MoveablePoint extends Point implements HorizontalMove,VerticalMove {
   
    
    MoveablePoint(int a, int b){
        super(a,b);
    }
    
   
    public void moveRight(){
        System.out.println("move single unit right");
    }
    
    
    public void moveLeft(){
        System.out.println("move single unit right");
     }
    
    public void moveUP(int n){
        System.out.println("move "+n+" unit up");   
    }
    public void moveDown(int n){
        System.out.println("move "+n+" unit down");   
    }
    
}
