package com.taobao.search.sf.uikit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes8.dex */
public final class TopCropFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1093430663);
    }

    public static /* synthetic */ Object ipc$super(TopCropFrameLayout topCropFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 1907907562) {
            super.measureChildWithMargins((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopCropFrameLayout(Context context) {
        super(context);
        q.c(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopCropFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.c(context, "context");
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b85bea", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.measureChildWithMargins(view, i, i2, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), i4);
        }
    }
}
