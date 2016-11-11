/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Suguru
 */
public class StockQuoteList {

    private HashMap<String, StockQuoteModel> stockList = new HashMap<>();

    public StockQuoteList() {

        StockQuoteModel model1, model2, model3, model4, model5;
        model1 = new StockQuoteModel("MMM", 166.48, -0.35, -0.21, 1927527, 10.52);
        model2 = new StockQuoteModel("AXP", 65.51, 0.18, 0.28, 3429894, 5.81);
        model3 = new StockQuoteModel("AAPL", 108.84, -.99, 0.9, 3806950, 3.4);
        model4 = new StockQuoteModel("BA", 139.54, -0.48, -0.34, 2949327, -3.49);
        model5 = new StockQuoteModel("CAT", 82.31, 1.04, 1.28, 5745732, 21.12);

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

        Set<String> setOfKeys = stockList.keySet();
        Iterator<String> iterator = setOfKeys.iterator();

        while (iterator.hasNext()) {

            String key = iterator.next();
            if (stockList.get(key).getComSymbole().equals(symbol)) {
                retVal = stockList.get(key);
            }
        }
        return retVal;
    }

}