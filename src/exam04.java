public class exam04
{
    public static void main(String[] args)
    {
        int one[] = new int[3]; // 3칸짜리 배열 생성

        for(int i = 0; i < one.length; i++)
        {
            one[i] = 10 * i; // 배열에 0, 10, 20 들어감
        }

        String two[] = {"하나","둘","셋"};

        for (String str : two)
        {
            System.out.println(str); // two 배열 내용 모두 출력
        }

        int j = 0;
        while (j < one.length)
        {
            System.out.println(one[j]); // one 배열 내용 모두 출력
            j++;
        }
    }
}
