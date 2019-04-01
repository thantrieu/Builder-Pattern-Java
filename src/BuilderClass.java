public class BuilderClass implements ChildBuilder {
    private Child child;

    public BuilderClass() {
        child = new Child();
    }

    public Child build(){
        Child c = new Child();
        c.setName(child.getName());
        c.setID(child.getID());
        c.setAddress(child.getAddress());
        return c;
    }

    @Override
    public ChildBuilder setAddres(String addres) {
        child.setAddress(addres);
        return this;
    }

    @Override
    public ChildBuilder setID(String id) {
        child.setID(id);
        return this;
    }

    @Override
    public ChildBuilder setName(String name) {
        child.setName(name);
        return this;
    }
}
