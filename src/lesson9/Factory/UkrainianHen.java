package lesson9.Factory;

public class UkrainianHen extends Hen{

    @Override
    public int getCountOfEggsPerMonth() {
        return 25;
    }

    public String getDescription(){
        return super.getDescription() + "Моя страна - Украина. Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
