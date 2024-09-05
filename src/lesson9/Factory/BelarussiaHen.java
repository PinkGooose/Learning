package lesson9.Factory;

public class BelarussiaHen extends Hen{

    @Override
    public int getCountOfEggsPerMonth() {
        return 15;
    }

    public String getDescription(){
        return super.getDescription() + "Моя страна - Булерусь. Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
