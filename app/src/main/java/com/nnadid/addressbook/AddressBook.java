// AddressBook.java
// Main activity for the Address Book app.
package com.nnadid.addressbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class AddressBook extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        new Thread() {
            public void run() {
                try {
                    int timer = 0;
                    while (timer <= 5000) {
                        sleep(100);
                        timer = timer + 100;
                    }
                  startActivity(new Intent(getBaseContext(),splash.class));
                    //setContentView(R.layout.activity_main);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    finish();
                }
            }

        }.start();
    }

} // end class AddressBook
