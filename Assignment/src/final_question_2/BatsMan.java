
package final_question_2;

public class BatsMan extends Cricketer {
   int totalRun, strikeRate, noOfSixes, noOfFours;
   
   BatsMan(){
       totalRun = strikeRate = noOfSixes = noOfFours =0;
   }
   
   BatsMan(String name, int age, int matchplayed, int totalRun, int strikeRate,int noOfFours, int noOfSixes){
       super(name, age,matchplayed );
       
       this.totalRun = totalRun;
       this.strikeRate = strikeRate;
       this.noOfFours = noOfFours;
       this.noOfSixes = noOfSixes;
   }
   
   @Override
   public void printPlayerInfo(){
       super.printPlayerInfo();
       
       System.out.println("Total Run: "+totalRun);
       System.out.println("Strike Rate: "+strikeRate);
       System.out.println("No of Fours: "+noOfFours);
       System.out.println("No of Sixes: "+noOfSixes);
   }
   
  
    
}
