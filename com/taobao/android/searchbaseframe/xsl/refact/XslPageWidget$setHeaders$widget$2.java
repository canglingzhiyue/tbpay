package com.taobao.android.searchbaseframe.xsl.refact;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.irp;
import tb.ise;
import tb.ito;
import tb.rul;

/* loaded from: classes6.dex */
public final class XslPageWidget$setHeaders$widget$2 extends Lambda implements rul<String, ise<irp, ? extends ito>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XslPageWidget$setHeaders$widget$2(o oVar) {
        super(1);
        this.this$0 = oVar;
    }

    @Override // tb.rul
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final ise<irp, ? extends ito> mo2421invoke(String it) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ise) ipChange.ipc$dispatch("bd586c42", new Object[]{this, it});
        }
        kotlin.jvm.internal.q.c(it, "it");
        o oVar = this.this$0;
        return o.$ipChange.f();
    }
}
