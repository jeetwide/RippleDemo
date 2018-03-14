package com.example.jeetendraachtani.rippledemo.Ripple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.jeetendraachtani.rippledemo.R;

public class ActRippleMaterial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_ripple_material);



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_button, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.switch_list) {
            startActivity(new Intent(this, DemoListActivity.class));
            finish();
            return true;
        } else if (id == R.id.switch_recycler) {
            startActivity(new Intent(this, DemoRecyclerActivity.class));
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
