public class Province {
    private static final String DEFAULT_PROVINCE = "British Columbia";
    private static final String DEFAULT_CAPITAL = "Victoria";
    private static final int DEFAULT_POPULATION_MILLIONS = 4;
    private String name;
    private String capital;
    private int populationInMillions;

    public Province (String name, String capital, int populationInMillions) {

        if(isValidProvince(name) && isValidCapital(capital) &&
                isValidPopulation(populationInMillions)){
            this.name = name;
            this.capital = capital;
            this.populationInMillions = populationInMillions;

        } else { // if there is any error; create the default data, shown below
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
            this.populationInMillions = DEFAULT_POPULATION_MILLIONS;
        }
    }

    private boolean isValidProvince(String province) {
        String [] provinces  = {"Ontario", "Quebec", "Nova Scotia", "New Brunswick", "Manitoba",
                "British Columbia", "Prince Edward Island", "Saskatchewan", "Alberta",
                "Newfoundland an Labrador"};

        int i = 0;
        while (i < provinces.length) {
            if (province.equals(provinces[i])) {
                return true;
            }
            i++;
        }
        return false;
    }

    private boolean isValidCapital(String capital){
        String [] capitals = {"Toronto", "Quebec City", "Halifax", "Frederiction", "Winnipeg",
            "Victoria", "Charlottetown", "Regina", "Edmonton", "St. John's"};
        for (String cap : capitals) {
            if (capital.equals(cap)) {
                return true;
            }
        }
        return false;
    }


    private boolean isValidPopulation(int populationInMillions) {
        if (populationInMillions >= 4 && populationInMillions <= 38) {
            return true;
        }
        return false;
    }

    public String getDetails() {
        return String.format("The capital of %s is %s an have %d population in millions.", name, capital, populationInMillions);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulationInMillions() {
        return populationInMillions;
    }

    public void setPopulationInMillions(int populationInMillions) {
        this.populationInMillions = populationInMillions;
    }
}
