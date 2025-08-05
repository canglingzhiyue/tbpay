package com.taobao.themis.kernel.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.themis.kernel.adapter.IABTestAdapter;
import tb.kge;
import tb.qpt;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Boolean f22570a;

    static {
        kge.a(179905644);
        f22570a = null;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (f22570a != null) {
            return f22570a.booleanValue();
        }
        synchronized (c.class) {
            if (f22570a != null) {
                return f22570a.booleanValue();
            }
            if (context == null) {
                f22570a = false;
            } else {
                IABTestAdapter iABTestAdapter = (IABTestAdapter) qpt.b(IABTestAdapter.class);
                if (iABTestAdapter == null) {
                    com.taobao.android.riverlogger.e.a(RVLLevel.Error, "WindVane/Launch", "IABTestAdapter is null");
                    f22570a = false;
                } else {
                    if (iABTestAdapter.isFeatureOpened(context, "TMS_globalContainerOptimization")) {
                        z = false;
                    }
                    f22570a = Boolean.valueOf(z);
                }
            }
            return f22570a.booleanValue();
        }
    }
}
