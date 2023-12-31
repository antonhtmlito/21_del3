package monopoly;

public class FreeField extends Field {
    private int reward = 0;

    public FreeField(String name, int position) {
        super(name, position);
    }

    public FreeField(String name, int position, int reward) {
        super(name, position);
        this.reward = reward;
    }

    public void doAction(Player player) {
        System.out.println("Player: " + player + " landed on a free field");
        if (this.reward != 0) {
            player.getReward(this);
        }
    }

    @Override
    public int getRent() {
        throw new UnsupportedOperationException("Unimplemented method 'getRent'");
    }

    @Override
    public Player getOwner() {
        throw new UnsupportedOperationException("Unimplemented method 'getOwner'");
    }
}
