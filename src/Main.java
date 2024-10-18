public class Main {
    public static void main(String[] args) {

        System.out.println("Hello akamullo\n");
        Car carRubenBaldoro = new Car("Black matte", "Ferrari La Ferrari",
                200_000, "Automatic");
        carRubenBaldoro.printCarDetails();

        RightTriangle rightTriangle = new RightTriangle(3, 4,5);
        System.out.println();
        rightTriangle.printRightTriangleDetails();

        System.out.println();
        Person person = new Person("Serikpay", 180, 80, 25,
                "Jet-black", "Malevachcha", "proud Turkic", "Muslim",
                "Centre-Right", "Bachelor`s", "Uzbekistan",
                93);
        person.printPersonDetails();
    }
