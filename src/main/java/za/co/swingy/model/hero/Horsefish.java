package za.co.swingy.model.hero;

/**
 * Horsefish
 * 
 * @author  Thapelo Masethe
 * @since   2019-07-14
 * @see     za.wtc.swingy.model.hero.Hero
 * @see     za.wtc.swingy.model.hero.Enemy
 * @version 1.0
 */
public class Horsefish extends Enemy {

    /**
     * Horsefish constructor: when creating an enemy
     * of type "Horsefish", {@code type}
     * is set to "Horsefish" and {@code attack}, 
     * {@code defense} & {@code hitPoints} are set
     * to 6, 2 & 15 plus its level respectively.
     * 
     * @param level The level of the enemy.
     */
    public Horsefish(int level) {
        super(level);
        this.name = "Big Belly Seahorse";
        this.type = "Horsefish";
        this.attack = level + 6;
        this.defense = level + 2;
        this.hitPoints = level + 15; 
    }
}