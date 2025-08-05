package com.taobao.uikit.feature.features;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.MeasureCallback;
import com.taobao.uikit.feature.view.ViewHelper;
import tb.kge;

/* loaded from: classes9.dex */
public class RatioFeature extends AbsFeature<View> implements MeasureCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private static float sDefaultRatio;
    private float mRatio = sDefaultRatio;
    private int mOrientation = 0;

    public static /* synthetic */ Object ipc$super(RatioFeature ratioFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((View) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.uikit.feature.callback.MeasureCallback
    public void beforeOnMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381b14e7", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    static {
        kge.a(-1199660508);
        kge.a(-418144398);
        sDefaultRatio = 0.5f;
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void setHost(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa76c81", new Object[]{this, view});
            return;
        }
        super.setHost(view);
        view.requestLayout();
    }

    @Override // com.taobao.uikit.feature.callback.MeasureCallback
    public void afterOnMeasure(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a728ea", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.mRatio <= 0.0f) {
        } else {
            int i5 = this.mOrientation;
            if (i5 == 0) {
                i4 = View.MeasureSpec.getSize(i);
                i3 = (int) (i4 * this.mRatio);
            } else if (i5 == 1) {
                int size = View.MeasureSpec.getSize(i2);
                i4 = (int) (size * this.mRatio);
                i3 = size;
            } else {
                i3 = 0;
                z = false;
            }
            if (!z || !(getHost() instanceof ViewHelper)) {
                return;
            }
            ((ViewHelper) getHost()).setMeasuredDimension(i4, i3);
        }
    }

    public void setRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978378f0", new Object[]{this, new Float(f)});
        } else if (f <= 0.0f || this.mRatio == f) {
        } else {
            this.mRatio = f;
            if (getHost() == null) {
                return;
            }
            getHost().requestLayout();
        }
    }

    public void setOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bea80e", new Object[]{this, new Integer(i)});
        } else {
            this.mOrientation = i;
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        } else if (attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RatioFeature)) == null) {
        } else {
            this.mRatio = obtainStyledAttributes.getFloat(R.styleable.RatioFeature_uik_ratio, sDefaultRatio);
            this.mOrientation = obtainStyledAttributes.getInt(R.styleable.RatioFeature_uik_orientation, 0);
            obtainStyledAttributes.recycle();
        }
    }
}
