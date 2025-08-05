package com.taobao.themis.container.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import tb.kge;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1700262769);
    }

    public static void a(Context context) {
        try {
            Class.forName("com.taobao.themis.taobao.impl.TBTMSSDK").getDeclaredMethod("initTBTMS", Context.class).invoke(null, context);
        } catch (Throwable th) {
            TMSLogger.b("TBInitUtils", "initNecessary failed", th);
        }
    }
}
