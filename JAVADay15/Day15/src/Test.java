public class Test {
    public static class Person{
        String name;

        public Person(){
           this.name = "Arizona";
        }
    }
    public static void main(String[] args) {
        Person obj = new Person();
        System.out.println(obj.name);
    }
}
