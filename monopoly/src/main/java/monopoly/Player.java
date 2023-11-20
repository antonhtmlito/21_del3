package monopoly;
public class Player {
    private String playerName;
    private int playerMoney;
    private boolean inJail;
    private boolean hasFreeJailCard;
    private int currentFieldPosition;

    public void getReward(FreeField field) {
       // TODO : handle this
       // this.playerMoney = this.playerMoney + field.getReward();
    }

    public void payRent(Field field) {
        if (field instanceof Field) {
            Field Field = (Field) field;
        
            int rentAmount = Field.getRent();
        
            if (playerMoney >= rentAmount) {
                playerMoney -= rentAmount;
                Field.getOwner().receiveRent(rentAmount);
                System.out.println(playerName + " paid rent of " + rentAmount + " to " + Field.getOwner().getPlayerName());
            } else {
                System.out.println(playerName + " doesn't have enough money to pay rent.");
            }
        } else {
            System.out.println("Cannot pay rent for this type of field.");
        }
        
        
    }

    public void buyField(Field field) {
       // TODO : handle this
    }

    public void useJailFreeCard() {
        //TODO :  handle this
    }

    public boolean getInJail() {
        return inJail;
    } 

    public void setInJail(boolean inJail) {
         this.inJail = inJail;
    } 

    public boolean getHasFreeJailCard() {
        return hasFreeJailCard;
    } 

    public void setHasFreeJailCard(boolean hasFreeJailCard) {
         this.hasFreeJailCard = hasFreeJailCard;
    }

    public Player(String playerName, int playerMoney) {
        this.playerName = playerName;
        this.playerMoney = playerMoney;
    }

    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", playerMoney=" + playerMoney +
                '}';
    }

    public String getPlayerName() {
        return playerName;
    }

    public void pickChance() {
        System.out.println("Player: " + playerName + " pickup chance.");
        // TODO: player pickup chance
    }

    public void receiveRent(int rentAmount) {
        this.playerMoney += rentAmount;
        System.out.println(playerName + " received rent of " + rentAmount);
    }
}
