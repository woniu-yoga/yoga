package com.yoga.entity;

public class MyFocusKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_focus.focus_uid
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    private Integer focusUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_focus.focused_uid
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    private Integer focusedUid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_focus.focus_uid
     *
     * @return the value of my_focus.focus_uid
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    public Integer getFocusUid() {
        return focusUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_focus.focus_uid
     *
     * @param focusUid the value for my_focus.focus_uid
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    public void setFocusUid(Integer focusUid) {
        this.focusUid = focusUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_focus.focused_uid
     *
     * @return the value of my_focus.focused_uid
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    public Integer getFocusedUid() {
        return focusedUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_focus.focused_uid
     *
     * @param focusedUid the value for my_focus.focused_uid
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    public void setFocusedUid(Integer focusedUid) {
        this.focusedUid = focusedUid;
    }
}