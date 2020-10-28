package person;

public class Person {
    String sex;
    String name;
    int height;
    int age;
    
    public Person(String sex, String name, int height, int age){
    	this.sex = sex;
    	this.name = name;
    	this.height = height;
    	this.age = age;    
    }
    public Person() {
    	
    }
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public String getSex() {
    	return sex;
    }
    public void setSex(String sex) {
    	this.sex = sex;
    }
    public void setHeight(int height) {
    	this.height = height;
    }
    public int getAge() {
    	return age;
    }
    public String toString() {
    	return "Person [sex=" + sex + ", name=" + name + ",height=" + height +", age=" +age;
    }
    public static void main(String arg[]) {
    	int[] arrary = new int[5];
    	arrary[0]=1;
    	System.out.println(arrary[0]);
    	Person[] PArrary = new Person[5];    
        PArrary[0] = new Person("nan","lisi",180,18);
        PArrary[0].toString();
        Person p1 = new Person("Å®","º«Ñ©ÌÎ",100,300);
        System.out.println(p1.toString());
        System.out.println(p1.getName());
    }
}
