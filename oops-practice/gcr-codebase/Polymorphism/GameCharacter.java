class GameCharacter {
    String characterName;

    GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    void performAttack() {
        System.out.println("Attack");
    }
}

class Warrior extends GameCharacter {
    Warrior(String characterName) {
        super(characterName);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Sword");
    }
}

class Mage extends GameCharacter {
    Mage(String characterName) {
        super(characterName);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Magic");
    }
}

class Archer extends GameCharacter {
    Archer(String characterName) {
        super(characterName);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Bow");
    }
}

public class Main {

    static void startBattle(GameCharacter[] characters) {
        int warriorCount = 0, mageCount = 0, archerCount = 0;

        for (GameCharacter c : characters) {
            c.performAttack();

            if (c instanceof Warrior)
                warriorCount++;
            else if (c instanceof Mage)
                mageCount++;
            else if (c instanceof Archer)
                archerCount++;
        }

        System.out.println("Warriors: " + warriorCount);
        System.out.println("Mages: " + mageCount);
        System.out.println("Archers: " + archerCount);
    }

    public static void main(String[] args) {
        GameCharacter[] team = {
                new Warrior("Thor"),
                new Mage("Merlin"),
                new Archer("Robin")
        };

        startBattle(team);
    }
}