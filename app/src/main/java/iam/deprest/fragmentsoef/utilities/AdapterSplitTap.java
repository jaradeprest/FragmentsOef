package iam.deprest.fragmentsoef.utilities;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Switch;

import iam.deprest.fragmentsoef.fragments.DrinksFragment;
import iam.deprest.fragmentsoef.fragments.SplitFragment;

public class AdapterSplitTap extends FragmentPagerAdapter {

    public AdapterSplitTap(FragmentManager fragmentManager){super(fragmentManager);}

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0 : return SplitFragment.newInstance();
            case 1 : return DrinksFragment.newInstance();
        }
        return null;
    }


    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0 : return "Split the bill";
            case 1 : return "Amount of drinks";
        }
        return "Nope";
    }
}
