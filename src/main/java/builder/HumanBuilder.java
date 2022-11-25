package builder;

public class HumanBuilder {
    private String name = "Jon";
    private int weight = 190;
    private int height = 90;

    public HumanBuilder setName(String name) {
        this.name = name;

        return this;
    }

    public HumanBuilder setWeight(int weight) {
        this.weight = weight;

        return this;
    }

    public HumanBuilder setHeight(int height) {
        this.height = height;

        return this;
    }

    public Human build() {
        return new Human(name, weight, height);
    }

    @Override
    public String toString() {
        return "HumanBuilder{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
