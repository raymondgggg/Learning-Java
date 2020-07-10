public class Main{
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beck = new SoccerPlayer("Beck");

        Team<FootballPlayer> crows = new Team<>("Crows");
        crows.addPlayer(joe);
       

        System.out.println(crows.numPlayers());

        Team<BaseballPlayer> baseBallTeam = new Team<>("Cubs");
        baseBallTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("FC Barcelona");
        soccerTeam.addPlayer(beck);

        /*Notes: An arguments passed for a type parameter can either be a class or interface
        Interfaces can also specify type parameters you can extend from only one class 
        but multiple interfaces for specifying multiple bounds

        Ex: public class Team<T extends Player & Coach & Manager> 
        
        Coach and Manager above would be interfaces*/

    }
}