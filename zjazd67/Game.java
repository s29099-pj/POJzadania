public class Game {



    Game(){
        start();

    }




    public void start(){
        try{
            General Szymon = new General("Szymon");
            General Michal = new General("Michal");

            Szymon.buySolider(2,Rank.KAPRAL);
            Michal.buySolider(3,Rank.KAPRAL);
            Szymon.makeArmyManeuver();
            Szymon.makeArmyManeuver();
            Michal.makeArmyManeuver();
            Szymon.attack(Michal);
            Michal.attack(Szymon);
        }
        catch (Exception error) {
            System.err.println(error);
        }

    }
    public void gameInProgres(){

    }


}
