package builder;

public class main {

    public static void main(String[] args) {

        HumanBuilder builder = Human.builder();

        System.out.println(builder);

        builder.setName("Max").setWeight(160).setHeight(55);

        Human human = builder.build();

        System.out.println(human);


    }
}
