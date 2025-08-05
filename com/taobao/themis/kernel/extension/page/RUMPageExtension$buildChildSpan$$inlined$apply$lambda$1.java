package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruw;
import tb.shc;

/* loaded from: classes9.dex */
public final class RUMPageExtension$buildChildSpan$$inlined$apply$lambda$1 extends Lambda implements ruw<String, Long, kotlin.t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ shc $span$inlined;
    public final /* synthetic */ long $stageTime$inlined;
    public final /* synthetic */ com.taobao.analysis.v3.n $startLoadActionSpan$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RUMPageExtension$buildChildSpan$$inlined$apply$lambda$1(com.taobao.analysis.v3.n nVar, long j, shc shcVar) {
        super(2);
        this.$startLoadActionSpan$inlined = nVar;
        this.$stageTime$inlined = j;
        this.$span$inlined = shcVar;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.t, java.lang.Object] */
    @Override // tb.ruw
    /* renamed from: invoke */
    public /* synthetic */ kotlin.t mo2423invoke(String str, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("77c951db", new Object[]{this, str, l});
        }
        invoke(str, l.longValue());
        return kotlin.t.INSTANCE;
    }

    public final void invoke(String stage, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5588c2db", new Object[]{this, stage, new Long(j)});
            return;
        }
        kotlin.jvm.internal.q.d(stage, "stage");
        this.$startLoadActionSpan$inlined.a(stage, Long.valueOf((j + this.$stageTime$inlined) - this.$span$inlined.k()));
    }
}
