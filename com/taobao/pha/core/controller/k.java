package com.taobao.pha.core.controller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.phacontainer.AbstractPageFragment;
import com.taobao.pha.core.phacontainer.PageFragment;
import com.taobao.pha.core.phacontainer.PageHeaderFragment;
import com.taobao.pha.core.phacontainer.ViewPagerFragment;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.nfz;
import tb.ngr;

/* loaded from: classes7.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String b;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.pha.core.phacontainer.c f18726a;
    private final PageModel c;
    private final AppController d;
    private boolean e = false;

    static {
        kge.a(2014326252);
        b = k.class.getName();
    }

    public k(AppController appController, PageModel pageModel) {
        this.d = appController;
        this.c = pageModel;
        k();
    }

    private void k() {
        Fragment instantiate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_page_model", this.c);
        bundle.putBoolean("key_build_page_manifest", true);
        bundle.putLong("AppControllerInstanceId", this.d.L());
        try {
            if (this.c.frames != null && this.c.frames.size() > 0 && this.d.u() != null) {
                bundle.putFloat("key_swiper_threshold", this.d.u().swiperThreshold);
                instantiate = Fragment.instantiate(this.d.C(), ViewPagerFragment.class.getName(), bundle);
            } else {
                instantiate = Fragment.instantiate(this.d.C(), PageFragment.class.getName(), bundle);
            }
            this.f18726a = (com.taobao.pha.core.phacontainer.c) instantiate;
        } catch (Exception e) {
            String str = b;
            ngr.b(str, "instantiate fragment error: " + e.toString());
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.e;
    }

    public void b() {
        FragmentManager fragmentManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.pha.core.phacontainer.c cVar = this.f18726a;
        if (!(cVar instanceof Fragment) || (fragmentManager = ((Fragment) cVar).getFragmentManager()) == null) {
            return;
        }
        fragmentManager.beginTransaction().show((Fragment) this.f18726a).commitNowAllowingStateLoss();
    }

    public com.taobao.pha.core.phacontainer.c c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.pha.core.phacontainer.c) ipChange.ipc$dispatch("4c321cb8", new Object[]{this}) : this.f18726a;
    }

    public nfz d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfz) ipChange.ipc$dispatch("261d23b9", new Object[]{this});
        }
        com.taobao.pha.core.phacontainer.c cVar = this.f18726a;
        if (cVar != null) {
            return cVar.getPageView();
        }
        return null;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.pha.core.phacontainer.c cVar = this.f18726a;
        if (cVar == null) {
            return;
        }
        this.e = true;
        cVar.destroy();
        this.f18726a = null;
    }

    public void f() {
        FragmentManager fragmentManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.taobao.pha.core.phacontainer.c cVar = this.f18726a;
        if (!(cVar instanceof Fragment) || (fragmentManager = ((Fragment) cVar).getFragmentManager()) == null) {
            return;
        }
        boolean equals = "low".equals(this.c.priority);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        if (equals) {
            beginTransaction.remove((Fragment) this.f18726a).commitNowAllowingStateLoss();
            e();
            return;
        }
        beginTransaction.hide((Fragment) this.f18726a).commitNowAllowingStateLoss();
    }

    public boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        PageHeaderFragment l = l();
        if (l == null) {
            return false;
        }
        return l.showHeaderWithAnimation(i, i2);
    }

    public boolean b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f78e0d", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        PageHeaderFragment l = l();
        if (l == null) {
            return false;
        }
        return l.hideHeaderWithAnimation(i, i2);
    }

    public boolean a(int i, int i2, String str, boolean z, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65ec18c5", new Object[]{this, new Integer(i), new Integer(i2), str, new Boolean(z), new Integer(i3)})).booleanValue();
        }
        PageHeaderFragment l = l();
        if (l == null) {
            return false;
        }
        return l.setHeightWithAnimation(i, i2, str, z, Integer.valueOf(i3));
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        com.taobao.pha.core.phacontainer.c cVar = this.f18726a;
        if (!(cVar instanceof com.taobao.pha.core.phacontainer.d)) {
            return false;
        }
        return ((com.taobao.pha.core.phacontainer.d) cVar).startPullRefresh();
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        com.taobao.pha.core.phacontainer.c cVar = this.f18726a;
        if (!(cVar instanceof com.taobao.pha.core.phacontainer.d)) {
            return false;
        }
        return ((com.taobao.pha.core.phacontainer.d) cVar).stopPullRefresh();
    }

    public boolean a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cdec513", new Object[]{this, num})).booleanValue();
        }
        com.taobao.pha.core.phacontainer.c cVar = this.f18726a;
        if (!(cVar instanceof com.taobao.pha.core.phacontainer.d)) {
            return false;
        }
        return ((com.taobao.pha.core.phacontainer.d) cVar).setBackgroundColor(num.intValue());
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        com.taobao.pha.core.phacontainer.c cVar = this.f18726a;
        if (!(cVar instanceof com.taobao.pha.core.phacontainer.d)) {
            return false;
        }
        return ((com.taobao.pha.core.phacontainer.d) cVar).setColorScheme(str);
    }

    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        com.taobao.pha.core.phacontainer.c cVar = this.f18726a;
        if (!(cVar instanceof com.taobao.pha.core.phacontainer.d)) {
            return false;
        }
        return ((com.taobao.pha.core.phacontainer.d) cVar).enablePullRefresh(z);
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        com.taobao.pha.core.phacontainer.c cVar = this.f18726a;
        if (!(cVar instanceof com.taobao.pha.core.phacontainer.d)) {
            return false;
        }
        return ((com.taobao.pha.core.phacontainer.d) cVar).disablePullRefresh();
    }

    public List<nfz> j() {
        FragmentManager childFragmentManager;
        List<Fragment> fragments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87269236", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        com.taobao.pha.core.phacontainer.c cVar = this.f18726a;
        if (cVar instanceof PageFragment) {
            arrayList.add(cVar.getPageView());
            PageHeaderFragment l = l();
            if (l != null) {
                arrayList.add(l.getPageView());
            }
        } else if (cVar instanceof ViewPagerFragment) {
            ViewPagerFragment viewPagerFragment = (ViewPagerFragment) cVar;
            if (!viewPagerFragment.isAdded() || (childFragmentManager = viewPagerFragment.getChildFragmentManager()) == null || (fragments = childFragmentManager.getFragments()) == null) {
                return arrayList;
            }
            for (Fragment fragment : fragments) {
                if (fragment instanceof com.taobao.pha.core.phacontainer.c) {
                    arrayList.add(((com.taobao.pha.core.phacontainer.c) fragment).getPageView());
                }
            }
        }
        return arrayList;
    }

    private PageHeaderFragment l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageHeaderFragment) ipChange.ipc$dispatch("231a51b8", new Object[]{this});
        }
        com.taobao.pha.core.phacontainer.c cVar = this.f18726a;
        if ((!(cVar instanceof ViewPagerFragment) && !(cVar instanceof PageFragment)) || !((AbstractPageFragment) this.f18726a).isAdded()) {
            return null;
        }
        Fragment findFragmentByTag = ((Fragment) this.f18726a).getChildFragmentManager().findFragmentByTag(PageHeaderFragment.TAG_FRAGMENT);
        if (!(findFragmentByTag instanceof PageHeaderFragment)) {
            return null;
        }
        return (PageHeaderFragment) findFragmentByTag;
    }
}
