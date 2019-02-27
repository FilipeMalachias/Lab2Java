public class Country {

    private String name;
    Province[] provinces;

    public Country() {
        provinces = new Province[]
                {
                        new Province("Ontario", "Toronto", 13),
                        new Province("Quebec", "Quebec City", 8),
                        new Province("Nova Scotia", "Halifax", 1),
                        new Province("New Brunswick", "Frederiction", 1),
                        new Province("Manitoba", "Winnipeg", 1),
                        new Province("British Columbia", "Victoria", 4),
                        new Province("Prince Edward Island", "Charlottetown", 1),
                        new Province("Saskatchewan", "Regina", 1),
                        new Province("Alberta", "Edmonton", 4),
                        new Province("Newfoundland an Labrador", "St. John's", 1)
                };
    }

    public String getFirstProvinceName() {
        return provinces[0].getName();
    }

    public void displayAllProvince() {
        for (Province p: provinces) {
            System.out.println(p.getDetails());
        }

    }
    public int howManyHaveThisPopulation(int min, int max) {
        int count = 0;
        for (Province p:
            provinces) {
            if(p.getPopulationInMillions()>=min && p.getPopulationInMillions()<=max){
                count++;
            }
        }
        return count;
    }

}
