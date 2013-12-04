package com.adffacescookbook.chapter4.model.entity;

import java.awt.Color;

import java.math.BigDecimal;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.ClobDomain;
import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Nov 23 19:38:54 GMT 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmployeeImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        EmployeeId,
        FirstName,
        LastName,
        Email,
        PhoneNumber,
        HireDate,
        Job,
        Salary,
        CommissionPct,
        ManagerId,
        DepartmentId,
        Image,
        Color,
        FavColor,
        Biography,
        CodeSample,
        Department,
        Employee,
        ManagerIdEmployee,
        Department1;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int PHONENUMBER = AttributesEnum.PhoneNumber.index();
    public static final int HIREDATE = AttributesEnum.HireDate.index();
    public static final int JOB = AttributesEnum.Job.index();
    public static final int SALARY = AttributesEnum.Salary.index();
    public static final int COMMISSIONPCT = AttributesEnum.CommissionPct.index();
    public static final int MANAGERID = AttributesEnum.ManagerId.index();
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int IMAGE = AttributesEnum.Image.index();
    public static final int COLOR = AttributesEnum.Color.index();
    public static final int FAVCOLOR = AttributesEnum.FavColor.index();
    public static final int BIOGRAPHY = AttributesEnum.Biography.index();
    public static final int CODESAMPLE = AttributesEnum.CodeSample.index();
    public static final int DEPARTMENT = AttributesEnum.Department.index();
    public static final int EMPLOYEE = AttributesEnum.Employee.index();
    public static final int MANAGERIDEMPLOYEE = AttributesEnum.ManagerIdEmployee.index();
    public static final int DEPARTMENT1 = AttributesEnum.Department1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public EmployeeImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.adffacescookbook.chapter4.model.entity.Employee");
    }

    /**
     * Gets the attribute value for EmployeeId, using the alias name EmployeeId.
     * @return the value of EmployeeId
     */
    public Integer getEmployeeId() {
        return (Integer) getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmployeeId.
     * @param value value to set the EmployeeId
     */
    public void setEmployeeId(Integer value) {
        setAttributeInternal(EMPLOYEEID, value);
    }

    /**
     * Gets the attribute value for FirstName, using the alias name FirstName.
     * @return the value of FirstName
     */
    public String getFirstName() {
        return (String) getAttributeInternal(FIRSTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FirstName.
     * @param value value to set the FirstName
     */
    public void setFirstName(String value) {
        setAttributeInternal(FIRSTNAME, value);
    }

    /**
     * Gets the attribute value for LastName, using the alias name LastName.
     * @return the value of LastName
     */
    public String getLastName() {
        return (String) getAttributeInternal(LASTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastName.
     * @param value value to set the LastName
     */
    public void setLastName(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**
     * Gets the attribute value for Email, using the alias name Email.
     * @return the value of Email
     */
    public String getEmail() {
        return (String) getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Email.
     * @param value value to set the Email
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for PhoneNumber, using the alias name PhoneNumber.
     * @return the value of PhoneNumber
     */
    public String getPhoneNumber() {
        return (String) getAttributeInternal(PHONENUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for PhoneNumber.
     * @param value value to set the PhoneNumber
     */
    public void setPhoneNumber(String value) {
        setAttributeInternal(PHONENUMBER, value);
    }

    /**
     * Gets the attribute value for HireDate, using the alias name HireDate.
     * @return the value of HireDate
     */
    public Date getHireDate() {
        return (Date) getAttributeInternal(HIREDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for HireDate.
     * @param value value to set the HireDate
     */
    public void setHireDate(Date value) {
        setAttributeInternal(HIREDATE, value);
    }

    /**
     * Gets the attribute value for Job, using the alias name Job.
     * @return the value of Job
     */
    public String getJob() {
        return (String) getAttributeInternal(JOB);
    }

    /**
     * Sets <code>value</code> as the attribute value for Job.
     * @param value value to set the Job
     */
    public void setJob(String value) {
        setAttributeInternal(JOB, value);
    }

    /**
     * Gets the attribute value for Salary, using the alias name Salary.
     * @return the value of Salary
     */
    public BigDecimal getSalary() {
        return (BigDecimal) getAttributeInternal(SALARY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Salary.
     * @param value value to set the Salary
     */
    public void setSalary(BigDecimal value) {
        setAttributeInternal(SALARY, value);
    }

    /**
     * Gets the attribute value for CommissionPct, using the alias name CommissionPct.
     * @return the value of CommissionPct
     */
    public BigDecimal getCommissionPct() {
        return (BigDecimal) getAttributeInternal(COMMISSIONPCT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CommissionPct.
     * @param value value to set the CommissionPct
     */
    public void setCommissionPct(BigDecimal value) {
        setAttributeInternal(COMMISSIONPCT, value);
    }

    /**
     * Gets the attribute value for ManagerId, using the alias name ManagerId.
     * @return the value of ManagerId
     */
    public Integer getManagerId() {
        return (Integer) getAttributeInternal(MANAGERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ManagerId.
     * @param value value to set the ManagerId
     */
    public void setManagerId(Integer value) {
        setAttributeInternal(MANAGERID, value);
    }

    /**
     * Gets the attribute value for DepartmentId, using the alias name DepartmentId.
     * @return the value of DepartmentId
     */
    public Integer getDepartmentId() {
        return (Integer) getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartmentId.
     * @param value value to set the DepartmentId
     */
    public void setDepartmentId(Integer value) {
        setAttributeInternal(DEPARTMENTID, value);
    }

    /**
     * Gets the attribute value for Image, using the alias name Image.
     * @return the value of Image
     */
    public String getImage() {
        return (String) getAttributeInternal(IMAGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Image.
     * @param value value to set the Image
     */
    public void setImage(String value) {
        setAttributeInternal(IMAGE, value);
    }

    /**
     * Gets the attribute value for Color, using the alias name Color.
     * @return the value of Color
     */
    public String getColor() {
        return (String) getAttributeInternal(COLOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Color.
     * @param value value to set the Color
     */
    public void setColor(String value) {
        setAttributeInternal(COLOR, value);
    }

    /**
     * Gets the attribute value for FavColor, using the alias name FavColor.
     * @return the value of FavColor
     */
    public Color getFavColor() {
        if(getColor()!=null){
            return new Color(
                        Integer.valueOf( getColor().substring( 1, 3 ), 16 ),
                        Integer.valueOf( getColor().substring( 3, 5 ), 16 ),
                        Integer.valueOf( getColor().substring( 5, 7 ), 16 ) );
        }
        return null;
    }

    /**
     * Sets <code>value</code> as the attribute value for FavColor.
     * @param value value to set the FavColor
     */
    public void setFavColor(Color value) {
        String rgb = Integer.toHexString(value.getRGB());
        setColor("#"+rgb);
        setAttributeInternal(FAVCOLOR, value);
    }

    /**
     * Gets the attribute value for Biography, using the alias name Biography.
     * @return the value of Biography
     */
    public ClobDomain getBiography() {
        return (ClobDomain) getAttributeInternal(BIOGRAPHY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Biography.
     * @param value value to set the Biography
     */
    public void setBiography(ClobDomain value) {
        setAttributeInternal(BIOGRAPHY, value);
    }

    /**
     * Gets the attribute value for CodeSample, using the alias name CodeSample.
     * @return the value of CodeSample
     */
    public ClobDomain getCodeSample() {
        return (ClobDomain) getAttributeInternal(CODESAMPLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CodeSample.
     * @param value value to set the CodeSample
     */
    public void setCodeSample(ClobDomain value) {
        setAttributeInternal(CODESAMPLE, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDepartment() {
        return (RowIterator) getAttributeInternal(DEPARTMENT);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getEmployee() {
        return (RowIterator) getAttributeInternal(EMPLOYEE);
    }

    /**
     * @return the associated entity EmployeeImpl.
     */
    public EmployeeImpl getManagerIdEmployee() {
        return (EmployeeImpl) getAttributeInternal(MANAGERIDEMPLOYEE);
    }

    /**
     * Sets <code>value</code> as the associated entity EmployeeImpl.
     */
    public void setManagerIdEmployee(EmployeeImpl value) {
        setAttributeInternal(MANAGERIDEMPLOYEE, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getDepartment1() {
        return (EntityImpl) getAttributeInternal(DEPARTMENT1);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setDepartment1(EntityImpl value) {
        setAttributeInternal(DEPARTMENT1, value);
    }

    /**
     * @param employeeId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer employeeId) {
        return new Key(new Object[] { employeeId });
    }


}
