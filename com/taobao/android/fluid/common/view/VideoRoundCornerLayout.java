package com.taobao.android.fluid.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class VideoRoundCornerLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.taobao.tao.flexbox.layoutmanager.drawable.a boxShadowDrawable;
    private int boxShadowOffsetX;
    private int boxShadowOffsetY;
    private int heightSplit;
    private final Path mBoxShadowPath;
    private float[] mCornerRadii;
    private float mCornerRadius;
    private final Path mPath;
    private final RectF mRectF;
    private final Paint mStrokePaint;
    private final Path mStrokePath;
    private float strokeWidth;
    private int widthSplit;

    static {
        kge.a(2088695344);
    }

    public static /* synthetic */ Object ipc$super(VideoRoundCornerLayout videoRoundCornerLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public VideoRoundCornerLayout(Context context) {
        super(context);
        this.mStrokePath = new Path();
        this.mBoxShadowPath = new Path();
        this.mStrokePaint = new Paint();
        this.mPath = new Path();
        this.mRectF = new RectF();
        this.widthSplit = 0;
        this.heightSplit = 0;
    }

    public VideoRoundCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mStrokePath = new Path();
        this.mBoxShadowPath = new Path();
        this.mStrokePaint = new Paint();
        this.mPath = new Path();
        this.mRectF = new RectF();
        this.widthSplit = 0;
        this.heightSplit = 0;
    }

    public void setBoxShadowDrawable(com.taobao.tao.flexbox.layoutmanager.drawable.a aVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90b0d43a", new Object[]{this, aVar, new Integer(i), new Integer(i2)});
            return;
        }
        this.boxShadowOffsetX = i;
        this.boxShadowOffsetY = i2;
        this.boxShadowDrawable = aVar;
        invalidate();
    }

    public void setCornerRadii(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9100fcf0", new Object[]{this, fArr});
            return;
        }
        this.mCornerRadii = fArr;
        invalidate();
    }

    public void setCornerRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c784f0", new Object[]{this, new Float(f)});
            return;
        }
        this.mCornerRadius = f;
        invalidate();
    }

    public void setScaleSizeRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faebd710", new Object[]{this, new Float(f)});
            return;
        }
        float width = (getWidth() * 1.0f) / getHeight();
        if (width > f) {
            this.heightSplit = 0;
            this.widthSplit = (int) ((getWidth() - (getHeight() * f)) / 2.0f);
        } else if (width < f) {
            this.widthSplit = 0;
            this.heightSplit = (int) ((getHeight() - (getWidth() / f)) / 2.0f);
        } else {
            this.heightSplit = 0;
            this.widthSplit = 0;
        }
        invalidate();
    }

    public void setStrokeInfo(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8e1512", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        this.strokeWidth = f;
        if (f > 0.0f) {
            this.mStrokePaint.setAntiAlias(true);
            this.mStrokePaint.setColor(i);
            this.mStrokePaint.setStyle(Paint.Style.STROKE);
            this.mStrokePaint.setStrokeWidth(f);
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dispatchDraw(android.graphics.Canvas r10) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.common.view.VideoRoundCornerLayout.dispatchDraw(android.graphics.Canvas):void");
    }
}
