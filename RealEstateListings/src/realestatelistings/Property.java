/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realestatelistings;

/**
 *
 * @author Mr Porcupine
 */
public class Property {
   private double askingPrice;
   private String propertyType;
   private double lotSize;
   private int numbBaths;
   private int numbBeds;
   
   public Property (double askingPrice,String propertyType,double lotSize)
   {
      this.askingPrice = askingPrice;
      this.propertyType = propertyType;
      this.lotSize = lotSize;
      numbBaths = 0;
      numbBeds = 0;
   }
   
      public Property (double askingPrice,String propertyType,double lotSize,int numbBaths,int numbBeds)
   {
      this.askingPrice = askingPrice;
      this.propertyType = propertyType;
      this.lotSize = lotSize;
      this.numbBaths = numbBaths;
      this.numbBeds = numbBeds;
   }
   
      public String toString()
      {
          return "Asking price: $" + askingPrice +
           "\nProperty type: " + propertyType +
           "\nLot size: " + lotSize +
           "\nNumber of Bathrooms: " + numbBaths +
           "\nNumber of Bedrooms " + numbBeds;       
      }
      public void setAskingPrice(double newvalue)
      {
          askingPrice = newValue;
      }
}
