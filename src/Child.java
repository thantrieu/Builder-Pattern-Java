public class Child extends Father {
    private String address;

    public Child() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Child{" +
                "ID='" + getID() + '\'' +
                "Name='" + getName() + '\'' +
                "Address='" + address + '\'' +
                '}';
    }
}
