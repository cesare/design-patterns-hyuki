package chapter04.idcard;


public class IndexedIDCard extends IDCard {
    private int index;
    
    IndexedIDCard(int index, String owner) {
        super(owner);
        this.index = index;
    }
    
    public int getIndex() {
        return index;
    }
    
    public String toString() {
        return this.getOwner() + "のカード/#" + index;
    }

    @Override
    public void use() {
        System.out.println(this + "のカードを使います。");
    }
}
