package com.taobao.android.searchbaseframe.xsl.refact;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public final class PullRefreshContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Rect clipRect;
    private int offset;
    private boolean offsetUpdated;

    static {
        kge.a(62181487);
    }

    public static /* synthetic */ Object ipc$super(PullRefreshContainer pullRefreshContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 650865254) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public PullRefreshContainer(Context context) {
        super(context);
        this.clipRect = new Rect();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        if (!this.offsetUpdated) {
            this.offset = -getMeasuredHeight();
        }
        this.clipRect.set(0, -this.offset, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void updateOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54c4620", new Object[]{this, new Integer(i)});
            return;
        }
        this.offsetUpdated = true;
        this.offset = i;
        this.clipRect.set(0, -this.offset, getMeasuredWidth(), getMeasuredHeight());
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        kotlin.jvm.internal.q.c(canvas, "canvas");
        canvas.save();
        canvas.clipRect(this.clipRect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
