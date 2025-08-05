package com.taobao.android.detail.core.detail.kit.view.widget.main;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class WidthVariableImageView extends DetailImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int DEFAULT_HEIGHT;
    private static final int DEFAULT_MAX_WIDTH;
    private static final int DEFAULT_MIN_WIDTH;
    private int mHeight;
    private int mMaxWidth;
    private int mMinWidth;

    public static /* synthetic */ Object ipc$super(WidthVariableImageView widthVariableImageView, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-653639871);
        DEFAULT_MIN_WIDTH = epo.i;
        DEFAULT_MAX_WIDTH = (int) (epo.f27511a * 60.0f);
        DEFAULT_HEIGHT = epo.i;
    }

    public WidthVariableImageView(Context context) {
        super(context);
        init();
    }

    public WidthVariableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public WidthVariableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mMinWidth = DEFAULT_MIN_WIDTH;
        this.mMaxWidth = DEFAULT_MAX_WIDTH;
        this.mHeight = DEFAULT_HEIGHT;
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.main.WidthVariableImageView");
    }

    public void setWidthRange(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("618eb580", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i < 0 || i2 < 0 || i > i2) {
        } else {
            this.mMinWidth = i;
            this.mMaxWidth = i2;
        }
    }

    public void setHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
        } else if (i < 0) {
        } else {
            this.mHeight = i;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int i3 = this.mHeight;
            int ceil = (int) Math.ceil((i3 * drawable.getIntrinsicWidth()) / drawable.getIntrinsicHeight());
            int i4 = this.mMinWidth;
            if (ceil < i4) {
                ceil = i4;
            }
            int i5 = this.mMaxWidth;
            if (ceil > i5) {
                ceil = i5;
            }
            setMeasuredDimension(ceil, i3);
            return;
        }
        super.onMeasure(i, i2);
    }
}
