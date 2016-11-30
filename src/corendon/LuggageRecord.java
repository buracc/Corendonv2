/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corendon;

/**
 *
 * @author Jeroen de Jong
 */
public class LuggageRecord {
    
    private String lostId;
    private String labelNr;
    private String flightNr;
    private String type;
    private String brandName;
    private String primaryColor;
    private String secondaryColor;
    private String info;
    private String customerId;
    private String status;
    private boolean sticky;
    

    public LuggageRecord(String lostId, String labelNr, String flightNr, 
            String type, String brandName, String primaryColor, String secondaryColor,
            String info, String customerId, String status, boolean sticky) {

        this.labelNr = labelNr;
        this.flightNr = flightNr;
        this.brandName = brandName;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.info = info;
        this.customerId = customerId;
        this.status = status;
        this.sticky = false;
    }

    public boolean isSticky() {
        return sticky;
    }

    public void setIsSticky(boolean isSticky) {
        this.sticky = sticky;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

    public String getLostId() {
        return lostId;
    }

    public void setLostId(String lostId) {
        this.lostId = lostId;
    }

    public String getLabelNr() {
        return labelNr;
    }

    public void setLabelNr(String labelNr) {
        this.labelNr = labelNr;
    }

    public String getFlightNr() {
        return flightNr;
    }

    public void setFlightNr(String flightNr) {
        this.flightNr = flightNr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "LuggageRecord{" + "labelNr=" + labelNr + ", flightNr="
                + flightNr + ", type=" + type + ", brandName=" + brandName
                + ", primaryColor=" + primaryColor + ", secondaryColor="
                + secondaryColor + ", info=" + info + ", customerId="
                + customerId + '}';
    }

}
