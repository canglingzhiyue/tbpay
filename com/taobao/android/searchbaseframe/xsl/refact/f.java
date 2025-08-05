package com.taobao.android.searchbaseframe.xsl.refact;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2033623797);
    }

    public static final void a(View setPaddingTop, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{setPaddingTop, new Integer(i)});
            return;
        }
        kotlin.jvm.internal.q.c(setPaddingTop, "$this$setPaddingTop");
        setPaddingTop.setPadding(setPaddingTop.getPaddingLeft(), i, setPaddingTop.getPaddingRight(), setPaddingTop.getPaddingBottom());
    }

    public static final void b(View setPaddingBottom, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6b49da", new Object[]{setPaddingBottom, new Integer(i)});
            return;
        }
        kotlin.jvm.internal.q.c(setPaddingBottom, "$this$setPaddingBottom");
        setPaddingBottom.setPadding(setPaddingBottom.getPaddingLeft(), setPaddingBottom.getPaddingTop(), setPaddingBottom.getPaddingRight(), i);
    }
}
