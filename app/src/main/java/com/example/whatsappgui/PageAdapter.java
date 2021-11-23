package com.example.whatsappgui;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    int mNumOfTabs;

    public PageAdapter(@NonNull FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    public PageAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Chats_Fragment tab1 = new Chats_Fragment();
                return tab1;
            case 1:
                Status_Fragment tab2 = new Status_Fragment();
                return tab2;
            case 2:
                Calls_Fragment tab3 = new Calls_Fragment();
                return tab3;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
