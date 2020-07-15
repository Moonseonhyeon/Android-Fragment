package org.linda.myapplication15pm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

// 어딘가에서 new Frag1(); 객체만들어짐 메모리에 뜸.그러면 콜백해서 아래 함수가 때려짐.
public class Frag3 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_3, container, false);
        return v;
    }
}
