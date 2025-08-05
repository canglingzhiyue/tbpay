package com.taobao.orange.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import tb.kge;

/* loaded from: classes7.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f18614a;

    static {
        kge.a(1348286338);
        f18614a = false;
        try {
            Class.forName("com.taobao.android.ab.api.ABGlobal");
            f18614a = true;
        } catch (Exception unused) {
            f18614a = false;
            OLog.e("ABUtil", "", "mABValid", Boolean.valueOf(f18614a));
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (f18614a) {
            try {
                boolean isFeatureOpened = ABGlobal.isFeatureOpened(com.taobao.orange.a.g, str);
                OLog.i("ABUtil", "isFeatureOpened", com.taobao.android.behavix.feature.a.FEATURE_NAME, str, "opened", Boolean.valueOf(isFeatureOpened));
                return isFeatureOpened;
            } catch (Throwable th) {
                OLog.e("ABUtil", "isFeatureOpened", th, new Object[0]);
            }
        }
        return false;
    }
}
