class Data{
    public Integer num;
    public String name;
    Data(int _num,String _name){
        this.num = _num;
        this.name=_name;
    }
}

public class Basics {
    public static void main(String[] args){
        
        Data dataObj1 = new Data(1,"Inna");
        Data dataObj2 = new Data(2,"Minna");
        dataObj1.name = "World";
        System.out.println(dataObj1.name);
        System.out.println(dataObj2.name);
        dataObj2.name = "Hello";
        System.out.println(dataObj2.name);
    }
}
