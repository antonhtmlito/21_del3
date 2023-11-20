package monopoly;

public class PropertyField extends Field implements FieldAction {
    private int color;
    private int value = 0;
    private String owner = null;
    private int rent;
   

    public PropertyField(String name, int position, int color, int value, int rent) {
        super(name, position);
        this.color = color;
        this.value = value;
        this.rent = rent;
    }

    public void doAction(Player player) {
        System.out.println("Konsekvens for feltet: " + name);
        System.out.println("Spiller: " + player.getPlayerName());
        if(this.owner == null) {
            player.buyField(this);
            this.owner = player.getPlayerName();
        } else if(this.owner.equalsIgnoreCase(player.getPlayerName())) {
           // do nothing
        } else {
            player.payRent(this);
        }
    }
    @Override
    public int getRent() {
        return 0;
    }

    @Override
    public Player getOwner() {
        return null;
    }
}
