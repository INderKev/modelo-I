
package factories;

import components.EfectCard;
import components.EfectMonster;
import components.ImageCard;
import components.NameCard;

public abstract class FactoryMonsterCard implements Card{

    @Override
    public NameCard createNameCard() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public EfectCard ceateEfectCard() {
        return new EfectMonster();
    }

    @Override
    public ImageCard createImageCard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public abstract Attack SetAttack();
    
    public abstract Defense SetDefense();
    
    public abstract Level SetLevel();
    
    
    
}
