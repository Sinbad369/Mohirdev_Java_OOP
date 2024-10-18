/**
 * Person klassini yarating. Hamda ushbu klassga mantiqan xos bo’lgan atributlar qo’shing.
 */
public class Person {
    // Name
    // Height
    // Weight
    // Age
    // EyeColor
    // Sex
    // Ethnicity
    // Religion
    // Political Affection
    // Education
    // Country
    // GPA
    private String name;
    private double height;
    private double weight;
    private int age;
    private String eyeColor;
    private String sex;
    private String ethnicity;
    private String religion;
    private String politicalAffection;
    private String education;
    private String country;
    private double gpa;

    public Person(String name, double height, double weight, int age,
                  String eyeColor, String sex, String ethnicity, String religion, String politicalAffection,
                  String education, String country, double gpa){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.eyeColor = eyeColor;
        this.sex = sex;
        this.ethnicity = ethnicity;
        this.religion = religion;
        this.politicalAffection = politicalAffection;
        this.education = education;
        this.country = country;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getSex() {
        return sex;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public String getReligion() {
        return religion;
    }

    public String getPoliticalAffection() {
        return politicalAffection;
    }

    public String getEducation() {
        return education;
    }

    public String getCountry() {
        return country;
    }

    public double getGpa() {
        return gpa;
    }

    public void printPersonDetails(){
        System.out.println("Below the details of the person: ");
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Age: " + age);
        System.out.println("Eye Color: " + eyeColor);
        System.out.println("Sex: " + sex);
        System.out.println("Ethnicity: " + ethnicity);
        System.out.println("Religion: " + religion);
        System.out.println("Political Affection: " + politicalAffection);
        System.out.println("Education: " + education);
        System.out.println("Country: " + country);
        System.out.println("GPA: " + gpa);
    }
}
