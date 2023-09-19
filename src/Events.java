public class Events {
    String band;
    String date;
    String venue;
    int seatsAvailable;

    @Override
    public String toString() {
        return "Events: " +
                "band='" + band + '\'' +
                ", date='" + date + '\'' +
                ", avenue='" + venue + '\'' +
                ", seatsAvailable=" + seatsAvailable;
    }
}
