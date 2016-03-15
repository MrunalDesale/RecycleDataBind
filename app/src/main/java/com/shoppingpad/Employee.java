package com.shoppingpad;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.shoppingpad.BR;

/**
 * Created by bridgelabz3 on 12/3/16.
 */
public class Employee extends BaseObservable{

    public int empId;
    public String empName;
    public String empCompany;
    public String empEmail;

    Employee(String empName,String empCompany,String empEmail)
    {
        this.empName=empName;
        this.empCompany=empCompany;
        this.empEmail=empEmail;
    }

    @Bindable
    public String getEmpName()
    {
        return this.empName;
    }
    @Bindable
    public String getEmpCompany()
    {
        return this.empCompany;
    }
    @Bindable
    public String getEmpEmail()
    {
        return this.empEmail;
    }

    public void setEmpName(String empName)
    {
        this.empName=empName;
        notifyPropertyChanged(BR.empName);
    }
    public void setEmpCompany(String empCompany)
    {
        this.empCompany=empCompany;
    }
    public void setEmpEmail(String empEmail)
    {
        this.empEmail=empEmail;
    }
}
