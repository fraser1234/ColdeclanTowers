public enum BedroomType {
    DOUBLE(2),
    KING(2),
    SINGLE(1),
    FAMILY(4);

    private final int capacity;

    BedroomType( int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() { return this.capacity; }
}

