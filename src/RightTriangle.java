public class RightTriangle {
    // legA
    // legB
    // hypotenuse
    private double legA;
    private double legB;
    private double hypotenuse;
    private double area;
    public RightTriangle(double legA, double legB, double hypotenuse){
        this.legA = legA;
        this.legB = legB;
        this.hypotenuse = hypotenuse;
        this.area = area;
    }

    public double getLegA(){
        return legA;
    }
    public double getLegB(){
        return legB;
    }
    public double getHypotenuse(){
        return hypotenuse;
    }

    public double getArea(){
        area = legA * legB / 2;
        return area;
    }
    public void printRightTriangleDetails(){
        System.out.println("Below the right-triangle details and area is given:");
        System.out.println("Leg A: " + legA);
        System.out.println("Leg B: " + legB);
        System.out.println("Hypotenuse: " + hypotenuse);
        System.out.println("Area of this triangle: " + getArea());
    }


}
