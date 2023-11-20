package monopoly;

public class FreeField extends Field implements FieldAction {
    private int reward = 0;
    public FreeField(String name, int position) {
        super(name, position);
    }

    public FreeField(String name, int position, int reward) {
        super(name, position);
        this.reward = reward;
    }

    public void doAction(Player player) {
        System.out.println("Spiller: " + player + " landte på et frit felt");
        if(this.reward != 0) {
            player.getReward(this);
        }
    }

    @Override
    public int getRent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRent'");
    }

    @Override
    public Player getOwner() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOwner'");
    }
    
}
