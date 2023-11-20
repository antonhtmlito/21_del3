package monopoly;

class FreeField extends Field implements FieldAction {
    private int reward = 0;

    public FreeField(String name, int position) {
        super(name, position);
    }

    public FreeField(String name, int position, int reward) {
        super(name, position);
        this.reward = reward;
    }

    public void doAction(Player player) {
        System.out.println("Player: " + player + " landed on free field.");
        if (this.reward != 0) {
            player.getReward(this);
        }
    }
}