public class exam05
{
    static int var = 100; // 전역변수 (메소드 안에 속해있지 않음)

    public static void main(String[] args)
    {
        int var = 0; // 지역변수 (main 메소드 안에만 존재함)
        System.out.println(var);

        int sum = addFunction(10,20);
        System.out.println(sum);
    }

    static int addFunction(int num1, int num2)
    {
        int hap;
        hap = num1 + num2 + var;
        return hap;
    }
}
