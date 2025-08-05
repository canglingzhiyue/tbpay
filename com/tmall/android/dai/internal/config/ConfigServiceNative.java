package com.tmall.android.dai.internal.config;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class ConfigServiceNative {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1274305289);
    }

    private static native void nativeAddExtraConfig(String str, int i);

    private static native void nativeParseSceneV3Config(String str);

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            nativeParseSceneV3Config(str);
        }
    }

    public static void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{str, new Integer(i)});
        } else {
            nativeAddExtraConfig(str, i);
        }
    }
}
