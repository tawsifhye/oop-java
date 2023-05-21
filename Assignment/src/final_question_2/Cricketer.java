
package final_question_2;

public class Cricketer {
    private String name;
    private int age;
    private int matchPlayed;
    Cricketer(){
    
    }
    
    
    Cricketer(String name, int age, int matchPlayed){
        this.name = name;
        this.age = age;
        this.matchPlayed = matchPlayed;
    }
    
    public void printPlayerInfo(){
        System.out.println("Player Info:");
        System.out.println("\tName - "+name);
        System.out.println("\tAge - "+age);
        System.out.println("\tMatch Played - "+matchPlayed);
    }
}
