import java.util.List;

public class General {
    public String name;
    private int goldCoins = 500;
    public Army army;

    General(String name) {
        setName(name);
        setArmy(new Army());
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Army getArmy() {
        return army;
    }

    public int getGoldCoins() {
        return goldCoins;
    }


    public String getName() {
        return name;
    }


    public int removeGoldCoins(int amountOfGold) throws IllegalArgumentException {
        if(amountOfGold < 1) {
            throw new IllegalArgumentException("gold to remove  must be positive");
        }
        this.goldCoins = goldCoins - amountOfGold;
        return this.goldCoins;
    }
    public int addGold(int amountOfGold) throws IllegalArgumentException {
        if(amountOfGold < 1) {
            throw new IllegalArgumentException("gold to add  must be positive");
        }
        this.goldCoins = goldCoins + amountOfGold;
        return this.goldCoins;
    }

    public Battle attack(General target) throws Exception {
        try {
            return new Battle(this,target);
        }
        catch (Exception error) {
            throw new Exception(error);
        }
    };

    public void buySolider(int amount, Rank rank) throws Exception {
        int cost = (int) Math.round(rank.value * amount * 10);
        if(!checkGold(cost)) {
            throw new Exception("General dont have enough gold to buy new solider");
        }
        this.removeGoldCoins(cost);
        getArmy().addSoldiers(amount,rank);
    }

    public void makeArmyManeuver() throws Exception  {
        int goldNeeded;

        int totalRanks = this.army.getTotalRanks();

        if(totalRanks > this.goldCoins)
        {
            throw new Exception("General dont have enough gold to make Army maneuver");
        }
        getArmy().increaseSoldiersExp();

    }



    public boolean checkGold(int cost) {
        if(getGoldCoins() < cost) return false;
        return true;
    }


}
