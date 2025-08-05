package com.taobao.alimama.api;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class AdSDK {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-687968026);
    }

    public static void initSDK(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b99b057", new Object[]{context});
        } else {
            a.a().a(context);
        }
    }

    public static <T> T getService(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bb314f9b", new Object[]{cls}) : (T) a.a().a(cls);
    }
}
