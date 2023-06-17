public class Soldier {
    public Rank rank;
    private int strenght;
    private int experiance = 1;
    boolean alive = true;

    Soldier(Rank rank) {
        setRank(rank);
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }


    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public Rank getRank() {
        return rank;
    }
    public int getRankValue() {
        return rank.value;
    }

    public int getExperiance() {
        return experiance;
    }
    public int getStrenght() {
        updateStrenght();
        return this.strenght;
    }

    public void decreseExpirience() {
        this.experiance = this.experiance -1;
        if(this.experiance < 1) {
            this.alive = false;
        }
    }
    public void increseExpirience() {
        this.experiance = this.experiance +1;
        if(experiance == getRankValue() * 5) {
            this.rank = increseRank(this);
            this.experiance = 1;
        }
    }

    public Rank increseRank(Soldier soldier) {
        Rank rank_to_upgrade = soldier.rank;

        return rank_to_upgrade;
    };
    private void updateStrenght() {
        this.strenght = getRankValue() * this.experiance;

    }


}