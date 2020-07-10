import java.util.ArrayList;

public class Team<T extends Player> { // Capitol T and extends restricts what data type can be used, in this case it will be of type player (Can be interface)
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>(); //The capitol T specifiys a type parameter

    public Team(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public boolean addPlayer(T player){  //Capitol T
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){ // Capitol T so that only the same type parameter of team can be compared
        if(ourScore > theirScore){
            won++;
        }else if (ourScore == theirScore){
            tied++;
        }else{
            lost++;
        }
        played++;

        if (opponent != null){
            opponent.matchResult(null, theirScore, ourScore);
        }
        
    }

    public int ranking(){
        return (won * 2) + tied;
    }
}