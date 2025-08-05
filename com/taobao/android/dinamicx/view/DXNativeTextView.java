package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import tb.kge;

/* loaded from: classes.dex */
public class DXNativeTextView extends TextView {
    public static long superTime;

    static {
        kge.a(-1458456428);
        superTime = 0L;
    }

    public DXNativeTextView(Context context) {
        super(context);
    }

    public DXNativeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DXNativeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
