package com.taobao.android.detail.core.standard.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.emh;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class ClipableTUrlImageView extends TUrlImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Path mClipPath;
    private boolean mNeedClipPath;

    static {
        kge.a(1571515389);
    }

    public static /* synthetic */ Object ipc$super(ClipableTUrlImageView clipableTUrlImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 1389530587) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
    }

    public ClipableTUrlImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public ClipableTUrlImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ClipableTUrlImageView(Context context) {
        super(context);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mClipPath = new Path();
        emu.a("com.taobao.android.detail.core.standard.widget.ClipableTUrlImageView");
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
        float b = emh.b(getContext());
        this.mClipPath.addRoundRect(new RectF(0.0f, 0.0f, i, i2), new float[]{b, b, b, b, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
        } else if (!this.mNeedClipPath) {
            super.onDraw(canvas);
        } else {
            int save = canvas.save();
            canvas.clipPath(this.mClipPath);
            super.onDraw(canvas);
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
