/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.StockQuoteModel;
import model.UserInput;

/**
 *
 * @author Suguru
 */
@ManagedBean
@SessionScoped
public class StockQuoteDAO {
    
    public StockQuoteModel getQuote(UserInput input) {
        StockQuoteModel retVal = null;
        
        //Connecting to the database to retrieve data.
        String query = "SELECT * FROM _____ WHERE comSymbol = ?";
        DBHelper.loadDriver("org.apache.derby.jdbc.ClientDriver");
        String myDB = "jdbc:derby://localhost:1527/-------";
        Connection DBConn = DBHelper.connect2DB(myDB, "itkstu", "student");
        
        try {
            PreparedStatement pstmt = DBConn.prepareStatement(query);
            pstmt.setString(1, input.getComSymbol());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                retVal.setComSymbol(rs.getString("comSymbol"));
                retVal.setPrice(rs.getInt("price"));
                retVal.setChangeInPrice(rs.getDouble("changeInPrice"));
                retVal.setChangeInPercent(rs.getDouble("changeInPercent"));
                retVal.setVolume(rs.getInt("volume"));
                retVal.setYtdChange(rs.getDouble("ytdChange"));
            }
            DBConn.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(StockQuoteModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retVal;
    }
}
