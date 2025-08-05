package com.taobao.android.detail.core.detail.kit.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class SelectableImageView extends DetailImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Paint mPaint;
    private Path mStatePath;
    private float mStrokeWidth;

    static {
        kge.a(1988255607);
    }

    public static /* synthetic */ Object ipc$super(SelectableImageView selectableImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1540204496) {
            super.setSelected(((Boolean) objArr[0]).booleanValue());
            return null;
        } else if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != -244855388) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
    }

    public SelectableImageView(Context context) {
        super(context);
        this.mStatePath = null;
        init();
    }

    public SelectableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mStatePath = null;
        init();
    }

    public SelectableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mStatePath = null;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mPaint = new Paint();
        this.mStrokeWidth = getContext().getResources().getDisplayMetrics().density * 4.0f;
        this.mPaint.setStrokeWidth(this.mStrokeWidth);
        this.mPaint.setColor(-65536);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setAntiAlias(true);
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.SelectableImageView");
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        initPath(i, i2, i3, i4);
    }

    private void initPath(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da221c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.mStatePath = new Path();
        this.mStatePath.moveTo(0.0f, 0.0f);
        float f = i3 - i;
        this.mStatePath.lineTo(f, 0.0f);
        float f2 = i4 - i2;
        this.mStatePath.lineTo(f, f2);
        this.mStatePath.lineTo(0.0f, f2);
        this.mStatePath.close();
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setSelected(z);
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (!isSelected()) {
            return;
        }
        canvas.drawPath(this.mStatePath, this.mPaint);
    }
}
