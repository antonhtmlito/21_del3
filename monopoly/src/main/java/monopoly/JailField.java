package monopoly;

public class JailField extends Field implements FieldAction {
    public JailField(String name, int position) {
        super(name, position);
    }

    public void doAction(Player player) {
        if(player.getInJail()) {
            // TODO : handle this
        } else {
             System.out.println("Player: " + player.getPlayerName() + " visit jail.");
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