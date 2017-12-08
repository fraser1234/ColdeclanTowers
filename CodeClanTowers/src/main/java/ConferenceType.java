public enum ConferenceType {
    TARTAN(50),
    TWEED(100),
    CASHMERE(200);

    private final int capacity;

    ConferenceType( int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() { return this.capacity; }
}
