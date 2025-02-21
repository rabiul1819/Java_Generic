package bookLesson_3.page_94;

 class AutoboxingExample {
    public Integer add(Integer a, Integer b){
        return a + b;
    }

    public static void main(String[] args) {
        AutoboxingExample example = new AutoboxingExample();
        int a = 5;
        int b = 15;
        System.out.println(example.add(a,b));

    }
}
