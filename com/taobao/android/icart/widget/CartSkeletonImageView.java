package com.taobao.android.icart.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes5.dex */
public class CartSkeletonImageView extends TUrlImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mConstraintWidth;
    private int mHeight;
    private int mWidth;

    static {
        kge.a(-1427096767);
    }

    public static /* synthetic */ Object ipc$super(CartSkeletonImageView cartSkeletonImageView, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public CartSkeletonImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mWidth = 0;
        this.mHeight = 0;
        this.mConstraintWidth = true;
    }

    public CartSkeletonImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWidth = 0;
        this.mHeight = 0;
        this.mConstraintWidth = true;
    }

    public CartSkeletonImageView(Context context) {
        super(context);
        this.mWidth = 0;
        this.mHeight = 0;
        this.mConstraintWidth = true;
    }

    public void setAspectRatio(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28f4de9c", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        this.mWidth = i;
        this.mHeight = i2;
        this.mConstraintWidth = z;
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.mWidth > 0 && this.mHeight > 0) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            if (this.mConstraintWidth) {
                size2 = (this.mHeight * size) / this.mWidth;
            } else {
                size = (this.mWidth * size2) / this.mHeight;
            }
            setMeasuredDimension(size, size2);
        } else {
            super.onMeasure(i, i2);
        }
    }
}
