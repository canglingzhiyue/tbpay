package com.taobao.themis.container.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.utils.n;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/themis/container/utils/TMSContainerConfigUtils;", "", "()V", "getErrorReportButtonBlackList", "", "getErrorReportButtonEnable", "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c INSTANCE;

    static {
        kge.a(-431411418);
        INSTANCE = new c();
    }

    private c() {
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : n.a(i.ORANGE_GROUP_IMPORTANT_CONFIG, "triverErrorReportButtonEnable", (Boolean) null);
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : n.a(i.ORANGE_GROUP_IMPORTANT_CONFIG, "triverErrorReportButtonBlackList", "");
    }
}
