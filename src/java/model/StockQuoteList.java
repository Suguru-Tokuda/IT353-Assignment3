/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Suguru
 */
public class StockQuoteList {
    
    private HashMap<String, StockQuoteModel> stockList = new HashMap<>();
    
    public StockQuoteList() {
        
        StockQuoteModel model1, model2, model3, model4, model5;
        model1 = new StockQuoteModel("MMM", 166.48f, -0.35f, -0.21f, 1927527, 10.52f);
        model2 = new StockQuoteModel("AXP", 65.51f, 0.18f, 0.28f, 3429894, 5.81f);    
        model3 = new StockQuoteModel("AAPL", 108.84f, -.99f, 0.9f, 3806950, 3.4f);
        model4 = new StockQuoteModel("BA", 139.54f, -0.48f, -0.34f, 2949327, -3.49f);
        model5 = new StockQuoteModel("CAT", 82.31f, 1.04f, 1.28f, 5745732, 21.12f);

        stockList.put("MMM", model1);
        stockList.put("AXP", model2);
        stockList.put("AAPL", model3);
        stockList.put("BA", model4);
        stockList.put("CAT", model5);
        
    }

    /**
     * @return the stockList
     */
    public HashMap<String, StockQuoteModel> getStockList() {
        return stockList;
    }
    
    public StockQuoteModel getQuoteModel(String symbol) {
        StockQuoteModel retVal = null;
        Iterator iterator = stockList.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry)iterator.next();
            if (symbol.equals(pair.getKey())) {
                retVal = (StockQuoteModel) pair.getValue();
            }
        }
        return retVal;
    }
    
}
