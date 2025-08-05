package com.alipay.android.msp.ui.widget.input;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SecureEditText extends EditText {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f78048", new Object[]{this, new Integer(i)});
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b73e49", new Object[]{this, accessibilityEvent});
        }
    }

    public SecureEditText(Context context) {
        super(context);
    }

    public SecureEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SecureEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
