package com.example.krishan.tutorialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Vgroups extends AppCompatActivity {

    String arr[]={"Constraint Layout","Relative Layout","Frame Layout","Linear Layout"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vgroups);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
        ListView l_bttn=findViewById(R.id.layout_bttn);
        l_bttn.setAdapter(adapter);
        l_bttn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent =new Intent(Vgroups.this,Constraint_layout.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent =new Intent(Vgroups.this,Relative_layout.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent =new Intent(Vgroups.this,Frame_layout.class);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent =new Intent(Vgroups.this,Linear_layout.class);
                    startActivity(intent);
                }
            }
        });


    }
}
