package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruw;
import tb.tei;

/* loaded from: classes9.dex */
public final class AppAPMPageExtension$commitPageAPM$$inlined$apply$lambda$2 extends Lambda implements ruw<String, Object, kotlin.t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ com.taobao.monitor.procedure.g $procedure$inlined;
    public final /* synthetic */ tei $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppAPMPageExtension$commitPageAPM$$inlined$apply$lambda$2(tei teiVar, com.taobao.monitor.procedure.g gVar) {
        super(2);
        this.$this_apply = teiVar;
        this.$procedure$inlined = gVar;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ kotlin.t mo2423invoke(String str, Object obj) {
        invoke2(str, obj);
        return kotlin.t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String key, Object value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f874a5", new Object[]{this, key, value});
            return;
        }
        kotlin.jvm.internal.q.d(key, "key");
        kotlin.jvm.internal.q.d(value, "value");
        try {
            this.$procedure$inlined.a(key, value);
            com.taobao.monitor.procedure.s sVar = com.taobao.monitor.procedure.s.f18233a;
            kotlin.jvm.internal.q.b(sVar, "ProcedureManagerProxy.PROXY");
            sVar.d().a(key, value);
        } catch (Exception unused) {
        }
    }
}
