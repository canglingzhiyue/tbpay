package com.etao.feimagesearch;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.com;
import tb.kge;

/* loaded from: classes3.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DEVICE_TYPE = "deviceType";
    public static final String KEY_SCREEN_STYLE = "screenStyle";
    public static final String TAG_PREFIX = "AutoSize_";

    /* renamed from: a  reason: collision with root package name */
    private static String f6928a;

    static {
        kge.a(-637191254);
        f6928a = "";
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if (TextUtils.isEmpty(f6928a)) {
            f6928a = com.s() ? "foldingmobile" : com.r() ? "pad" : "mobile";
        }
        return f6928a;
    }
}
