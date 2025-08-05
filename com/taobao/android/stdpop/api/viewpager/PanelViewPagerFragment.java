package com.taobao.android.stdpop.api.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.megadesign.viewpager.CustomTabLayout;
import com.taobao.tao.util.StringUtil;
import com.taobao.taobao.R;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes6.dex */
public final class PanelViewPagerFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout mCloseButton;
    private List<a> mDataSource;
    private int mInitialIndex;
    private View.OnClickListener mOnCloseClickListener;
    private CustomTabLayout.a mOnTabSelectedListener;
    private CustomTabLayout mTabLayout;
    private ViewPager mViewPager;
    private com.taobao.android.megadesign.viewpager.a mViewPagerAdapter;

    static {
        kge.a(1776654526);
    }

    public static /* synthetic */ Object ipc$super(PanelViewPagerFragment panelViewPagerFragment, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, inflater, viewGroup, bundle});
        }
        q.d(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.std_panel_viewpager_layout, viewGroup, false);
        this.mViewPager = (ViewPager) inflate.findViewById(R.id.std_panel_viewpager);
        this.mTabLayout = (CustomTabLayout) inflate.findViewById(R.id.std_panel_tab_layout);
        this.mCloseButton = (FrameLayout) inflate.findViewById(R.id.std_close_button_container);
        FrameLayout frameLayout = this.mCloseButton;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(this.mOnCloseClickListener);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        q.b(childFragmentManager, "childFragmentManager");
        this.mViewPagerAdapter = new com.taobao.android.megadesign.viewpager.a(childFragmentManager);
        setupViewPager();
        return inflate;
    }

    private final void setupViewPager() {
        CustomTabLayout customTabLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a409228", new Object[]{this});
            return;
        }
        List<a> list = this.mDataSource;
        if (list != null) {
            for (a aVar : list) {
                if (aVar.b() != null || !StringUtil.isEmpty(aVar.c())) {
                    if (aVar.b() == null) {
                        com.taobao.android.megadesign.viewpager.a aVar2 = this.mViewPagerAdapter;
                        if (aVar2 != null) {
                            aVar2.a(PanelBuildFragment.Companion.a(aVar), aVar.a());
                        }
                    } else {
                        com.taobao.android.megadesign.viewpager.a aVar3 = this.mViewPagerAdapter;
                        if (aVar3 != null) {
                            aVar3.a(aVar.b(), aVar.a());
                        }
                    }
                    CustomTabLayout customTabLayout2 = this.mTabLayout;
                    if (customTabLayout2 != null) {
                        customTabLayout2.addTab(aVar.a());
                    }
                }
            }
        }
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            viewPager.setAdapter(this.mViewPagerAdapter);
        }
        CustomTabLayout.a aVar4 = this.mOnTabSelectedListener;
        if (aVar4 != null && (customTabLayout = this.mTabLayout) != null) {
            customTabLayout.setOnTabClickListener(aVar4);
        }
        CustomTabLayout customTabLayout3 = this.mTabLayout;
        if (customTabLayout3 != null) {
            customTabLayout3.setInitTabIndex(this.mInitialIndex);
        }
        CustomTabLayout customTabLayout4 = this.mTabLayout;
        if (customTabLayout4 == null) {
            return;
        }
        customTabLayout4.setupWithViewPager(this.mViewPager);
    }

    public final void setOnTabSelectedListener(CustomTabLayout.a listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c0c09", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        this.mOnTabSelectedListener = listener;
    }

    public final void setDataSource(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88534c5f", new Object[]{this, list});
        } else {
            this.mDataSource = list;
        }
    }

    public final void setInitialTabIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6ba1dd", new Object[]{this, new Integer(i)});
        } else {
            this.mInitialIndex = i;
        }
    }

    public final void setOnCloseClickListener(View.OnClickListener listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1203ad", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        this.mOnCloseClickListener = listener;
    }
}
