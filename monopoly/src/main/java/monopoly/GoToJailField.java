package monopoly;

public class GoToJailField extends Field{
    public GoToJailField(String name, int position) {
        super(name, position);
    }

    public void doAction(Player player) {
        if(player.getHasFreeJailCard()) {
            System.out.println("Player: " + player.getPlayerName() + " has a get out of jail free card. Keep on playing");
            player.useJailFreeCard();
            return;
        }
        System.out.println("Player: " + player.getPlayerName() + " will be sent to prison.");
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