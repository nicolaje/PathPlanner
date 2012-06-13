/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enstabretagne.optimousse.pathplanner.settings;

import enstabretagne.optimousse.pathplanner.settings.AbstractSettings;

/**
 *
 * @author jem
 */
public interface ISettings {
    public AbstractSettings getSettings();
    public boolean areSettingsValid();
}
