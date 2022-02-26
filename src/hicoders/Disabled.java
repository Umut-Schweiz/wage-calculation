package hicoders;

public class Disabled implements Workers {

    private int costHour = 10;
    private int maxHoursInWeek = 10;

    @Override
    public int calculateWeeklyWage() {
        return this.costHour * this.maxHoursInWeek;
    }
}
