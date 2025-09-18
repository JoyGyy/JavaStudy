package test_7;

public class Test_7 {
    public static void main(String[] args){
        Person ming = new Person();
        Person hong = new Person();
        ming.setName("XiaoMing");
        hong.setName("Xiao","Hong");
        System.out.println(ming.getName());
        System.out.println(hong.getName());
    }
}

class Person{
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void setName(String name1,String name2){
        this.name = name1 + name2;
    }

    public String getName(){
        return this.name;
    }

}
