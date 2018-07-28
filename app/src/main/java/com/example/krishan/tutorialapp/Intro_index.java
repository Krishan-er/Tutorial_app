package com.example.krishan.tutorialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Intro_index extends AppCompatActivity {

    String arr[]={"Introduction","History And Versions","Enviornmental Setup"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_index);
        ListView list=findViewById(R.id.intro_list);
        ArrayAdapter<String> index=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arr);
        list.setAdapter(index);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent=new Intent(Intro_index.this,Intro.class);
                    startActivity(intent);
                }
                else if(position==1){
                    Intent intent=new Intent(Intro_index.this,Android_history.class);
                    startActivity(intent);
                }
                else if(position==2){
                    Intent intent=new Intent(Intro_index.this,Enviornmental_setup.class);
                    startActivity(intent);
                }
            }
        });
    }
}
