package com.honeygaincash.honeygaincase99;


import static com.honeygaincash.honeygaincase99.honeygaincase99_SplashActivity.dialogbox1;

import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class honeygaincase99_DetailsActivity extends AppCompatActivity {

    TextView detail_txt;

    public String TAG = String.valueOf(getClass());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.honeygaincase99_details);

        dialogbox1(this);

        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragmentContainer1, new honeygaincase99_WebViewFragment1());
            fragmentTransaction.add(R.id.fragmentContainer2, new honeygaincase99_WebViewFragment1());
            fragmentTransaction.add(R.id.fragmentContainer3, new honeygaincase99_WebViewFragment1());
            fragmentTransaction.add(R.id.fragmentContainer4, new honeygaincase99_WebViewFragment1());
            fragmentTransaction.add(R.id.fragmentContainer5, new honeygaincase99_WebViewFragment1());
            fragmentTransaction.commit();
        }

        detail_txt = findViewById(R.id.detail_txt);
        Bundle gt = getIntent().getExtras();
        String str = gt.getString("abc");
        detail_txt.setText(str);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }




}