/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Suguru
 */
public class StockQuoteModel implements Serializable {

    private String comSymbol;
    private double price;
    private double changeInPrice;
    private double changeInPercent;
    private int volume;
    private double ytdChange;

    public StockQuoteModel() {
    }

    public StockQuoteModel(String comSymbol, double price, double changeInPrice, double changeInPercent, int volume, double ytdChange) {
        this.comSymbol = comSymbol;
        this.price = price;
        this.changeInPrice = changeInPrice;
        this.changeInPercent = changeInPercent;
        this.volume = volume;
        this.ytdChange = ytdChange;
    }

    /**
     * @return the comSymbole
     */
    public String getComSymbol() {
        return comSymbol;
    }

    /**
     * @param comSymbol the comSymbole to set
     */
    public void setComSymbol(String comSymbol) {
        this.comSymbol = comSymbol;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the changeInPrice
     */
    public double getChangeInPrice() {
        return changeInPrice;
    }

    /**
     * @param changeInPrice the changeInPrice to set
     */
    public void setChangeInPrice(float changeInPrice) {
        this.changeInPrice = changeInPrice;
    }

    /**
     * @return the changeInPercent
     */
    public double getChangeInPercent() {
        return changeInPercent;
    }

    /**
     * @param changeInPercent the changeInPercent to set
     */
    public void setChangeInPercent(float changeInPercent) {
        this.changeInPercent = changeInPercent;
    }

    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return the ytdChange
     */
    public double getYtdChange() {
        return ytdChange;
    }

    /**
     * @param ytdChange the ytdChange to set
     */
    public void setYtdChange(double ytdChange) {
        this.ytdChange = ytdChange;
    }

}