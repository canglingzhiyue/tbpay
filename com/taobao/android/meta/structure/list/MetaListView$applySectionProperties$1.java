package com.taobao.android.meta.structure.list;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.xsl.section.refact.XSectionLayout;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes6.dex */
public final class MetaListView$applySectionProperties$1 extends Lambda implements rul<Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaListView$applySectionProperties$1(g gVar) {
        super(1);
        this.this$0 = gVar;
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
        XSectionLayout d = g.d(this.this$0);
        if (num == null) {
            q.a();
        }
        d.setSectionStart(num.intValue());
    }
}
