
package final_question_6;

public class Holiday extends Notice{
    
    String startdate, duration, occasion;
    
    Holiday(String s, String d, String o){
        startdate = s;
        duration = d;
        occasion = o;
        
    }    
            
    @Override
    public String toString(){
        System.out.println("University will be closed from "+startdate+" for "+duration+" for "+occasion);
        return null;
    }
    
}
