import java.util.List;

public class Battle {
    private General attacker;
    private General target;
    private General winner;
    private General looser;

    Battle(General attacker,General target) throws Exception {

        try {
            setAttacker(attacker);
            setTarget(target);
            checkGold(getAttacker());
            checkArmy();
            choseWinner();
            finishBattle();
            System.out.println("Winner " + getWinner().getName() + " Losser " +getLooser().getName());
        } catch (Exception err) {
            throw new Exception(err);
        }

    }

    public void setAttacker(General attacker) {
        this.attacker = attacker;
    }

    public void setTarget(General target) {
        this.target = target;
    }

    public General getAttacker() {
        return attacker;
    }

    public General getTarget() {
        return target;
    }

    public General getWinner() {
        return winner;
    }

    public General getLooser() {
        return looser;
    }




    private void choseWinner() {

        if(this.attacker.getArmy().getTotalStrenght() > this.target.getArmy().getTotalStrenght()) {
            this.winner = this.attacker;
            this.looser = this.target;
        }
        else if (this.attacker.getArmy().getTotalStrenght() == this.target.getArmy().getTotalStrenght()){
            this.winner = null;
            this.looser = null;
        }
        else {
            this.winner = this.target;
            this.looser = this.attacker;
        }

    }

    private void finishBattle() throws Exception {
        if(getLooser() == null && getWinner() == null) {
            this.attacker.getArmy().killRandomSoldier();
        }
        try {
            this.winner.getArmy().increaseSoldiersExp();
            this.looser.getArmy().decreseSoldiersExp();
            int goldForWinner = removeGoldFromLooser();
            giveGoldToWinner(goldForWinner);
        }
        catch (Exception err) {
            throw new Exception(err);
        }

    }

    private int giveGoldToWinner(int amount) {
        this.winner.addGold(amount);
        return this.winner.getGoldCoins();
    }
    private int removeGoldFromLooser() {
        int gold = this.looser.removeGoldCoins((int) Math.round(looser.getGoldCoins() * 0.10));
        return gold;
    };

    private boolean checkArmy() throws Exception {
        List<Soldier> attackerArmy = getAttacker().getArmy().getSoldiers();
        if(attackerArmy.isEmpty()) {
            throw new Exception("Attacker Army is empty");
        }
        else if(attackerArmy.isEmpty()) {
            throw new Exception("Target Army is empty");
        }
        return true;
    }
    private boolean checkGold(General general) throws Exception {
        int battleCost = 0;
        for (Soldier soldier : general.getArmy().getSoldiers()) {
            battleCost = battleCost + soldier.getRankValue();
        }
        if(!general.checkGold(battleCost)) throw new Exception("General: " + general.getName() + " can't attack, not enough gold");

        return true;
    }
}
