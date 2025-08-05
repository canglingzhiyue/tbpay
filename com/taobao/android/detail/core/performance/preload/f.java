package com.taobao.android.detail.core.performance.preload;

import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final d f9798a;

    static {
        kge.a(-794998888);
        f9798a = new d();
        emu.a("com.taobao.android.detail.core.performance.preload.ParserResponseExecutorService");
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            f9798a.a(1, 60, "parserResponseOnPreload").execute(runnable);
        }
    }
}
