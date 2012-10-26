package enstabretagne.optimousse.pathplanner.views.components.popups;

import enstabretagne.optimousse.pathplanner.views.components.popups.SemiPlanePopUp;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;

class PopListener extends MouseAdapter {

    private JPopupMenu m;

    public PopListener(JPopupMenu m) {
        this.m = m;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        maybeShowPopup(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        maybeShowPopup(e);
    }

    private void maybeShowPopup(MouseEvent e) {
        if (e.isPopupTrigger()) {

            // TODO: check if not over an other WP
            m.show(e.getComponent(),
                    e.getX(), e.getY());
        }
    }
}