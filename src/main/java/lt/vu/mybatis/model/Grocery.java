package lt.vu.mybatis.model;

import java.util.Date;

public class Grocery {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.GROCERIES.Grocery_id
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    private Integer groceryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.GROCERIES.Name
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.GROCERIES.BEST BEFORE
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    private Date bestBefore;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.GROCERIES.Grocery_id
     *
     * @return the value of PUBLIC.GROCERIES.Grocery_id
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    public Integer getGroceryId() {
        return groceryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.GROCERIES.Grocery_id
     *
     * @param groceryId the value for PUBLIC.GROCERIES.Grocery_id
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    public void setGroceryId(Integer groceryId) {
        this.groceryId = groceryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.GROCERIES.Name
     *
     * @return the value of PUBLIC.GROCERIES.Name
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.GROCERIES.Name
     *
     * @param name the value for PUBLIC.GROCERIES.Name
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.GROCERIES.BEST BEFORE
     *
     * @return the value of PUBLIC.GROCERIES.BEST BEFORE
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    public Date getBestBefore() {
        return bestBefore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.GROCERIES.BEST BEFORE
     *
     * @param bestBefore the value for PUBLIC.GROCERIES.BEST BEFORE
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    public void setBestBefore(Date bestBefore) {
        this.bestBefore = bestBefore;
    }
}