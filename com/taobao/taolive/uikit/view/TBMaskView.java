package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class TBMaskView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-883101560);
    }

    public TBMaskView(Context context) {
        super(context);
    }

    public TBMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TBMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setMask(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f84e099", new Object[]{this, drawable});
        } else if (drawable == null) {
        } else {
            if (Build.VERSION.SDK_INT > 16) {
                setBackground(drawable);
            } else {
                setBackgroundDrawable(drawable);
            }
        }
    }
}
