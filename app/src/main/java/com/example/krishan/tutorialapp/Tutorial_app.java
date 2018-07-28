package com.example.krishan.tutorialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Tutorial_app extends AppCompatActivity {

    ImageButton intro,layouts,ui_widgets,activities,project_struct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial__app);

        intro=findViewById(R.id.intro);
        layouts=findViewById(R.id.layouts);
        activities=findViewById(R.id.activities);
        ui_widgets=findViewById(R.id.ui_widgets);
        project_struct=findViewById(R.id.project_struct);

        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Tutorial_app.this,Intro_index.class);
                startActivity(intent);
            }
        });

        ui_widgets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Tutorial_app.this,Vws.class);
                startActivity(intent);
            }
        });


        layouts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Tutorial_app.this,Vgroups.class);
                startActivity(intent);
            }
        });

        activities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Tutorial_app.this,Android_activities.class);
                startActivity(intent);
            }
        });

        project_struct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Tutorial_app.this,Project_structure.class);
                startActivity(intent);
            }
        });

    }
}
