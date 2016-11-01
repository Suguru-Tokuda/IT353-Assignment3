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
public class StockQuoteModel {
    
    private String comSymbole;
    private float price;
    private float changeInPrice;
    private float changeInPercent;
    private float volume;
    private float ytdChange;

    /**
     * @return the comSymbole
     */
    public String getComSymbole() {
        return comSymbole;
    }

    /**
     * @param comSymbole the comSymbole to set
     */
    public void setComSymbole(String comSymbole) {
        this.comSymbole = comSymbole;
    }

    /**
     * @return the price
     */
    public float getPrice() {
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
    public float getChangeInPrice() {
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
    public float getChangeInPercent() {
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
    public float getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(float volume) {
        this.volume = volume;
    }

    /**
     * @return the ytdChange
     */
    public float getYtdChange() {
        return ytdChange;
    }

    /**
     * @param ytdChange the ytdChange to set
     */
    public void setYtdChange(float ytdChange) {
        this.ytdChange = ytdChange;
    }
    
    
    
    
}
