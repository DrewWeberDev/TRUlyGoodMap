package ca.tru.trulygoodmap;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class selectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        Button omButton = (Button)findViewById(R.id.oldMainButton);
        Button CACButton = (Button)findViewById(R.id.CACButton);
        Button IBButton = (Button)findViewById(R.id.IBButton);
        Button HOLButton = (Button)findViewById(R.id.HOLButton);
        Button CTButton = (Button)findViewById(R.id.CTButton);
        Button SButton = (Button)findViewById(R.id.SciButton);

        CACButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog alertDialog = new AlertDialog.Builder(selectionActivity.this).create();
                alertDialog.setTitle("Alert");
                alertDialog.setMessage("This location is currently unavailable.");
                //alertDialog.setIcon(R.drawable.icon);
                alertDialog.show();

            }
        });

        IBButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog alertDialog = new AlertDialog.Builder(selectionActivity.this).create();
                alertDialog.setTitle("Alert");
                alertDialog.setMessage("This location is currently unavailable.");
                //alertDialog.setIcon(R.drawable.icon);
                alertDialog.show();

            }
        });

        HOLButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog alertDialog = new AlertDialog.Builder(selectionActivity.this).create();
                alertDialog.setTitle("Alert");
                alertDialog.setMessage("This location is currently unavailable.");
                //alertDialog.setIcon(R.drawable.icon);
                alertDialog.show();

            }
        });

        CTButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog alertDialog = new AlertDialog.Builder(selectionActivity.this).create();
                alertDialog.setTitle("Alert");
                alertDialog.setMessage("This location is currently unavailable.");
                //alertDialog.setIcon(R.drawable.icon);
                alertDialog.show();

            }
        });

        SButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog alertDialog = new AlertDialog.Builder(selectionActivity.this).create();
                alertDialog.setTitle("Alert");
                alertDialog.setMessage("This location is currently unavailable.");
                //alertDialog.setIcon(R.drawable.icon);
                alertDialog.show();

            }
        });


        omButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(selectionActivity.this, OldMainMap.class));
            }
        });

    }

}
