package monopoly;

public class ChanceField extends Field implements FieldAction {
int position;
    public ChanceField(String name, int position) {
        super(name, position);
    }

    public void doAction(Player player) {
        System.out.println("Action for ChanceField: " + name);
        System.out.println("Player: " + player);
        player.pickChance();
    }

}