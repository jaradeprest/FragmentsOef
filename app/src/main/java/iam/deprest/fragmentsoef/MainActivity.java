package iam.deprest.fragmentsoef;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import iam.deprest.fragmentsoef.utilities.AdapterSplitTap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.main_toolbar);
        TabLayout tabLayout = findViewById(R.id.main_tabs);
        ViewPager viewPager = findViewById(R.id.main_viewpager);

        //setSupportActionBar(toolbar);

        AdapterSplitTap adapterSplitTap = new AdapterSplitTap(getSupportFragmentManager());
        viewPager.setAdapter(adapterSplitTap);
        tabLayout.setupWithViewPager(viewPager);
    }
}
