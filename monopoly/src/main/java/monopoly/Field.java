package monopoly;

public abstract class Field {
    protected int position;
    protected String name;
    protected String symbol;


    public Field(String symbol, String name, int position) {
        this.symbol = symbol;
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    
    public void setPosition(int position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public abstract int getRent();
    public abstract Player getOwner();
}