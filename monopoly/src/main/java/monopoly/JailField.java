package monopoly;

public class JailField extends Field {
    public JailField(String name, int position) {
        super(name, position);
    }

    public void doAction(Player player) {
        if(player.getInJail()) {
            // TODO : handle this
        } else {
             System.out.println("player: " + player.getPlayerName() + " is visiting prison");
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