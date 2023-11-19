package monopoly;

public class JailField extends Field implements FieldAction {
    public JailField(String name, int position) {
        super(name);
        this.position = position;
    }

    public void doAction(Player player) {
        if(player.getInJail()) {
            // TODO : handle this
        } else {
             System.out.println("Player: " + player.getPlayerName() + " visit jail.");
        }
    }
}