package com.taobao.search.sf;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.r;
import java.util.Set;
import tb.htd;
import tb.kge;

/* loaded from: classes8.dex */
public final class n implements htd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f19463a = r.bZ();

    static {
        kge.a(-1091632626);
        kge.a(1186092301);
    }

    @Override // tb.htd
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (str != null) {
            return this.f19463a.contains(str);
        }
        return false;
    }
}
