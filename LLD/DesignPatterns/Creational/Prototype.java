public class Prototype {
    
    // Prototype Interface
    public interface PrototypeI {
        PrototypeI clone();
    }

    // Concrete Prototype Class
    public static class ConcretePrototype implements PrototypeI {
        private String field;

        public ConcretePrototype(String field) {
            this.field = field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public String getField() {
            return field;
        }

        @Override
        public PrototypeI clone() {
            return new ConcretePrototype(this.field);
        }

        @Override
        public String toString() {
            return "ConcretePrototype{" + "field='" + field + '\'' + '}';
        }
    }

    // Client Code
    public static void main(String[] args) {
        ConcretePrototype prototype1 = new ConcretePrototype("Prototype 1");
        System.out.println("Original: " + prototype1);

        ConcretePrototype prototype2 = (ConcretePrototype) prototype1.clone();
        System.out.println("Clone: " + prototype2);

        prototype2.setField("Prototype 2");
        System.out.println("Modified Clone: " + prototype2);
        System.out.println("Original after modifying clone: " + prototype1);
    }
}
