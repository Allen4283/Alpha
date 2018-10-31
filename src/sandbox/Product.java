package sandbox;

import java.lang.String;
import java.util.Date;

//Abstract class that is implemented by the Item Interface
class Product implements Item, Comparable<Product> {


  private int serialNumber;
  private String manufacturer = MANUFACTURER;
  private Date manufacturedOn;
  private String productName;
  private static int currentProductionNumber = 1; //used to store the next number to be assigned to serial#


  // Time and date variable that will be used for the manufacturing date
  //  using java.util.Date found in Oracles document data base online
  private java.util.Date date = new java.util.Date();

  /**
   * mutator method used to set production number to current production number.
   *
   * @param productionNumber for passed production number.
   */
  @Override
  public void setProductionNumber(int productionNumber) {
    this.serialNumber = productionNumber;
  }

  /**
   * mutator method used to set product name to current device name.
   *
   * @param deviceName for passed device name.
   */
  @Override
  public void setProductName(String deviceName) {
    this.productName = deviceName;
  }

  /**
   * accessor method used to return the product name.
   */
  @Override
  public String getProductName() {
    return this.productName;
  }

  /**
   * accessor method used to return manufacturer.
   */
  @Override
  public String getManufacturer() {
    return this.manufacturer;
  }

  /**
   * accessor method used to return serialNumber.
   */
  @Override
  public Integer getSerialNumber() {
    return this.serialNumber;
  }

  /**
   * constructor used to take in the name of the product and set to the field variable name. Assign
   * a serial number from the currentProductionNumber. Incremented the currentProductionNumber in
   * readiness for the next instance. Set manufacturedOn as the current date and time.
   *
   * @param deviceName for product name.
   */
  public Product(String deviceName) {

    setProductName(deviceName);
    setProductionNumber(currentProductionNumber);
    currentProductionNumber++;
    this.manufacturedOn = this.date;
  }

  /**
   * toString method used to return a print statement with the following: manufacturer serialNumber
   * manufacturedOn productName.
   */
  public String toString() {

    return "Manufacturer : " + getManufacturer() + "\n"
        + "Serial Number : " + getSerialNumber() + "\n"
        + "Date : " + this.manufacturedOn + "\n"
        + "Name : " + getProductName();
  }


  @Override
  public int compareTo(Product o) {
    return productName.compareTo(o.productName);

  }
}
