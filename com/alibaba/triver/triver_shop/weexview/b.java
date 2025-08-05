package com.alibaba.triver.triver_shop.weexview;

import android.util.Log;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import tb.kge;

/* loaded from: classes3.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static WXSDKInstance f4165a;
    private static String b;

    static {
        kge.a(1155237243);
        f4165a = null;
        b = "WeexViewCache";
    }

    public static synchronized WXSDKInstance a() {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WXSDKInstance) ipChange.ipc$dispatch("77b57346", new Object[0]);
            }
            WXSDKInstance wXSDKInstance = f4165a;
            f4165a = null;
            return wXSDKInstance;
        }
    }

    public static synchronized void b() {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
                return;
            }
            try {
                if (f4165a != null) {
                    f4165a.e();
                    f4165a = null;
                }
            } catch (Exception e) {
                RVLogger.w(Log.getStackTraceString(e));
            }
        }
    }
}
