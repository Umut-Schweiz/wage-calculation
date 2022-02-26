package hicoders;

public class Child implements Workers{

    private int costHour = 10;
    private int maxHoursInWeek = 30;

    @Override
    public int calculateWeeklyWage() {
        return this.costHour * this.maxHoursInWeek;
    }
}
