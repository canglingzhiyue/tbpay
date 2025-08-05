package com.taobao.uniinfra_kmp.common_utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import kotlin.Metadata;
import tb.kge;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¨\u0006\u0006"}, d2 = {"isSessionValid", "", "getSid", "", "getUid", "getNickname", "common_utils_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1449645495);
    }

    public static final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : Login.getNick();
    }
}
