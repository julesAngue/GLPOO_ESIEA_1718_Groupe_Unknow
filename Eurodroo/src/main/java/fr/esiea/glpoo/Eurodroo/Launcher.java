package fr.esiea.glpoo.Eurodroo;
import org.apache.log4j.Logger;

import fr.esiea.glpoo.Eurodroo.dao.CsvTirageDao;
import fr.esiea.glpoo.Eurodroo.dao.TirageDao;
import fr.esiea.glpoo.Eurodroo.domaine.dessinTirage;
import fr.esiea.glpoo.Eurodroo.ihm.TirageJFrame;

public class Launcher 
{
	private final static Logger log = Logger.getLogger(Launcher.class);
    public static void main( String[] args )
    {
      
    	final TirageJFrame fenetre = new TirageJFrame();
		fenetre.setVisible(true);
    	
    }
}