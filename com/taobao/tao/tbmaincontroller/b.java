package com.taobao.tao.tbmaincontroller;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.speed.TBSpeed;
import com.taobao.tao.tbmainfragment.d;
import com.taobao.tao.util.TBMainLog;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f21121a;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        return false;
    }

    static {
        kge.a(1092117252);
        f21121a = -1;
    }

    public static TBMainController a(FragmentActivity fragmentActivity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBMainController) ipChange.ipc$dispatch("7b6e3b7d", new Object[]{fragmentActivity, bundle});
        }
        d.a(fragmentActivity);
        if (!l.d((Context) fragmentActivity) && TBSpeed.isSpeedEdition(fragmentActivity, "use_bcontroller_without_downgrade")) {
            TBMainLog.tlog("TBMainController", "create BTBMainController without downgrade");
            return new BTBMainController(fragmentActivity);
        } else if (b(fragmentActivity, bundle)) {
            TBMainLog.tlog("TBMainController", "into close FragmentModel and create ATBMainController");
            return new ATBMainController(fragmentActivity);
        } else if (d.b(fragmentActivity)) {
            TBMainLog.tlog("TBMainController", "create BTBMainController");
            return new BTBMainController(fragmentActivity);
        } else if (d.c(fragmentActivity)) {
            TBMainLog.tlog("TBMainController", "create BTBMainController open by homepage");
            return new BTBMainController(fragmentActivity);
        } else {
            TBMainLog.tlog("TBMainController", "create ATBMainController");
            return new ATBMainController(fragmentActivity);
        }
    }

    private static boolean b(FragmentActivity fragmentActivity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9969ff3e", new Object[]{fragmentActivity, bundle})).booleanValue();
        }
        SharedPreferences sharedPreferences = fragmentActivity.getSharedPreferences("tbmain_fragment_model", 0);
        if (sharedPreferences.getBoolean("lastSaveInstanceFragmentModelOpen", false)) {
            TBMainLog.tlog("TBMainController", "lastSaveInstanceFragmentModelOpen is true");
            if (!d.b(fragmentActivity) && bundle != null) {
                TBMainLog.tlog("TBMainController", "lastSaveInstanceFragmentModelOpen is true and this time fragment is close and saveInstanceState is not null");
            } else if (!d.b(fragmentActivity) && bundle == null) {
                TBMainLog.tlog("TBMainController", "FragmentSwitch isFragmentModelOpen is false");
                sharedPreferences.edit().putBoolean("lastSaveInstanceFragmentModelOpen", false).commit();
            }
            return false;
        } else if (bundle != null) {
            TBMainLog.tlog("TBMainController", "savedInstanceState is not null and lastSaveInstanceFragmentModelOpen is false, close Fragment Switch");
            d.c();
            d.a();
            return true;
        } else {
            boolean b = d.b(fragmentActivity);
            TBMainLog.tlog("TBMainController", "isFragmentModelOpen is " + b);
            sharedPreferences.edit().putBoolean("lastSaveInstanceFragmentModelOpen", b).commit();
            return false;
        }
    }

    public static boolean a(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cabb445e", new Object[]{activity, new Boolean(z)})).booleanValue();
        }
        View findViewById = activity.findViewById(R.id.tbTabFragment);
        if (findViewById == null) {
            TBMainLog.tlog("TBMainController", "showFullScreen failed, tab fragment is null");
            return false;
        }
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            TBMainLog.tlog("TBMainController", "showFullScreen failed, layoutParams is not instanceof FrameLayout LayoutParams");
            return false;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (z) {
            if (layoutParams2.bottomMargin == 0) {
                TBMainLog.tlog("TBMainController", "frameLayoutParam.bottomMargin is already 0");
                return true;
            }
            f21121a = layoutParams2.bottomMargin;
            layoutParams2.bottomMargin = 0;
        } else if (f21121a == -1) {
            TBMainLog.tlog("TBMainController", "showFullScreen failed, tbMainContentFragmentBottomMargin is invalid");
            return false;
        } else {
            int i = layoutParams2.bottomMargin;
            int i2 = f21121a;
            if (i == i2) {
                TBMainLog.tlog("TBMainController", "frameLayoutParam.bottomMargin is already eq tbMainContentFragmentBottomMargin");
                return true;
            }
            layoutParams2.bottomMargin = i2;
        }
        findViewById.setLayoutParams(layoutParams2);
        TBMainLog.tlog("TBMainController", "setLayoutParams: " + layoutParams2.bottomMargin);
        return true;
    }
}
