/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Suguru
 */
public class UserInput {

    private String comSymbol;
    
    //Constructor
    public UserInput() {
    }
    
    public UserInput(String comSymbol) {
        this.comSymbol = comSymbol;
    }

    /**
     * @return the comSymbol
     */
    public String getComSymbol() {
        return comSymbol;
    }

    /**
     * @param comSymbol the comSymbol to set
     */
    public void setComSymbol(String comSymbol) {
        this.comSymbol = comSymbol;
    }

}
