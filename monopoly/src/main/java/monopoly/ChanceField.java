package monopoly;

public class ChanceField extends Field {
    public ChanceField(String name, int position) {
        super(name, position);
    }

    public void doAction(Player player) {
        System.out.println("Consequence for chance field " + name);
        System.out.println("Player: " + player.getPlayerName());
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
