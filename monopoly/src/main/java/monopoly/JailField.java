package monopoly;

public class JailField extends Field {
    public JailField(String name, int position) {
        super(name, position);
    }

    public void doAction(Player player) {
        if(player.getInJail()) {
            System.out.println("You'll have to pay 1000 money to get bail.");
            player.setPlayerMoney(player.getPlayerMoney() - 1000);
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