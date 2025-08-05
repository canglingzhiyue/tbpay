package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeTextView;

/* loaded from: classes5.dex */
public class RichTextViewImpl extends DXNativeTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9d3566", new Object[]{this, typeface});
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9509ea5d", new Object[]{this, typeface, new Integer(i)});
        }
    }

    public RichTextViewImpl(Context context) {
        super(context);
    }

    public RichTextViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RichTextViewImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
