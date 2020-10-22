/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import components.EfectCard;
import components.ImageCard;
import components.NameCard;



        
        
public interface Card {
 
    public  NameCard createNameCard();
    
    public  EfectCard ceateEfectCard();
    
    public ImageCard createImageCard();
   
    
}
