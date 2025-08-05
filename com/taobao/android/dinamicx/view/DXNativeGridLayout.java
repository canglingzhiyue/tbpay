package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class DXNativeGridLayout extends DXNativeFrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float[] linePts;
    private boolean needSeparator;
    private Paint paint;

    static {
        kge.a(1429686450);
    }

    public static /* synthetic */ Object ipc$super(DXNativeGridLayout dXNativeGridLayout, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public DXNativeGridLayout(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public DXNativeGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
    }

    public DXNativeGridLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
    }

    public void setLines(boolean z, int i, int i2, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("969701bb", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), fArr});
            return;
        }
        this.needSeparator = z;
        if (!z) {
            return;
        }
        if (fArr == null || fArr.length == 0 || i2 == 0) {
            this.needSeparator = false;
            return;
        }
        if (this.paint == null) {
            this.paint = new Paint();
        }
        this.paint.setColor(i);
        this.paint.setStrokeWidth(i2);
        this.linePts = fArr;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (!this.needSeparator) {
            return;
        }
        canvas.drawLines(this.linePts, this.paint);
    }
}
