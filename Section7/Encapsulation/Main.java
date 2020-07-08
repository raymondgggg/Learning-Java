public class Main{ 
    public static void main(String[] args) {//When encapsulation goes wrong 

        Player player = new Player();
        player.name = "Raymond";
        player.health = 100;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = "+ player.healthRemaining());

        
    }
}