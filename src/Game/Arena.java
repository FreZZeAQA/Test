//package Game;
//
//public class Arena implements Fightable {
//
//
//    @Override
//    public void startFight(Warrior warrior1, Warrior warrior2) {
//        System.out.print("******Warriors******\n"+warrior1.getName() + ":" + warrior1 + "\n" + warrior2.getName() + ":" + warrior2 + "\n******FIGHT!******\n");
//
//        do {
//            System.out.print("\n" + warrior1.getName() + " damaged " + warrior2.getName() + "\n" + warrior2.getName() + " hp:");
//            warrior1.attack(warrior2);
//            System.out.print("\n" + warrior2.getName() + " damaged " + warrior1.getName() + "\n" + warrior1.getName() + " hp:");
//            
//        } while (warrior1.getHp() > 0 && warrior2.getHp() > 0);
//
//
//    }
//
//    @Override
//    public void showFightResult(Warrior warrior1, Warrior warrior2) {
//        if (warrior1.getHp() > 0)
//            System.out.println("\n******DIED******\n" + warrior2.getName() + "\n\n******WINNER******\n" + warrior1.getName()+"\n");
//        else if (warrior2.getHp() > 0)
//            System.out.println("\n******DIED******\n" + warrior1.getName() + "\n\n******WINNER******\n" + warrior2.getName()+"\n");
//        else
//            System.out.println("\n******DIED******" + warrior1.getName() + "\n******DIED******" + warrior2.getName() + "\n\n" + warrior1.getName() + " ******DRAW****** " + warrior2.getName());
//    }
//
//    @Override
//    public void startFight(Warrior warrior1, Warrior warrior2) {
//
//    }
//
//    @Override
//    public void showFightResult(Warrior warrior1, Warrior warrior2) {
//
//    }
//}

