class Test{
    public int sum(int num1, int num2){
        return num1+num2;
    }
}

class Basic{
    public static void main(String[] args) {
        Test test1 = new Test(); // creating a new object
        System.err.println(test1.sum(5,10)); 


    }
}