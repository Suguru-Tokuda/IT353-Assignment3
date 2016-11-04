/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.StockQuoteModel;

/**
 *
 * @author Suguru
 */

@ManagedBean
@SessionScoped
public class StockQuoteController {
    
    private StockQuoteModel theModel;
    
    public StockQuoteController() {
        theModel = new StockQuoteModel();
    }
    
    public StockQuoteModel getStockQuoteModel() {
        return theModel;
    }
    
    public StockQuoteModel getStockPrice() {
        StockQuoteModel retVal = null;
        
        
        
        return retVal;
    }
    
    
    
    
    
}
