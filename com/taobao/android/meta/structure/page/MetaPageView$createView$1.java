package com.taobao.android.meta.structure.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.viewpager.uikit.SearchViewPager;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes6.dex */
public final class MetaPageView$createView$1 extends Lambda implements rul<Boolean, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaPageView$createView$1(e eVar) {
        super(1);
        this.this$0 = eVar;
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
        SearchViewPager a2 = e.a(this.this$0);
        if (bool == null) {
            q.a();
        }
        a2.setDragEnabled(bool.booleanValue());
    }
}
