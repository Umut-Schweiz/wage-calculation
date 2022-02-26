package hicoders;

public class Good implements Workers{

    private int costHour = 40;
    private int maxHoursInWeek = 40;

    @Override
    public int calculateWeeklyWage() {
        return this.costHour * this.maxHoursInWeek;
    }

}
