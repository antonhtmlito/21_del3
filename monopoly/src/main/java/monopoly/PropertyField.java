package monopoly;

class PropertyField extends Field implements FieldAction {
    private String color;
    private int value = 0;
    private Player owner = null;
    private int rent;

    public PropertyField(String name, int position, String color, int value, int rent) {
        super(name, position);
        this.color = color;
        this.value = value;
        this.rent = rent;
    }

    public void doAction(Player player) {
        System.out.println("Action for PropertyField: " + name);
        System.out.println("Player: " + player);
        if (this.owner == null) {
            player.buyField(this);
            this.owner = player;
        } else if (this.owner == player) {
            // do nothing
        } else {
            player.payRent(this);
        }
    }
}