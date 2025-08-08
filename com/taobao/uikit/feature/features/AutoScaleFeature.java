package com.taobao.uikit.feature.features;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.LayoutCallback;
import tb.kge;

/* loaded from: classes9.dex */
public class AutoScaleFeature extends AbsFeature<TextView> implements LayoutCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float minTextSize = 10.0f;

    static {
        kge.a(-1988267308);
        kge.a(-980398080);
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void beforeOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed76dbe5", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        } else if (context == null || attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AutoScaleFeature)) == null) {
        } else {
            this.minTextSize = obtainStyledAttributes.getDimension(R.styleable.AutoScaleFeature_uik_minTextSize, 10.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public void setMinTextSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a03a55b", new Object[]{this, new Float(f)});
            return;
        }
        this.minTextSize = f;
        getHost().requestLayout();
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void afterOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4dfb28", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int width = (getHost().getWidth() - getHost().getPaddingLeft()) - getHost().getPaddingRight();
        String charSequence = getHost().getText().toString();
        if (width <= 0 || StringUtils.isEmpty(charSequence)) {
            return;
        }
        Paint paint = new Paint(getHost().getPaint());
        paint.setTextSize(getHost().getTextSize());
        float textSize = getHost().getTextSize();
        while (textSize > this.minTextSize && paint.measureText(charSequence) > width) {
            textSize -= 1.0f;
            paint.setTextSize(textSize);
        }
        getHost().setTextSize(0, textSize);
    }
}
