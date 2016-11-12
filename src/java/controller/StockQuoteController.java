/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.StockQuoteDAO;
import java.io.Serializable;
import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
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
    private StockQuoteDAO stockQuoteDAO = new StockQuoteDAO();
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

    //By using hashmap
    public String retrieveQuote() {
        String retVal = null;
        StockQuoteModel model = this.getStockInfo();

        if (model != null) {
            //This code will redirect to another page with the right URL -- quote.xhtml in this case.
            FacesContext fc = FacesContext.getCurrentInstance();
            ConfigurableNavigationHandler nav = (ConfigurableNavigationHandler) fc.getApplication().getNavigationHandler();
            nav.performNavigation("quote?faces-redirect=true");
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
        //This code will redirect to another page with the right URL -- index.xhtml in this case.
        FacesContext fc = FacesContext.getCurrentInstance();
        ConfigurableNavigationHandler nav = (ConfigurableNavigationHandler) fc.getApplication().getNavigationHandler();
        nav.performNavigation("index?faces-redirect=true");
        return "index.xhtml";
    }
    // End of hashmap

    // Methods using database
    public StockQuoteModel retreiveQuoteWithDAO() {
        StockQuoteModel retVal = null;
        retVal = stockQuoteDAO.getQuote(input);
        return retVal;
    }

    public String retrieveQuoteWithDAO() {
        String retVal = null;
        StockQuoteModel model = this.retreiveQuoteWithDAO();

        if (model != null) {
            //This code will redirect to another page with the right URL -- quote.xhtml in this case.
            FacesContext fc = FacesContext.getCurrentInstance();
            ConfigurableNavigationHandler nav = (ConfigurableNavigationHandler) fc.getApplication().getNavigationHandler();
            nav.performNavigation("quote?faces-redirect=true");
            retVal = "quote.xhtml";
        } else {
            retVal = "index.xhtml";
            this.setOutputMsg(this.input.getComSymbol() + " does not exist as the company symbol. Try again.");
        }
        return retVal;
    }

    // End of using database
}
