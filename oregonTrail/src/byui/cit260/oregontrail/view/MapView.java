package byui.cit260.oregontrail.view;

import oregontrail.OregonTrail;

public class MapView extends View {
    
    public MapView() {
    
        super("\n"+
"=============================================================================\n" +
" |                                                                         |\n" +
" |                         Map of the Oregon Trail                         |\n" +
" |                                                                         |\n" +
" |                       ---.____    ,/k.                                  |\n" +
" |                       ___,---'  /  ih,__,-----.___                      |\n" +
" |                              ,-' ,  `:7b----.__---`                     |\n" +
" |                          _.-/   '  /b.`.4p,                             |\n" +
" |                      --\"  ,    ,-' ^6x, `.\"^=._                         |\n" +
" |                                                                         |\n" +
"=============================================================================\n" +
" |									   |\n" +
" |   *END*                                                                 |\n" +
" |*Oregon City*                                                            |\n" +
" |                                                                         |\n" +               
" |    Fort Walla Walla							   |\n" +
" |	  The Dalles							   |\n" +
" |		Blue Mountains                                  	   |\n" +
" |		    Fort Boise				                   |\n" +
" |			Fort Hall			   	   	   |\n" +
" |			    Soda Springs			   	   |\n" +
" |				Fort Bridger			   	   |\n" +
" |				    South Pass			   	   |\n" +
" |					Independence Rock                  |\n" +
" |					    Laramie			   |\n" +
" |						Chimney Rock               |\n" +
" | 						    Fort Kearney	   |\n" +
" |   						    	   *START*		|\n" +
" |						    	*Independence*	   |\n" +
" |                                                                         |\n" +
"=============================================================================");
        OregonTrail.pressAnyKeyToContinue();
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
