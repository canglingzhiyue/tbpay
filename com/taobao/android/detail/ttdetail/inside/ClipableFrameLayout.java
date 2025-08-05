package com.taobao.android.detail.ttdetail.inside;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.f;
import tb.kge;

/* loaded from: classes5.dex */
public class ClipableFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Path mClipPath;
    private boolean mNeedClipPath;

    static {
        kge.a(10178445);
    }

    public static /* synthetic */ Object ipc$super(ClipableFrameLayout clipableFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 1389530587) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
    }

    public ClipableFrameLayout(Context context) {
        super(context);
        init();
    }

    public ClipableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mClipPath = new Path();
        setClipChildren(true);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.mClipPath.reset();
        float a2 = f.a(16.0f);
        this.mClipPath.addRoundRect(new RectF(0.0f, 0.0f, i, i2), new float[]{a2, a2, a2, a2, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
    }

    public ClipableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
        } else if (!this.mNeedClipPath) {
            super.dispatchDraw(canvas);
        } else {
            int save = canvas.save();
            canvas.clipPath(this.mClipPath);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void setClipPath(Path path) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60953fda", new Object[]{this, path});
            return;
        }
        this.mClipPath = path;
        postInvalidate();
    }

    public void setNeedClipPath(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcebf80", new Object[]{this, new Boolean(z)});
        } else if (this.mNeedClipPath == z) {
        } else {
            this.mNeedClipPath = z;
            postInvalidate();
        }
    }
}
