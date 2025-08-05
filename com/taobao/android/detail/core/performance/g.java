package com.taobao.android.detail.core.performance;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import tb.eiq;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1275197174);
        emu.a("com.taobao.android.detail.core.performance.DetailPreloadUtil");
    }

    public static boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue();
        }
        if (activity == null || !(activity instanceof DetailCoreActivity)) {
            return false;
        }
        return ((DetailCoreActivity) activity).k();
    }

    public static boolean b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{activity})).booleanValue();
        }
        if (!a(activity)) {
            com.taobao.android.detail.core.utils.i.c("DetailPreloadUtil", "isPreload: false,isEnablePreloadLayoutHandleOpt false");
            return false;
        } else if (!eiq.l) {
            com.taobao.android.detail.core.utils.i.c("DetailPreloadUtil", "isEnablePreloadLayoutHandle: false,isEnablePreloadLayoutHandleOpt false");
            return false;
        } else {
            com.taobao.android.detail.core.utils.i.c("DetailPreloadUtil", "isPreloadLayoutHandleOpt: true");
            return true;
        }
    }
}
