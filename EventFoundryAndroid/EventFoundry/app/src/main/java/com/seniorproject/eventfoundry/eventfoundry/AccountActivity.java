package com.seniorproject.eventfoundry.eventfoundry;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class AccountActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ViewSetting();
        SettingScreenLink();
    }

    void ViewSetting()
    {
        //set view to activity_setting.xml
        setContentView(R.layout.activity_setting);
    }

    void SettingScreenLink()
    {
        TextView settingScreen = (TextView) findViewById(R.id.action_settings);
        // Listening to setting Screen link
        settingScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // Closing setting screen
                // Switching to Screen/closing setting screen
                finish();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_setting, menu);
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
}
