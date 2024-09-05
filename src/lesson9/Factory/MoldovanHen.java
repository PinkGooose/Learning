package lesson9.Factory;

public class MoldovanHen extends Hen{

    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }

    public String getDescription(){
        return super.getDescription() + "Моя страна - Молдова. Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
