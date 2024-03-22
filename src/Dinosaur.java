public class Dinosaur {
   private String name;
   private String species;
   private Boolean healthStatus;

   private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFeedingTime() {
        return feedingTime;
    }

    public void setFeedingTime(String feedingTime) {
        this.feedingTime = feedingTime;
    }

    private String feedingTime;

    public Dinosaur() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Boolean isILL() {
        return healthStatus;
    }

    public void setHealthStatus(Boolean healthStatus) {
        this.healthStatus = healthStatus;
    }


    public Dinosaur(String name, String species, Boolean healthStatus) {
        this.name = name;
        this.species = species;
        this.healthStatus = healthStatus;
    }

    public Dinosaur(String name, String species, Boolean healthStatus, String feedingTime) {
        this.name = name;
        this.species = species;
        this.healthStatus = healthStatus;
        this.feedingTime = feedingTime;
    }

    public Dinosaur(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}
