package com.alibaba.security.realidentity;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class i4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static j4 a(Context context, String str, u4 u4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j4) ipChange.ipc$dispatch("bddbb0c1", new Object[]{context, str, u4Var});
        }
        if (a()) {
            return b(context, str, u4Var);
        }
        return new h4(context, str, u4Var);
    }

    public static j4 b(Context context, String str, u4 u4Var) {
        try {
            Object newInstance = Class.forName("com.alibaba.security.realidentity.mfa.uploader.OSSUploaderManager").getConstructor(Context.class, String.class, u4.class).newInstance(context, str, u4Var);
            if (newInstance instanceof j4) {
                return (j4) newInstance;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : 2 == n.h.intValue();
    }
}
