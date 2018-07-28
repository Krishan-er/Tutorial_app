package com.example.krishan.tutorialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;

public class Vws extends AppCompatActivity {

    String arr[]={"ImageView", "CheckBox","TextView", "EditText","RadioButton"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vws);
        ListView list=findViewById(R.id.view_list);
        ArrayAdapter<String> index=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arr);
        list.setAdapter(index);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent=new Intent(Vws.this,Buttn.class);
                    startActivity(intent);
                }
                else if(position==1){
                    Intent intent=new Intent(Vws.this,Ckbox.class);
                    startActivity(intent);
                }
                else if(position==2){
                    Intent intent=new Intent(Vws.this,Txtview.class);
                    startActivity(intent);
                }
                else if(position==3){
                    Intent intent=new Intent(Vws.this,Edittxt.class);
                    startActivity(intent);
                }
                else if(position==4){
                    Intent intent=new Intent(Vws.this,Radiobttn.class);
                    startActivity(intent);
                }

            }
        });
    }
}
