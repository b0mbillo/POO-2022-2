package appmenus;
import javax.swing.JFrame;

public class AppMenus {
    
    public static void main(String[] args) {
        // TODO code application logic here
        frmPrincipal principal = new frmPrincipal();
        principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        principal.setVisible(true);
    }
    
}
