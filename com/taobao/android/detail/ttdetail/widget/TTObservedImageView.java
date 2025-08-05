package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class TTObservedImageView extends AppCompatImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mDrawableDrawListener;
    private boolean mHasDrawableDrew;
    private float mWidthRatio;

    /* loaded from: classes5.dex */
    public interface a {
        void a(Drawable drawable);
    }

    static {
        kge.a(1421922336);
    }

    public static /* synthetic */ Object ipc$super(TTObservedImageView tTObservedImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1150258430) {
            super.setImageDrawable((Drawable) objArr[0]);
            return null;
        } else if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 650865254) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public TTObservedImageView(Context context) {
        super(context);
        this.mWidthRatio = -1.0f;
    }

    public TTObservedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWidthRatio = -1.0f;
    }

    public TTObservedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mWidthRatio = -1.0f;
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
        } else {
            super.setImageDrawable(drawable);
        }
    }

    public void setWidthRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab4e892", new Object[]{this, new Float(f)});
        } else if (this.mWidthRatio == f) {
        } else {
            this.mWidthRatio = f;
            if (Build.VERSION.SDK_INT >= 18 && isInLayout()) {
                post(new Runnable() { // from class: com.taobao.android.detail.ttdetail.widget.TTObservedImageView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            TTObservedImageView.this.requestLayout();
                        }
                    }
                });
            } else {
                requestLayout();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (Float.compare(this.mWidthRatio, 0.0f) > 0) {
            i = View.MeasureSpec.makeMeasureSpec((int) (((getDefaultSize(0, i) - getPaddingTop()) - getPaddingBottom()) * this.mWidthRatio), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        a aVar;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        Drawable drawable = getDrawable();
        if (drawable == null) {
            z = false;
        }
        this.mHasDrawableDrew = z;
        if (!this.mHasDrawableDrew || (aVar = this.mDrawableDrawListener) == null) {
            return;
        }
        aVar.a(drawable);
    }

    public void setObserveListener(a aVar) {
        Drawable drawable;
        a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3075f5af", new Object[]{this, aVar});
            return;
        }
        this.mDrawableDrawListener = aVar;
        if (!this.mHasDrawableDrew || (drawable = getDrawable()) == null || (aVar2 = this.mDrawableDrawListener) == null) {
            return;
        }
        aVar2.a(drawable);
    }
}
