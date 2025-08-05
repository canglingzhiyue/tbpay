package com.taobao.android.sku.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2098835909);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing()) {
                return true;
            }
            if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
                return true;
            }
        }
        return false;
    }
}
