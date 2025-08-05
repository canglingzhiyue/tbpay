package com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.ScreenType;
import com.taobao.android.autosize.h;
import com.taobao.android.autosize.l;
import com.taobao.tao.Globals;
import tb.kge;
import tb.ldf;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1989937630);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : l.b(Globals.getApplication());
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : l.d(Globals.getApplication());
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            context = Globals.getApplication();
        }
        boolean b = h.a().b(context);
        return b() ? (b || a(context)) && !c(context) : b;
    }

    private static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue() : h.a().f(context);
    }

    private static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        ScreenType d = h.a().d(context);
        ldf.d("DeviceUtil", "screenType: " + d);
        return d == ScreenType.SMALL || d == ScreenType.MIN;
    }
}
