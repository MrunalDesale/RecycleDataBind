package com.shoppingpad;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shoppingpad.BR;
import com.shoppingpad.databinding.CustomRowBinding;

import java.util.List;

/**
 * Created by bridgelabz3 on 12/3/16.
 */
public class EmployeeRecyclerAdapter extends RecyclerView.Adapter<EmployeeRecyclerAdapter.EmpViewHolder> {
    private List<Employee> mEmployee;

    public class EmpViewHolder extends RecyclerView.ViewHolder{

        CustomRowBinding mBinding;


        private EmpViewHolder(View rowView)
        {
            super(rowView);
            mBinding= DataBindingUtil.bind(rowView);
        }

        public CustomRowBinding getBinding()
        {
            return mBinding;
        }

        public void bindEmp(Employee employee)
        {
            mBinding.setEmployee(employee);
            mBinding.executePendingBindings();
        }

    }
    public EmployeeRecyclerAdapter(List<Employee> recyclerEmp)
    {
        this.mEmployee=recyclerEmp;
    }

    @Override
    public EmpViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_row,parent,false);
        EmpViewHolder holder=new EmpViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(EmpViewHolder holder, int position) {
        final Employee employee=mEmployee.get(position);
        holder.getBinding().setVariable(BR.employee,employee);
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mEmployee.size();
    }
}
