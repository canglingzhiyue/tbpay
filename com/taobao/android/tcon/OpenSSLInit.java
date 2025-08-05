package com.taobao.android.tcon;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class OpenSSLInit implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-616451004);
        kge.a(1028243835);
    }

    private static native void execute();

    public static boolean init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fede19b", new Object[0])).booleanValue();
        }
        try {
            System.loadLibrary("openssl_init");
            execute();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
