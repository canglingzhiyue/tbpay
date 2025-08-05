package com.taobao.message.uikit.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class RoundRectRelativeLayout extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PaintFlagsDrawFilter paintFlagsDrawFilter;
    private float radius;
    private float recordedRadius;
    private RectF rectF;
    private Path roundPath;

    static {
        kge.a(1185440102);
    }

    public static /* synthetic */ Object ipc$super(RoundRectRelativeLayout roundRectRelativeLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != -244855388) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
    }

    public RoundRectRelativeLayout(Context context) {
        this(context, null);
    }

    public RoundRectRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.radius = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RoundRectRelativeLayout);
        float dimension = obtainStyledAttributes.getDimension(R.styleable.RoundRectRelativeLayout_rectCornerRadius, 0.0f);
        this.radius = dimension;
        this.recordedRadius = dimension;
        obtainStyledAttributes.recycle();
        init();
    }

    public RoundRectRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.radius = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RoundRectRelativeLayout);
        float dimension = obtainStyledAttributes.getDimension(R.styleable.RoundRectRelativeLayout_rectCornerRadius, 0.0f);
        this.radius = dimension;
        this.recordedRadius = dimension;
        obtainStyledAttributes.recycle();
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setWillNotDraw(false);
        this.rectF = new RectF();
        this.roundPath = new Path();
        this.paintFlagsDrawFilter = new PaintFlagsDrawFilter(0, 3);
    }

    public void setRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fcd05", new Object[]{this, new Float(f)});
            return;
        }
        this.radius = f;
        invalidate();
    }

    public void recoverRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6271f49d", new Object[]{this});
            return;
        }
        this.radius = this.recordedRadius;
        invalidate();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.radius == 0.0f) {
            return;
        }
        this.rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.roundPath.rewind();
        Path path = this.roundPath;
        RectF rectF = this.rectF;
        float f = this.radius;
        path.addRoundRect(rectF, f, f, Path.Direction.CCW);
        this.roundPath.close();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        if (this.radius != 0.0f && this.roundPath != null) {
            canvas.setDrawFilter(this.paintFlagsDrawFilter);
            canvas.clipPath(this.roundPath);
        }
        super.draw(canvas);
    }
}
