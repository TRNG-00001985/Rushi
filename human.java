package rev.com;
public class Character 
{
    String name;
    String race;
    
    protected int level;
    protected int health;

    public Character(String name,String race, int level)
    {
        this.name=name;
        this.race=race;
        this.level=level;
        this.health=100;
    }

    public void attack()
    {
        this.health=health-30;
    }

    public void drinkpotion()
    {
        this.health = health+50;
    }
    
}

public class human extends Character
{

    public human(String name, String race, int level) 
    {
        super(name, race, level);
        
    }
}

public class Elf extends Character
{
    public Elf(String name, string race, int level)
    {
        super(name,race,level);
    }

    public ElvenImmortality()
    {

    }

}

public class Dwarf extends Character
{

    public Dwarf(String name, String race, int level) 
    {
        super(name, race, level);       
    }

    public dwarvenresilience()
    {

    }
}

public class Hobbit extends Character
{

    public Hobbit(String name, String race, int level) 
    {
        super(name, race, level);
    }

    public Hobbitstealth()
    {

    } 
}

interface CharacterClass
{
    String getName();
    String getRace();

    int getLevel();
    int getHealth();

    void attack();
    void drinkpotion();
}

class Ranger implements CharacterClass
{
    public void RangerTraking()
    {

    }
}

class Wizard implements CharacterClass
{
    public void WizardSpell()
    {

    }
}

class Warrior implements CharacterClass
{
    public void WarriorCombat()
    {

    }
}

class Commoner implements CharacterClass
{
    public void unknown()
    {

    }
}

public abstract class Creature
{
    String creaturetype;
    int attackpower;
    String specialability;

    public Creatures(String creatureType, int attackPower, String specialAbility)
    {
        this.creaturetype = creaturetype;
        this.attackpower = attackpower;
        this.specialability = specialability;
    }

    public string getaCreaturetype()
    {

    }

    public getattackpower()
    {

    }

    publlic specialability()
    {

    }
}

public class orc extends Creature
{
    public orc(int attackPower, String specialAbility) 
    {
        super(attackPower, specialAbility);
    }
}

public class Troll extends Creature
{
    public Troll(int attackPower, String specialAbility) 
    {
        super(attackPower, specialAbility);
    }
}

public class Dragon extends Creature
{
    public Dragon(int attackPower, String specialAbility) 
    {
        super(attackPower, specialAbility);
    }
}

public class Nazgul extends Creature
{
    public Nazgul(int attackPower, String specialAbility) 
    {
        super(attackPower, specialAbility);
    }
}