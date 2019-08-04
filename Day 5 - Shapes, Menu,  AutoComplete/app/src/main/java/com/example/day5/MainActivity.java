package com.example.menuplus;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnPopUp = findViewById(R.id.btnPopUp);
        btnPopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopUpMenu(view);
            }
        });
    }

    private void showPopUpMenu(View view) {
       /* PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.game_menu, popup.getMenu());
        popup.show();*/

        PopupMenu popup = new PopupMenu(this, view);

        // This activity implements OnMenuItemClickListener
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.game_menu);
        popup.show();

    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.new_game:
                //toast
                Toast.makeText(this, "First menu", Toast.LENGTH_SHORT).show();
            case R.id.help:
                //toast
                return true;
            default:
                return false;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.game_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
      switch (item.getItemId()) {
            case R.id.new_game:
                //toast
                Toast.makeText(this, "First menu", Toast.LENGTH_SHORT).show();
            case R.id.help:
                //toast
                return true;
            default:
                return super.onOptionsItemSelected(item); //returns false
        }
    }
        return super.onOptionsItemSelected(item);
    }


}
