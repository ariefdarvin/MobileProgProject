package com.example.projectmobile.Tab;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterTab extends FragmentStateAdapter {
    public AdapterTab(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new Fragment_Tab_Scan();
        }
        return new Fragment_Tab_ScanAbout();
    }

    @Override
    public int getItemCount() {
        return 2;
    }

}
