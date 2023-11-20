package monopoly;

public class GoToJailField extends Field implements FieldAction {
    public GoToJailField(String name, int position) {
        super(name, position);
    }

    public void doAction(Player player) {
        if(player.getHasFreeJailCard()) {
            System.out.println("Player: " + player.getPlayerName() + " has jail free card, continue play.");
            player.useJailFreeCard();
            return;
        }
        System.out.println("Player: " + player.getPlayerName() + " will be sent to jail.");
        player.setInJail(true);
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