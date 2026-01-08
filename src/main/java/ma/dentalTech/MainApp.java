package ma.dentalTech;


import ma.dentalTech.conf.ApplicationContext;
import ma.dentalTech.mvc.controllers.modules.patient.api.PatientController;
<<<<<<< HEAD
import ma.dentalTech.mvc.ui.modules.RDVPatient.RDVView;

import javax.swing.*;
=======
>>>>>>> 37fab912b4240d8bf2646010128878e13d435ebe

public class MainApp
{
    public static void main( String[] args )
    {
        var cont = ApplicationContext.getBean(PatientController.class);
        cont .showRecentPatients();
<<<<<<< HEAD

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("DentalTech - Gestion Cabinet");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            // Ajout de la vue RDV
            RDVView rdvView = new RDVView();
            frame.add(rdvView);

            frame.setVisible(true);
        });
=======
>>>>>>> 37fab912b4240d8bf2646010128878e13d435ebe
    }
}
