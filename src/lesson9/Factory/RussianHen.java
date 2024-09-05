package lesson9.Factory;

public class RussianHen extends Hen{

    @Override
    public int getCountOfEggsPerMonth() {
        return 30;
    }

    public String getDescription(){
        return super.getDescription() + " Моя страна - Россия. Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
