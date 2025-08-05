package com.taobao.tao.tbmainfragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import com.taobao.tao.util.TBMainLog;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(212937456);
    }

    public static void a(Fragment fragment, Context context) {
        Fragment currentFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9dd61be", new Object[]{fragment, context});
        } else if (fragment == null || !fragment.isAdded()) {
        } else {
            if (fragment instanceof TBMainFragment) {
                TBFragmentTabHost c = com.taobao.tao.navigation.e.c();
                if (c == null || (currentFragment = c.getCurrentFragment()) == null) {
                    return;
                }
                if (d.j() && TextUtils.equals("mytaobao", currentFragment.getTag()) && currentFragment.isAdded()) {
                    TBMainLog.tlog("FragmentLifeCycleHelper", "doOnPauseAndOnStop, detach current fragment: " + currentFragment.getClass());
                    fragment.getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.h_fragment_detach_enter, R.anim.h_fragment_detach_exit).detach(currentFragment).commitNowAllowingStateLoss();
                    return;
                } else if (!TextUtils.equals(NavigationTabConstraints.TAB_BIZ_HOMEPAGE, currentFragment.getTag())) {
                    return;
                } else {
                    fragment = currentFragment;
                }
            }
            TBMainLog.tlog("FragmentLifeCycleHelper", "into fromF: " + fragment.getClass() + ".onPause(), homeFragment.onStop()");
            c(fragment, context);
            d(fragment, context);
        }
    }

    private static void c(Fragment fragment, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0fc6a40", new Object[]{fragment, context});
        } else {
            fragment.onPause();
        }
    }

    private static void d(Fragment fragment, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d48bee81", new Object[]{fragment, context});
        } else {
            fragment.onStop();
        }
    }

    private static void e(Fragment fragment, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c81b72c2", new Object[]{fragment, context});
        } else {
            fragment.onStart();
        }
    }

    private static void f(Fragment fragment, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbaaf703", new Object[]{fragment, context});
        } else {
            fragment.onResume();
        }
    }

    public static void b(Fragment fragment, Context context) {
        Fragment currentFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6ce5ff", new Object[]{fragment, context});
        } else if (fragment == null || !fragment.isAdded()) {
        } else {
            i.a(true);
            if (fragment instanceof TBMainFragment) {
                TBFragmentTabHost c = com.taobao.tao.navigation.e.c();
                if (c == null || (currentFragment = c.getCurrentFragment()) == null) {
                    return;
                }
                if (d.j() && TextUtils.equals("mytaobao", currentFragment.getTag()) && !currentFragment.isAdded()) {
                    TBMainLog.tlog("FragmentLifeCycleHelper", "doOnStartAndOnResume, attach current fragment: " + currentFragment.getClass());
                    fragment.getChildFragmentManager().beginTransaction().attach(currentFragment).commitNowAllowingStateLoss();
                    return;
                } else if (!TextUtils.equals(NavigationTabConstraints.TAB_BIZ_HOMEPAGE, currentFragment.getTag())) {
                    return;
                } else {
                    fragment = currentFragment;
                }
            }
            TBMainLog.tlog("FragmentLifeCycleHelper", "into toF: " + fragment.getClass() + "onStart(), homeFragment.onResume()");
            e(fragment, context);
            f(fragment, context);
        }
    }
}
