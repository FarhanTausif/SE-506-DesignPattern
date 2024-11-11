public class SandwichBuilder implements Builder{
    private String bread;
    private String filling;
    private String spread;
    private SandwichType type;
    @Override
    public void setBread(String bread) {
        this.bread = bread;
    }

    @Override
    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public void setSpread(String spread) {
        this.spread = spread;
    }

    @Override
    public void setSandwichType(SandwichType type) {
        this.type = type;
    }
    public Sandwich getResult(){
        return new Sandwich(bread, filling, spread, type);
    }
}
