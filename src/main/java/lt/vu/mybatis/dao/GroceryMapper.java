package lt.vu.mybatis.dao;

import java.util.List;
import lt.vu.mybatis.model.Grocery;
import org.mybatis.cdi.Mapper;

@Mapper
public interface GroceryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.GROCERIES
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    int deleteByPrimaryKey(Integer groceryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.GROCERIES
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    int insert(Grocery record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.GROCERIES
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    Grocery selectByPrimaryKey(Integer groceryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.GROCERIES
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    List<Grocery> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.GROCERIES
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    int updateByPrimaryKey(Grocery record);
}