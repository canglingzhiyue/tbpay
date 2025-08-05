package com.etao.feimagesearch.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.g;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rwf;

/* loaded from: classes4.dex */
public final class SearchIconLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int bgColor;
    private boolean commonMode;
    private final int commonPaddingRight;
    private final int foldPadding;
    private int maxWidth;
    private final int padding;
    private final Paint paint;
    private final Path path;
    private final float radius;
    private final float[] radiusArray;
    private final int textMargin;

    /* loaded from: classes4.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SearchIconLayout.this.requestLayout();
            }
        }
    }

    static {
        kge.a(260940998);
    }

    public static /* synthetic */ Object ipc$super(SearchIconLayout searchIconLayout, String str, Object... objArr) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchIconLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.c(context, "context");
        this.textMargin = g.a(6.0f);
        this.padding = this.textMargin;
        this.commonPaddingRight = g.a(12.0f);
        this.foldPadding = this.padding;
        this.commonMode = true;
        this.radius = g.b(18.0f);
        float f = this.radius;
        this.radiusArray = new float[]{f, f, f, f, f, f, f, f};
        this.paint = new Paint(1);
        this.path = new Path();
        this.bgColor = Color.argb((int) 102.0f, 0, 0, 0);
        int i = this.padding;
        setPadding(i, i, this.commonPaddingRight, this.foldPadding);
        this.maxWidth = Integer.MAX_VALUE;
    }

    public final void setMaxWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e63498", new Object[]{this, new Integer(i)});
            return;
        }
        this.maxWidth = i;
        post(new a());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
        } else if (canvas == null) {
        } else {
            canvas.save();
            canvas.clipPath(this.path);
            canvas.drawColor(this.bgColor);
            super.dispatchDraw(canvas);
            if (!this.commonMode) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.paint);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.path.reset();
        this.path.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.radiusArray, Path.Direction.CW);
        this.paint.setShader(new LinearGradient(getWidth() - this.radius, 0.0f, getWidth(), 0.0f, new int[]{0, -16777216}, (float[]) null, Shader.TileMode.CLAMP));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int i5 = this.padding;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View view = getChildAt(i6);
            int height = getHeight();
            q.a((Object) view, "view");
            view.layout(i5, (height - view.getMeasuredHeight()) / 2, view.getMeasuredWidth() + i5, (getHeight() + view.getMeasuredHeight()) / 2);
            i5 = i5 + view.getMeasuredWidth() + this.textMargin;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = this.padding;
        int childCount = getChildCount();
        int i4 = i3;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View view = getChildAt(i6);
            q.a((Object) view, "view");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            q.a((Object) layoutParams, "view.layoutParams");
            view.measure(ViewGroup.getChildMeasureSpec(i, 0, layoutParams.width), ViewGroup.getChildMeasureSpec(i2, 0, layoutParams.height));
            i4 += view.getMeasuredWidth();
            i5 = rwf.c(i5, view.getMeasuredHeight());
        }
        int i7 = i4 + this.textMargin;
        int i8 = this.commonPaddingRight;
        int i9 = i7 + i8;
        int i10 = this.maxWidth;
        if (i9 > i10) {
            setMeasuredDimension(i10, i5 + (this.padding * 2));
            if (!this.commonMode) {
                return;
            }
            this.commonMode = false;
            int i11 = this.padding;
            setPadding(i11, i11, i11, i11);
            return;
        }
        setMeasuredDimension(i7 + i8, i5 + (this.padding * 2));
        if (this.commonMode) {
            return;
        }
        this.commonMode = true;
        int i12 = this.padding;
        setPadding(i12, i12, this.commonPaddingRight, i12);
    }
}
