package com.alipay.mobile.security.faceauth.api;

import android.content.Context;
import com.alipay.mobile.security.bio.module.MicroModule;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AntDetectFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int TYPE_FACE;

    public static AntDetector create(Context context, int i, MicroModule microModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AntDetector) ipChange.ipc$dispatch("1fc452a0", new Object[]{context, new Integer(i), microModule});
        }
        if (context == null) {
            throw new RuntimeException("context Can't be null");
        }
        if (i == 0) {
            return (AntDetector) a(context, "com.alipay.mobile.security.faceauth.bean.FaceAuthenticator", microModule);
        }
        throw new RuntimeException("Can't find Authenticator");
    }

    private static Object a(Context context, String str, MicroModule microModule) {
        try {
            return Class.forName(str).getConstructor(Context.class, MicroModule.class).newInstance(context, microModule);
        } catch (Exception unused) {
            return null;
        }
    }
}
