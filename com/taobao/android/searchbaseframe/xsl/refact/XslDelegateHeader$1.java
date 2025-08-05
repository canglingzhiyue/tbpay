package com.taobao.android.searchbaseframe.xsl.refact;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.xsl.page.uikit.XslPageLayout;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.rul;

/* loaded from: classes6.dex */
public final class XslDelegateHeader$1 extends Lambda implements rul<XslPageLayout.a, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XslDelegateHeader$1(k kVar) {
        super(1);
        this.this$0 = kVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(XslPageLayout.a aVar) {
        invoke2(aVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(XslPageLayout.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6fb75c", new Object[]{this, aVar});
        } else {
            k.a(this.this$0, aVar);
        }
    }
}
