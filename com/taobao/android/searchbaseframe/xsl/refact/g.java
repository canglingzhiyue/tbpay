package com.taobao.android.searchbaseframe.xsl.refact;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.htg;
import tb.kge;

/* loaded from: classes6.dex */
public final class g extends htg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-748713631);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        if (str.hashCode() == 441941092) {
            super.a((com.taobao.android.meta.data.a) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.htg, com.taobao.android.meta.data.a
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : a().finish;
    }

    @Override // tb.htg, com.taobao.android.meta.data.a
    public void a(com.taobao.android.meta.data.a combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a577c64", new Object[]{this, combo});
            return;
        }
        kotlin.jvm.internal.q.c(combo, "combo");
        super.a(combo);
        if (!(combo instanceof g)) {
            return;
        }
        a().finish = ((g) combo).a().finish;
    }
}
