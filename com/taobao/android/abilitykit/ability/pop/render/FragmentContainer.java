package com.taobao.android.abilitykit.ability.pop.render;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes4.dex */
public class FragmentContainer extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Fragment childFragment;
    private View.OnClickListener listener;
    private String title;

    static {
        kge.a(1537441803);
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(R.layout.std_pop_fragment_container, viewGroup, false);
        if (this.title != null) {
            ((ViewGroup) inflate.findViewById(R.id.std_pop_title_bar)).setVisibility(0);
            ((TextView) inflate.findViewById(R.id.std_pop_title)).setText(this.title);
            inflate.findViewById(R.id.std_pop_title_bar_close).setOnClickListener(this.listener);
        }
        if (bundle == null && this.childFragment != null) {
            getChildFragmentManager().beginTransaction().replace(R.id.std_pop_fragment_container, this.childFragment).commit();
        }
        return inflate;
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }

    public void setChildFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aebefd01", new Object[]{this, fragment});
        } else {
            this.childFragment = fragment;
        }
    }

    public void setDismissClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d47c5e", new Object[]{this, onClickListener});
        } else {
            this.listener = onClickListener;
        }
    }
}
