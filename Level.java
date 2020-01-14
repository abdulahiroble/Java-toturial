/**
 * Level
 */
public enum Level {
    // Three constants we can reference from level
    HIGH(3), MEDIUM(2), LOW(1);

    // private value
    private int lvlNum;

    // private constructor
    private Level(int num) {
        this.lvlNum = num;
    }

    public int getLv() {
        return this.lvlNum;
    }

    public void setLv(int num) {
        this.lvlNum = num;
    }
}