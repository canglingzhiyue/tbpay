package com.taobao.uniinfra_kmp.common_utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.timestamp.TimeStampManager;
import com.taobao.uniinfra_kmp.common_utils.a;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getServerTime", "", "Lcom/taobao/uniinfra_kmp/common_utils/Time$Companion;", "common_utils_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-713520405);
    }

    public static final long a(a.C1005a c1005a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c75bd32", new Object[]{c1005a})).longValue();
        }
        q.d(c1005a, "<this>");
        return TimeStampManager.instance().getCurrentTimeStamp();
    }
}
