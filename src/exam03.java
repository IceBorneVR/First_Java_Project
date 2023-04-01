public class exam03
{
    public static void main(String[] args)
    {
        int count = 85; // 내 점수

        if (count >= 90) // if문으로 점수 검사
        {
            System.out.println("if문 : 합격 (장학생)");
        }
        else if (count >= 60)
        {
            System.out.println("if문 : 합격");
        }
        else
        {
            System.out.println("if문 : 불합격");
        }

        int jumsu = (count/10)*10; // 점수 일의자리 버리기

        switch (jumsu) // switch문으로 점수 검사
        {
            case 100:
            case 90:
                System.out.println("switch문 : 합격 (장학생)");
                break;
            case 80:
            case 70:
            case 60:
                System.out.println("switch문 : 합격");
                break;
            default:
                System.out.println("switch문 : 불합격");
        }
    }
}
