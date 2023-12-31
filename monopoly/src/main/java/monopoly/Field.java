package monopoly;

public abstract class Field {
    protected int position;
    protected String name;

    public Field(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public abstract int getRent();
    public abstract Player getOwner();
}
