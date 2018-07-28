package com.example.krishan.tutorialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Android_activities extends AppCompatActivity {

    String arr[]={"Activity Life Cycle","Intent","Toast"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_activities);
        ListView list=findViewById(R.id.activities_list);
        ArrayAdapter<String> index=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arr);
        list.setAdapter(index);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent=new Intent(Android_activities.this,Lifecycle_file.class);
                    startActivity(intent);
                }
                else if(position==1){
                    Intent intent=new Intent(Android_activities.this,Intent_file.class);
                    startActivity(intent);
                }
                else if(position==2){
                    Intent intent=new Intent(Android_activities.this,Toast_file.class);
                    startActivity(intent);
                }
            }
        });
    }
}
