package factories;

import components.EfectCard;
import components.ImageCard;
import components.NameCard;


public class FactoryTrampCard implements Card{

    @Override
    public NameCard createNameCard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EfectCard ceateEfectCard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImageCard createImageCard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
