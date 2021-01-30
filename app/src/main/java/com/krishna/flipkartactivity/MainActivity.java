package com.krishna.flipkartactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    AdapterProduct adapterProduct;
    ListView listView;
    String[] name ={"Mi Note 9 (Gold 4GB)","Mi Note 9 Pro (Black 8GB)","Mi Note 8 Pro (Gold 6GB)","Mi Note 7 Pro (White 6GB)","Mi Note 5 Pro (Gold 6GB)","Mi Note 7 Pro (Gold 8GB)",
            "Mi Note 4 (Gold 4GB)","Mi Note 4 Pro (Black 4GB)","Mi Note 9 (Gold 6GB)","Mi Note 9 Pro (White 4GB)","Mi Note 6 Pro (Gold 6GB)","Mi Note 10 (Gold 8GB)"};

    int[] images = {R.drawable.m1,R.drawable.m2,R.drawable.m3,R.drawable.m4,R.drawable.m5,R.drawable.m6,R.drawable.m7,R.drawable.m8,R.drawable.m9,R.drawable.m10,R.drawable.m11,R.drawable.m12,};

    String[] rCount = {"(92,100)","(23,400)","(42,100)","11,300","(92,100)","(23,400)","(42,100)","11,300","(92,100)","(23,400)","(42,100)","11,300"};

    String[] price = {"9,999","19,999","24,999","34,999","9,999","19,999","24,999","34,999","9,999","19,999","24,999","34,999"};

    String[] offer = {"5% off","10% off","25% off","15% off","5% off","10% off","25% off","15% off","5% off","10% off","25% off","15% off"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        adapterProduct = new AdapterProduct(this,name,images,rCount,price,offer);
        listView.setAdapter(adapterProduct);


    }
}