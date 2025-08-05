package com.taobao.android.searchbaseframe.xsl.refact;

import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.rul;

/* loaded from: classes6.dex */
public final class XslChildPageWidget$ensureContainers$2 extends Lambda implements rul<Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XslChildPageWidget$ensureContainers$2(e eVar) {
        super(1);
        this.this$0 = eVar;
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
        e eVar = this.this$0;
        LinearLayout linearLayout = (LinearLayout) e.$ipChange.getView();
        if (linearLayout == null) {
            kotlin.jvm.internal.q.a();
        }
        kotlin.jvm.internal.q.a((Object) linearLayout, "foldWidget.view!!");
        LinearLayout linearLayout2 = linearLayout;
        if (num == null) {
            kotlin.jvm.internal.q.a();
        }
        f.b(linearLayout2, num.intValue());
    }
}
