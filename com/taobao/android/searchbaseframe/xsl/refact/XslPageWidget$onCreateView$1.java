package com.taobao.android.searchbaseframe.xsl.refact;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.rul;

/* loaded from: classes6.dex */
public final class XslPageWidget$onCreateView$1 extends Lambda implements rul<Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XslPageWidget$onCreateView$1(o oVar) {
        super(1);
        this.this$0 = oVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(Integer num) {
        invoke2(num);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4143d718", new Object[]{this, num});
            return;
        }
        MetaLayout d = ((com.taobao.android.meta.structure.page.b) this.this$0.J()).d();
        if (num == null) {
            kotlin.jvm.internal.q.a();
        }
        d.setListStart(num.intValue());
    }
}
