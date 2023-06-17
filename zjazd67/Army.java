import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Army {

    private ArrayList<Soldier> soldiers ;
    private int totalStrenght;

    private int totalRanks;

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    Army() {
        setSoldiers();
    }


    public void setSoldiers() {
        this.soldiers = new ArrayList<Soldier>();;
    }

    public int getTotalStrenght() {
        calculateTotalStrenght();
        return totalStrenght;
    }
    public int getTotalRanks() {
        calculateTotalRanks();
        return totalRanks;
    }


    public void decreseSoldiersExp() {
        List<Soldier> army = this.getSoldiers();
        for (Soldier soldier : army) {
            soldier.decreseExpirience();
            if(soldier.getExperiance() > 1) {
                army.remove(soldier);
            }
        }
    };
    public void increaseSoldiersExp() {
        for (Soldier soldier : this.getSoldiers()) {
            soldier.increseExpirience();
        }
    };

    private void calculateTotalStrenght() {
        int strenght = 0;
        for (Soldier soldier : this.getSoldiers()) {
            strenght = strenght + soldier.getStrenght();
        }
        this.totalStrenght = strenght;
    }

    private void calculateTotalRanks() {
        int ranks = 0;
        for (Soldier soldier : this.getSoldiers()) {
            ranks =  ranks + soldier.getRankValue();
        }
        this.totalRanks = ranks;
    }



    private void addSoldier(Rank rank) {
        getSoldiers().add(new Soldier(rank));
    }

    public void addSoldiers(int amount, Rank rank){
        for (int i = 0; i < amount; i++) {
            addSoldier(rank);
        }
    }


    public Soldier killRandomSoldier() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(this.getSoldiers().size());
        Soldier solider =  this.getSoldiers().remove(randomIndex);
        return solider;
    }
}
