/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.StockQuoteList;
import model.StockQuoteModel;
import model.UserInput;

/**
 *
 * @author Suguru
 */
@ManagedBean
@SessionScoped
public class StockQuoteController {

    private StockQuoteList theList = new StockQuoteList();
    private UserInput input = new UserInput();

    //Constructor
    public StockQuoteController() {
        theList = new StockQuoteList();
        input = new UserInput();
    }

    //Getters & Setters
    /**
     * @return the theList
     */
    public StockQuoteList getTheList() {
        return theList;
    }

    /**
     * @param theList the theList to set
     */
    public void setTheList(StockQuoteList theList) {
        this.theList = theList;
    }

    /**
     * @return the input
     */
    public UserInput getInput() {
        return input;
    }

    /**
     * @param input the input to set
     */
    public void setInput(UserInput input) {
        this.input = input;
    }

    public String retrieveQuote() {
        String retVal;
        if (this.getStockInfo() != null) {
            retVal = "quote.xhtml";
        } else {
            retVal = "index.xhtml";
        }
        return retVal;
    }

    public StockQuoteModel getStockInfo() {
        StockQuoteModel retVal;
        retVal = getTheList().getQuoteModel(getInput().getComSymbol());
        return retVal;
    }

}
