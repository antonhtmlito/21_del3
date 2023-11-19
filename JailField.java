

public class JailField extends Field implements FieldAction {
    public JailField(String name) {
        super(name);
    }

    public void doAction(Player player) {
        if(player.getInJail()) {
            // TODO : handle this
        } else {
             System.out.println("Player: " + player + " visit jail.");
        }
    }
}