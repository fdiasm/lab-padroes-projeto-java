package one.digitalinnovation.gof.builder;

public class Player {
    private String name;
    private Integer age;
    private String sport;
    private Boolean isRetired;
    private Boolean hasOlympicMedal;

    private Player(PlayerBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sport = builder.sport;
        this.isRetired = builder.isRetired;
        this.hasOlympicMedal = builder.hasOlympicMedal;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getSport() {
        return sport;
    }

    public Boolean getIsRetired() {
        return isRetired;
    }

    public Boolean getHasOlympicMedal() {
        return hasOlympicMedal;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", age=" + age + ", sport=" + sport + ", isRetired=" + isRetired
                + ", hasOlympicMedal=" + hasOlympicMedal + "]";
    }

    public static class PlayerBuilder {
        private String name;
        private Integer age;
        private String sport;
        private Boolean isRetired = false;
        private Boolean hasOlympicMedal = false;
    
        public PlayerBuilder(String name, Integer age, String sport) {
            this.name = name;
            this.sport = sport;
            this.age = age;
        }
    
        public PlayerBuilder setIsRetired(Boolean isRetired) {
            this.isRetired = isRetired;
            return this;
        }
    
        public PlayerBuilder setHasOlympicMedal(Boolean hasOlympicMedal) {
            this.hasOlympicMedal = hasOlympicMedal;
            return this;
        }
    
        public Player build() {
            return new Player(this);
        }   
    
    }
    
}
