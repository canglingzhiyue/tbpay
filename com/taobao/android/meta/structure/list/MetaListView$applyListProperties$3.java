package com.taobao.android.meta.structure.list;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes6.dex */
public final class MetaListView$applyListProperties$3 extends Lambda implements rul<Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FrameLayout $footerFrame;
    public final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaListView$applyListProperties$3(g gVar, FrameLayout frameLayout) {
        super(1);
        this.this$0 = gVar;
        this.$footerFrame = frameLayout;
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
        FrameLayout footerFrame = this.$footerFrame;
        q.a((Object) footerFrame, "footerFrame");
        FrameLayout frameLayout = footerFrame;
        if (num == null) {
            q.a();
        }
        int intValue = num.intValue();
        Integer a2 = g.e(this.this$0).Q().a();
        if (a2 == null) {
            q.a();
        }
        com.taobao.android.searchbaseframe.xsl.refact.f.a(frameLayout, intValue + a2.intValue());
    }
}
