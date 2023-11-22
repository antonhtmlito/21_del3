package monopoly;
import java.util.Scanner;

public class PropertyField extends Field{
    private int color;
    private int value;
    private Player owner;
    private int rent;

    public PropertyField(String name, int position, int color, int value, int rent) {
        super(name, position);
        this.color = color;
        this.value = value;
        this.rent = rent;
        this.owner = null;
    }

    public void buyField(Player player) {
        System.out.println("Consequence for the field: " + getName());
        System.out.println("Player: " + player.getPlayerName());
    
        if (owner == null) {
            System.out.println("This property is not owned. Do you want to buy it? (Y/N)");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine().toUpperCase();
    
            if (response.equals("Y")) {
                if (player.getPlayerMoney() >= getValue()) {
                    player.setPlayerMoney(player.getPlayerMoney() - getValue());
                    setOwner(player);
                    System.out.println(player.getPlayerName() + " bought " + getName() +
                            " for $" + getValue());
                } else {
                    System.out.println(player.getPlayerName() + " does not have enough money to buy " + getName());
                }
            }
        } else if (!owner.equals(player)) {
            player.payRent(this);
        }
    }
    

    @Override
    public int getRent() {
        return rent;
    }

    @Override
    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public int getValue() {
        return value;
    }
}

