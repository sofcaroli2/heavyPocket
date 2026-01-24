public class TagImpl implements Tag {
    private final UUID id;
    private final String name;

    public TagImpl(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    @Override
    public UUID getId() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
    
}
