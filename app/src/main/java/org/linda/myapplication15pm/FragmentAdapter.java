package org.linda.myapplication15pm;

//데이터 양에 따라 아래 두개 중에 쓰면 됩니다.
// FragmentPagerAdapter => 모든 프레그먼트를 메모리에 미리 로딩 시켜줌. 소멸 안시킴.
// FragmentStatePagerAdepter => default 3, 자기를 포함한 양옆만 메모리에 로딩.

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

// FragmentPagerAdapter
// Fr
public class FragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList = new ArrayList<>();

    public FragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    //FragmentList에 아이템 추가하는 함수 필요
    public void addFragment(Fragment fragment){
        fragmentList.add(fragment);
    }

    //new 할때 콜백 됨.
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
