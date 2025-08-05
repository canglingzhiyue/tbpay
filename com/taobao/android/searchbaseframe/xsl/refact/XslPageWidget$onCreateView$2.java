package com.taobao.android.searchbaseframe.xsl.refact;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.htv;
import tb.rul;

/* loaded from: classes6.dex */
public final class XslPageWidget$onCreateView$2 extends Lambda implements rul<Boolean, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XslPageWidget$onCreateView$2(o oVar) {
        super(1);
        this.this$0 = oVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(Boolean bool) {
        invoke2(bool);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec80bee", new Object[]{this, bool});
            return;
        }
        o oVar = this.this$0;
        htv htvVar = o.$ipChange;
        if (htvVar == null) {
            return;
        }
        htvVar.a(kotlin.jvm.internal.q.a((Object) bool, (Object) true));
    }
}
