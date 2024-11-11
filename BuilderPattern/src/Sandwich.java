public class Sandwich {
    private String bread;
    private String filling;
    private String spread;
    private SandwichType type;

    public Sandwich(String bread, String filling, String spread, SandwichType type) {
        this.bread = bread;
        this.filling = filling;
        this.spread = spread;
        this.type = type;
    }

    public String getBread() {
        return bread;
    }

    public String getFilling() {
        return filling;
    }

    public String getSpread() {
        return spread;
    }

    public SandwichType getSandwichType() {
        return type;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", filling='" + filling + '\'' +
                ", spread='" + spread + '\'' +
                ", type=" + type +
                '}';
    }
}
