public class BuilderTest {
    public static void main(String[] args) {
        Child child = new BuilderClass()
                .setAddres("Ha Noi")
                .setID("B202002")
                .setName("Tran Van Hung")
                .build();

        System.out.println(child);
    }
}
