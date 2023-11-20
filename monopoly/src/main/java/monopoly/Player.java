package monopoly;
public class Player {
    private String playerName;
    private int playerMoney;
    private boolean inJail;
    private boolean hasFreeJailCard;
    private int currentFieldPosition;
    public boolean p1Turn;

    public void getReward(FreeField field) {
       // TODO : handle this
       // this.playerMoney = this.playerMoney + field.getReward();
    }

    public void payRent(Field field) {
        if (field instanceof Field) {
            Field Field = (Field) field;
        
            int rentAmount = Field.getRent();
        
            if (playerMoney >= rentAmount) {
                playerMoney -= rentAmount;
                Field.getOwner().receiveRent(rentAmount);
                System.out.println(playerName + " har betalt leje på " + rentAmount + " til " + Field.getOwner().getPlayerName());
            } else {
                System.out.println(playerName + " har ikke nok penge til at betale leje.");
            }
        } else {
            System.out.println("Kan ikke betale leje for dette type felt.");
        }
        
        
    }

    public void buyField(Field field) {
       // TODO : handle this
    }

    public void useJailFreeCard() {
        //TODO :  handle this
    }

    public boolean getInJail() {
        return inJail;
    } 

    public void setInJail(boolean inJail) {
         this.inJail = inJail;
    } 

    public boolean getHasFreeJailCard() {
        return hasFreeJailCard;
    } 

    public void setHasFreeJailCard(boolean hasFreeJailCard) {
         this.hasFreeJailCard = hasFreeJailCard;
    }

    public Player(String playerName, int playerMoney) {
        this.playerName = playerName;
        this.playerMoney = playerMoney;
    }

    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", playerMoney=" + playerMoney +
                '}';
    }

    public String getPlayerName() {
        return playerName;
    }

    private int[] cards = new int[20];

    public void pickChance() {
        System.out.println("Player: " + player + " pickup chance.");
        
        for (int i = 0; i < cards.length; i++) {
            cards[i] = i + 1;
        }

        int temp = cards[0];

        if (p1Turn = true) {
            pos = p1Pos;
        }
        else {
            pos = p2Pos;
        }

        if (temp == 0) {
            System.out.println("Ryk frem til Start og modtag M2.");
            pos = 0;
            playerMoney =+ 2;
        }
        else if (temp == 1) {
            System.out.println("Ryk 5 felter frem.");
            pos =+ 5;
        }
        else if (temp == 2) {
            System.out.println("Ryk 1 felt frem, eller tag et chancekort mere");
            Scanner scan = new Scanner(System.in);

            String command = scan.nextLine();
            switch(command) {
                case "ryk":
                    pos =+ 1;
                    break;
                case "chance":
                    //igen??
                    break;
            }
            scan.close();
        }
        else if (temp == 3) {
            System.out.println("Ryk frem til Strandpromenaden");
            pos = 23;
        }
        else if (temp == 4) {
            System.out.println("Du har spist for meget slik. Betal M2 til banken.");
            playerMoney =- 2;
        }
        else if (temp == 5) {
            System.out.println("Det er din fødselsdag! Alle giver dig M1. Tillykke med fødselsdagen!");
            playerMoney =+ playerAmount + 1;
            //alles money =- 1;
        }
        else if (temp == 6) {
            System.out.println("Du har lavet alle dine lektier. Modtag M2 fra banken.");
            playerMoney =+ 2;
        }
        else if (temp == 7) {
            System.out.println("Gratis felt! Ryk frem til Skaterparken for at lave det perfekte grind! hvis ingen ejer den, får du den gratis! Ellers skal du betale leje til ejeren.");
            pos = 10;
            if (isOwned = false) {
                //få grunden
            }
            else {
                //betal leje
            }
        }
        else if (temp == 8) {
            System.out.println("Gratis felt! Ryk frem til et orange felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
            //ryk til 10 eller 11

        }
        else if (temp == 9) {
            System.out.println("Gratis felt! Ryk frem til et orange eller grønt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
            //ryk til 10, 11, 19 eller 20
        }
        else if (temp == 10) {
            System.out.println("Gratis felt! Ryk frem til et lyseblåt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
            //ryk til 4 eller 5
        }
        else if (temp == 11) {
            System.out.println("Gratis felt! Ryk frem til et pink eller mørkeblåt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
            //ryk til 7, 8, 22 eller 23
        }
        else if (temp == 12) {
            System.out.println("Gratis felt! Ryk frem til et rødt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
            //ryk til 13 eller 14
        }
        else if (temp == 13) {
            System.out.println("Gratis felt! Ryk frem til et lyseblåt eller rødt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
            //ryk til 4, 5, 13 eller 14
        }
        else if (temp == 14) {
            System.out.println("Gratis felt! Ryk frem til et brunt eller gult felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
            //ryk til 1, 2, 16 eller 17
        }
        else if (temp == 15) {
            System.out.println("Du løslades uden omkostninger. Behold dette kort, indtil du får brug for det.");
            hasFreeJailCard = true;
        }
        else if (temp == 16) {
            System.out.println("Giv dette kort til Bilen, og tag et chancekort mere. Bil: på din næste tur skal du drøne frem til et hvilket som helst ledigt felt og købe det. Hvis der ikke er nogle ledige felter, skal du købe et fra en anden spiller!");
            //igen??
            //ryk til et ledigt felt (isOwned = false)
        }
        else if (temp == 17) {
            System.out.println("Giv dette kort til Skibet, og tag et chancekort mere. Skib: på din næste tur skal du selje frem til et hvilket som helst ledigt felt og købe det. Hvis der ikke er nogle ledige felter, skal du købe et fra en anden spiller!");
            //igen??
            //ryk til et ledigt felt (isOwned = false)
        }
        else if (temp == 18) {
            System.out.println("Giv dette kort til Katten, og tag et chancekort mere. Kat: på din næste tur skal du liste dig hen på et hvilket som helst ledigt felt og købe det. Hvis der ikke er nogle ledige felter, skal du købe et fra en anden spiller!");
            //igen??
            //ryk til et ledigt felt (isOwned = false)
        }
        else if (temp == 19) {
            System.out.println("Giv dette kort til Hunden, og tag et chancekort mere. Hund: på din næste tur skal du hoppe hen på et til et hvilket som helst ledigt felt og købe det. Hvis der ikke er nogle ledige felter, skal du købe et fra en anden spiller!");
            //igen??
            //ryk til et ledigt felt (isOwned = false)
        }

        if (p1Turn = true) {
            p1Pos = pos;
        }
        else {
            p2Pos = pos;
        }

        for (int i = 0; i < cards.length - 1; i++) {
            cards[i] = cards[i + 1];
        }

        cards[cards.length - 1] = temp;
        
    }

    public void receiveRent(int rentAmount) {
        this.playerMoney += rentAmount;
        System.out.println(playerName + " modtager leje på " + rentAmount);
    }
}
