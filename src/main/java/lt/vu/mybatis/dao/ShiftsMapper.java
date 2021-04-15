package lt.vu.mybatis.dao;

import java.util.List;
import lt.vu.mybatis.model.Shifts;

public interface ShiftsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHIFTS
     *
     * @mbg.generated Thu Apr 15 14:10:16 EEST 2021
     */
    int deleteByPrimaryKey(Integer shiftId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHIFTS
     *
     * @mbg.generated Thu Apr 15 14:10:16 EEST 2021
     */
    int insert(Shifts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHIFTS
     *
     * @mbg.generated Thu Apr 15 14:10:16 EEST 2021
     */
    Shifts selectByPrimaryKey(Integer shiftId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHIFTS
     *
     * @mbg.generated Thu Apr 15 14:10:16 EEST 2021
     */
    List<Shifts> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHIFTS
     *
     * @mbg.generated Thu Apr 15 14:10:16 EEST 2021
     */
    int updateByPrimaryKey(Shifts record);
}