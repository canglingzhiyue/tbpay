package com.taobao.search.sf.detailpre;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes8.dex */
public final class DetailPreRequestUtil$Companion$instance$2 extends Lambda implements ruk<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DetailPreRequestUtil$Companion$instance$2 INSTANCE = new DetailPreRequestUtil$Companion$instance$2();

    public DetailPreRequestUtil$Companion$instance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final a mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("30020dea", new Object[]{this}) : new a();
    }
}
