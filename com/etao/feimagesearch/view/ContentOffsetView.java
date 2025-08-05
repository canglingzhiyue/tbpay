package com.etao.feimagesearch.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rwf;

/* loaded from: classes4.dex */
public final class ContentOffsetView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int offset;

    static {
        kge.a(-1826885994);
    }

    public static /* synthetic */ Object ipc$super(ContentOffsetView contentOffsetView, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentOffsetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.c(context, "context");
    }

    public final int getOffset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c7531f83", new Object[]{this})).intValue() : this.offset;
    }

    public final void setOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b976b8e7", new Object[]{this, new Integer(i)});
            return;
        }
        this.offset = i;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
        } else if (canvas == null) {
        } else {
            int d = rwf.d(rwf.c(getHeight() + this.offset, 0), getHeight());
            if (d == getHeight()) {
                super.dispatchDraw(canvas);
            } else if (d == 0) {
            } else {
                canvas.save();
                canvas.clipRect(0, 0, getWidth(), d);
                super.dispatchDraw(canvas);
                canvas.restore();
            }
        }
    }
}
