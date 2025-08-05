package com.taobao.themis.web.runtime;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;
import tb.aeo;
import tb.kge;
import tb.tro;

/* loaded from: classes9.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e INSTANCE;

    static {
        kge.a(-169092145);
        INSTANCE = new e();
    }

    private e() {
    }

    @JvmStatic
    public static final boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        aeo.a(context);
        String a2 = aeo.a();
        return a2 != null && tro.a(a2, "100.0.4896.58") > 0;
    }
}
