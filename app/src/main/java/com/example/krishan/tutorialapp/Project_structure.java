package com.example.krishan.tutorialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Project_structure extends AppCompatActivity {

    String arr[]={"Android Project","Project Structure","Android Manifest","Android Java","Android Res",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_structure);
        ListView list=findViewById(R.id.structure_list);
        ArrayAdapter<String> index=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arr);
        list.setAdapter(index);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent=new Intent(Project_structure.this,Project_details.class);
                    startActivity(intent);
                }
                else if(position==1){
                    Intent intent=new Intent(Project_structure.this,Project_files.class);
                    startActivity(intent);
                }
                else if(position==2){
                    Intent intent=new Intent(Project_structure.this,Manifest_file.class);
                    startActivity(intent);
                }
                else if(position==3){
                    Intent intent=new Intent(Project_structure.this,Java_file.class);
                    startActivity(intent);
                }
                else if(position==4){
                    Intent intent=new Intent(Project_structure.this,Resource_file.class);
                    startActivity(intent);
                }
            }
        });
    }
}
