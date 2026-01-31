package OOPs.encapsulation;

public class Player {

    private String fullName;
    private int healthPercentage;
    private String weapon;

    public Player(String fullName) {
        this(fullName,100,"Sword");
    }

    public Player(String fullName, int health, String weapon) {
        this.fullName = fullName;

        if(health <= 0){
            this.healthPercentage = 1;
        } else if(health >= 100){
            this.healthPercentage = 100;
        }else {
            this.healthPercentage = health;
        }
        this.weapon = weapon;
    }

    public void looseHealth(int damage){
        healthPercentage = healthPercentage - damage;
        if(healthPercentage <= 0){
            System.out.println("Player knocked out of the game");
        }
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void restoreHealth(int restore){
        healthPercentage += restore;
        if(healthPercentage >= 100){
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }

    /*public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getHealthPercentage() {
        return healthPercentage;
    }

    public void setHealthPercentage(int healthPercentage) {
        this.healthPercentage = healthPercentage;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }*/
}
