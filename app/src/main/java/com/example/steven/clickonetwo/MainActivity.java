package com.example.steven.clickonetwo;

import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.glucose_button)
    Button glucoseButton;
    @ViewById(R.id.glucose_text)
    TextView glucoseText;
    private int glucoseAmount = 0;

    @ViewById(R.id.insulin_button)
    Button insulinButton;
    @ViewById(R.id.insulin_text)
    TextView insulinText;
    private int insulinAmount = 0;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Click(R.id.glucose_button)
    void glucoseClick() {
        glucoseText.setText("" + glucoseAmount++);
    }

    @Click(R.id.insulin_button)
    void insulinClick() {
        insulinText.setText("" + insulinAmount++);
    }

}
