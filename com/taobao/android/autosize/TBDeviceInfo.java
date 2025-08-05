package com.taobao.android.autosize;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes4.dex */
public class TBDeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_FLIP = 2;
    public static final int TYPE_FOLD = 1;
    public static final int TYPE_PHONE = 0;
    public static final int TYPE_TABLET = 3;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface DeviceType {
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (l.d(context)) {
            return 1;
        }
        if (l.m(context)) {
            return 2;
        }
        return l.b(context) ? 3 : 0;
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : i != 1 ? i != 2 ? i != 3 ? "Phone" : "Tablet" : "Flip" : "Fold";
    }
}
