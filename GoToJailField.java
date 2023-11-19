

public class GoToJailField extends Field implements FieldAction {
    public GoToJailField(String name, int position) {
        super(name);
        this.position = position;
    }

    public void doAction(Player player) {
        if(player.getHasFreeJailCard()) {
            System.out.println("Player: " + player + " has jail free card, continue play.");
            player.useJailFreeCard();
            return;
        }
        System.out.println("Player: " + player + " will be sent to jail.");
        player.setInJail(true);
    }
}