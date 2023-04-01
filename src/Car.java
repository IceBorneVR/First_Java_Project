public class Car
{
    String color; // 자동차 색상
    int speed = 0; // 현재 속도
    int getSpeed()
    {
        // 현재 속도 알려주기
        return speed;
    }

    void upSpeed(int value)
    {
        if (speed + value >= 200)
            speed = 200; // 최대속도 200
        else
            speed = speed + value;
    }
    void downSpeed(int value)
    {
        if (speed - value <= 0)
            speed = 0; // 최저속도 0
        else
            speed = speed - value;
    }
    String getColor()
    {
        return color;
    }
}
