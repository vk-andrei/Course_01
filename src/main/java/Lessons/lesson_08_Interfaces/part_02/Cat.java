package Lessons.lesson_08_Interfaces.part_02;

public class Cat {
    private Color color;
    private CatAttributes catAttributes;

    public class CatAttributes {

        private String name;
        private int age;
        private int weight;
        public CatAttributes(String name, int age, int weight) {
            this.name=name;
            this.age=age;
            this.weight=weight;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return String.format("%s, %s years old, %s kg", name, age, weight);
        }

    }

    public Cat(Color color) {
        this("Murka", 1, 1, Color.BLACK);
    }

    public Cat (String name, int age, int weight, Color color) {
        catAttributes = new CatAttributes(name, age, weight);
        this.color = color;
    }


    public Color getColor (){
        return color;
    }

    @Override
    public String toString() {
        return String.format("Cat %s ", color.getRusName() + catAttributes);
    }
}
