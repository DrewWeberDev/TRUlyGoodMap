package ca.tru.trulygoodmap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class campus_activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus_activity);


    }

    public void openActivity(){new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent i = new Intent(campus_activity.this, OldMain_Activity.class);
            startActivity(i);
            finish();
        }
    }, 2500);


    }

}
