package com.taobao.uniinfra_kmp.common_utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"getUUID", "", "common_utils_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-828144071);
    }

    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        String uuid = UUID.randomUUID().toString();
        q.b(uuid, "toString(...)");
        return uuid;
    }
}
