package com.taobao.android.purchase.aura.utils;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.reflect.Field;
import tb.arc;
import tb.ard;
import tb.kge;

/* loaded from: classes6.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-892424037);
    }

    public static void a(FragmentActivity fragmentActivity) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        try {
            Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
            declaredField.setAccessible(true);
            ((ActivityInfo) declaredField.get(fragmentActivity)).screenOrientation = -1;
            declaredField.setAccessible(false);
        } catch (Exception e) {
            fragmentActivity.setTheme(R.style.TBBuyBaseTheme);
            ard a2 = arc.a();
            a2.b("fixOrientation exception#" + e.getMessage(), arc.a.a().b("TBBuyActivity").b());
        }
    }
}
