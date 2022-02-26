package hicoders;

public class Lazy implements Workers {

    private int costHour = 23;
    private int maxHoursInWeek = 20;

    @Override
    public int calculateWeeklyWage() {
        return this.costHour * this.maxHoursInWeek;
    }
}
