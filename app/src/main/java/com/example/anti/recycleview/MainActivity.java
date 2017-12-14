package com.example.anti.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.recycleView)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


       CustomStudentAdapter adapter = new CustomStudentAdapter( this);

       adapter.setItems(generateList());

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }


    ArrayList<Student> generateList (){

        ArrayList<Student> students = new ArrayList<>();
         students.add(new Student("Student prv", false) );
        students.add(new Student("Student vtor", true) );
        students.add(new Student("Student tret", false) );


        for (int i = 0; i <100; i++)
        {

            students.add(new Student("Student " + i, true) );
        }

        return students;

    }
}
