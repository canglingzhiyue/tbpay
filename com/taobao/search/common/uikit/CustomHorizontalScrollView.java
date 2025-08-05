package com.taobao.search.common.uikit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.rvc;

/* loaded from: classes7.dex */
public final class CustomHorizontalScrollView extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private rvc<? super View, ? super Integer, ? super Integer, ? super Integer, ? super Integer, t> onCustomScrollChangeListener;

    static {
        kge.a(-374232796);
    }

    public CustomHorizontalScrollView(Context context) {
        this(context, null, 2, null);
    }

    public static /* synthetic */ Object ipc$super(CustomHorizontalScrollView customHorizontalScrollView, String str, Object... objArr) {
        if (str.hashCode() == 1004220751) {
            super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public /* synthetic */ CustomHorizontalScrollView(Context context, AttributeSet attributeSet, int i, o oVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.c(context, "context");
    }

    public final rvc<View, Integer, Integer, Integer, Integer, t> getOnCustomScrollChangeListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rvc) ipChange.ipc$dispatch("f56a7b89", new Object[]{this}) : this.onCustomScrollChangeListener;
    }

    public final void setOnCustomScrollChangeListener(rvc<? super View, ? super Integer, ? super Integer, ? super Integer, ? super Integer, t> rvcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a282d4fb", new Object[]{this, rvcVar});
        } else {
            this.onCustomScrollChangeListener = rvcVar;
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        rvc<? super View, ? super Integer, ? super Integer, ? super Integer, ? super Integer, t> rvcVar = this.onCustomScrollChangeListener;
        if (rvcVar == null) {
            return;
        }
        rvcVar.invoke(this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }
}
