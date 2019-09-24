package za.co.swingy.model.hero;

/**
 * Enemy
 * 
 * @author  Thapelo Masethe
 * @since   2019-07-07
 * @see     za.wtc.swingy.model.hero.Hero
 * @version 1.0
 */
public abstract class Enemy extends Hero  {

    /**
     * Enemy constructor: set the 
     * {@code level} of the enemy.
     * 
     * @param level The level of the enemy.
     */
    public Enemy(int level) {
        this.level = level;
    }
}