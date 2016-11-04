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
    
    private StockQuoteList theList;
    private UserInput input;
    
    public StockQuoteController() {
        theList = new StockQuoteList();
        input = new UserInput();
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
        StockQuoteModel retVal = null;
        retVal = theList.getQuoteModel(input.getComSymbol());        
        return retVal;
    }
    
    
    
    
    
}
