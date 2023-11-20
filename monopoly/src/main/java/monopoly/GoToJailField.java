package monopoly;

public class GoToJailField extends Field implements FieldAction {
    public GoToJailField(String name, int position) {
        super(name, position);
    }

    public void doAction(Player player) {
        if(player.getHasFreeJailCard()) {
            System.out.println("Spiller: " + player.getPlayerName() + " har et fri for fængsel kort, spil videre.");
            player.useJailFreeCard();
            return;
        }
        System.out.println("Spiller: " + player.getPlayerName() + " bliver sendt til fængsel.");
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