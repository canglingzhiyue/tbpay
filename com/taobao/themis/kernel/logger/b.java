package com.taobao.themis.kernel.logger;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(407353878);
    }

    public static final String a(f getLogTraceId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9586a13", new Object[]{getLogTraceId});
        }
        q.d(getLogTraceId, "$this$getLogTraceId");
        return "TMS_" + getLogTraceId.c;
    }

    public static final String b(f genSubLogTraceId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb021032", new Object[]{genSubLogTraceId});
        }
        q.d(genSubLogTraceId, "$this$genSubLogTraceId");
        return a.a(a(genSubLogTraceId));
    }

    public static final String a(ITMSPage getLogTraceId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa2f6aed", new Object[]{getLogTraceId});
        }
        q.d(getLogTraceId, "$this$getLogTraceId");
        return a(getLogTraceId.b()) + "_" + getLogTraceId.a();
    }
}
