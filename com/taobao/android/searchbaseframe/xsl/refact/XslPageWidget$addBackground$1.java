package com.taobao.android.searchbaseframe.xsl.refact;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.rul;

/* loaded from: classes6.dex */
public final class XslPageWidget$addBackground$1 extends Lambda implements rul<d, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XslPageWidget$addBackground$1(o oVar) {
        super(1);
        this.this$0 = oVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(d dVar) {
        invoke2(dVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf7443c2", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            if (kotlin.jvm.internal.q.a((Object) dVar.a(), (Object) "image")) {
                o oVar = this.this$0;
                o.$ipChange.setImageUrl(dVar.b());
            } else if (!kotlin.jvm.internal.q.a((Object) dVar.a(), (Object) o.BG_TYPE_IMAGE_LOCAL)) {
            } else {
                o oVar2 = this.this$0;
                o.$ipChange.setResource(dVar.b());
            }
        }
    }
}
