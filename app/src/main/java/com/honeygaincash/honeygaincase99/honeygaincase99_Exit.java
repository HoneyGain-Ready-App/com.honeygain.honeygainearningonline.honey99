package com.honeygaincash.honeygaincase99;



import static com.honeygaincash.honeygaincase99.honeygaincase99_SplashActivity.dialogbox1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class honeygaincase99_Exit extends AppCompatActivity {
    private Button exitapp, btn_no;
    public String TAG = String.valueOf(getClass());

    public void onBackPressed() {
        super.onBackPressed();

    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.honeygaincase99_exitactivity);

        dialogbox1(this);

        if (savedInstanceState == null) {

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragmentContainer1, new honeygaincase99_WebViewFragment1());
            fragmentTransaction.commit();
        }

        if (savedInstanceState == null) {

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragmentContainer2, new honeygaincase99_WebViewFragment1());
            fragmentTransaction.commit();
        }

        if (savedInstanceState == null) {

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragmentContainer3, new honeygaincase99_WebViewFragment1());
            fragmentTransaction.commit();
        }

        if (savedInstanceState == null) {

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragmentContainer4, new honeygaincase99_WebViewFragment1());
            fragmentTransaction.commit();
        }

        if (savedInstanceState == null) {

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragmentContainer5, new honeygaincase99_WebViewFragment1());
            fragmentTransaction.commit();
        }


        Button button = (Button) findViewById(R.id.exitapp);
        this.exitapp = button;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                honeygaincase99_Exit.this.startActivity(new Intent(honeygaincase99_Exit.this, honeygaincase99_Thank_you.class));

            }
        });
        Button button1 = (Button) findViewById(R.id.btn_no);
        this.btn_no = button1;
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                honeygaincase99_Exit.this.startActivity(new Intent(honeygaincase99_Exit.this, honeygaincase99_start_page.class));
            }
        });
    }





}
