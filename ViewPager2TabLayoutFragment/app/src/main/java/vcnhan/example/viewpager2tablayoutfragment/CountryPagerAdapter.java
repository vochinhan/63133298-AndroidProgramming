package vcnhan.example.viewpager2tablayoutfragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class CountryPagerAdapter extends FragmentStateAdapter {

    ArrayList<Country> data;
    public CountryPagerAdapter(@NonNull FragmentActivity fragmentActivity, ArrayList<Country> _data) {
        super(fragmentActivity);
        data = _data;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Country country = data.get(position);
        return new CountryFragment(country);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
