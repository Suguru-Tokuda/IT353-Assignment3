/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
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
public class StockQuoteController implements Serializable {

    private StockQuoteList theList = new StockQuoteList();
    private UserInput input = new UserInput();
    private String outputMsg;
    private boolean gotQuote;

    //Constructor
    public StockQuoteController() {
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

    /**
     * @return the outputMsg
     */
    public String getOutputMsg() {
        return outputMsg;
    }

    /**
     * @param outputMsg the outputMsg to set
     */
    public void setOutputMsg(String outputMsg) {
        this.outputMsg = outputMsg;
    }

    /**
     * @return the gotQuote
     */
    public boolean isGotQuote() {
        return gotQuote;
    }

    /**
     * @param gotQuote the gotQuote to set
     */
    public void setGotQuote(boolean gotQuote) {
        this.gotQuote = gotQuote;
    }

    public String retrieveQuote() {
        String retVal = null;
        StockQuoteModel model = this.getStockInfo();

        if (model != null) {
            retVal = "quote.xhtml";
        } else {
            retVal = "index.xhtml";
            this.setOutputMsg(this.input.getComSymbol() + " does not exist as the company symbol. Try again.");
        }
        return retVal;
    }

    public StockQuoteModel getStockInfo() {
        StockQuoteModel retVal;
        retVal = getTheList().getQuoteModel(getInput().getComSymbol());
        return retVal;
    }
    
    public String goToIndex() {
        return "index.xhtml";
    }
}