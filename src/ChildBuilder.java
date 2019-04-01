import javax.swing.text.AsyncBoxView;

public interface ChildBuilder {
    ChildBuilder setAddres(String addres);

    ChildBuilder setID(String id);

    ChildBuilder setName(String name);

    Child build();
}
