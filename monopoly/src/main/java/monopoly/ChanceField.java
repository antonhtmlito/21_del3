package monopoly;

public class ChanceField extends Field implements FieldAction {
int position;
    public ChanceField(String name, int position) {
        super(name, position);
    }

    public void doAction(Player player) {
        System.out.println("Konskevens ved chancefelt " + name);
        System.out.println("Spiller: " + player.getPlayerName());
        player.pickChance();
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