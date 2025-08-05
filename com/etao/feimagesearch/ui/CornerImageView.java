package com.etao.feimagesearch.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.g;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes3.dex */
public class CornerImageView extends TUrlImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int RADIUS;
    private int h;
    private Path mPath;
    private float mRadius;
    private RectF mRect;
    private int w;

    public static /* synthetic */ Object ipc$super(CornerImageView cornerImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 1389530587) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
    }

    static {
        kge.a(-1382389217);
        RADIUS = g.a(4.0f);
    }

    public CornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPath = new Path();
        this.mRect = new RectF();
        this.w = 0;
        this.h = 0;
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CornerImageView);
            this.mRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CornerImageView_civ_radius, RADIUS);
            obtainStyledAttributes.recycle();
        } catch (Exception unused) {
        }
    }

    public CornerImageView(Context context) {
        super(context);
        this.mPath = new Path();
        this.mRect = new RectF();
        this.w = 0;
        this.h = 0;
        this.mRadius = RADIUS;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.w = i;
        this.h = i2;
        setCropConfig();
    }

    public float getRadius() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f9580fff", new Object[]{this})).floatValue() : this.mRadius;
    }

    public void setRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fcd05", new Object[]{this, new Float(f)});
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.mRadius = f;
        setCropConfig();
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) getDrawable();
        if (bitmapDrawable != null && bitmapDrawable.getBitmap() != null && bitmapDrawable.getBitmap().isRecycled()) {
            return;
        }
        canvas.save();
        canvas.clipPath(this.mPath);
        super.draw(canvas);
        canvas.restore();
    }

    private void setCropConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68106e7b", new Object[]{this});
            return;
        }
        this.mRect.set(getPaddingLeft(), getPaddingTop(), this.w - getPaddingRight(), this.h - getPaddingBottom());
        this.mPath.reset();
        Path path = this.mPath;
        RectF rectF = this.mRect;
        float f = this.mRadius;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }
}
