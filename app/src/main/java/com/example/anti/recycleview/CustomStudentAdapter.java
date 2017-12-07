package com.example.anti.recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Anti on 12/7/2017.
 */

public class CustomStudentAdapter extends RecyclerView.Adapter<CustomStudentAdapter.ViewHolder> {

    List<Student> studentList = new ArrayList<>();


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        // inflate the custom layout
        View view = inflater.inflate(R.layout.novlayout, parent, false);
        // Return a new holde instance
        ViewHolder viewHolder = new ViewHolder(view);


        return viewHolder;
    }
// Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Student student = studentList.get(position);

        //ViewHolder.textView.setText(student.sName);

        holder.textView.setText(student.getsName());

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.text)
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }




}
