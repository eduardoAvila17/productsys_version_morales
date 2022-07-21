package programas;

import formularios.acceso;
import formularios.menupri;
import java.util.logging.Level;
import java.util.logging.Logger;


public class inicio 
{ 
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
      
       // acceso.setDefaultLookAndFeelDecorated(true);
//        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.ChallengerDeepSkin");
//           SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceLightAquaTheme");
//           SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");
//           SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.Button.Standard");
//           menu.setDefaultLookAndFeelDecorated(true);
//            SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
       //    SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceAquaTheme");
            
             new acceso().setVisible(true);     
  
    }
    public static String inicio = "si";
}
