package com.alipay.mobile.verifyidentity.safepaybase.alikeyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SecureTextView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SendAccessiBilityEventListener mSabEventListener;

    /* loaded from: classes3.dex */
    interface SendAccessiBilityEventListener {
        boolean handleAccessiBilityEvent(SecureTextView secureTextView, int i);
    }

    public static /* synthetic */ Object ipc$super(SecureTextView secureTextView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1246282167) {
            super.sendAccessibilityEventUnchecked((AccessibilityEvent) objArr[0]);
            return null;
        } else if (hashCode == -1145345097) {
            return new Boolean(super.dispatchPopulateAccessibilityEvent((AccessibilityEvent) objArr[0]));
        } else {
            if (hashCode != 2046263368) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.sendAccessibilityEvent(((Number) objArr[0]).intValue());
            return null;
        }
    }

    public SecureTextView(Context context) {
        super(context);
        this.mSabEventListener = null;
    }

    public SecureTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mSabEventListener = null;
    }

    public SecureTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSabEventListener = null;
    }

    public void setSendAccessiBilityEventListener(SendAccessiBilityEventListener sendAccessiBilityEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6162324c", new Object[]{this, sendAccessiBilityEventListener});
        } else {
            this.mSabEventListener = sendAccessiBilityEventListener;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b73e49", new Object[]{this, accessibilityEvent});
            return;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType != 65536 && eventType != 32768) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEvent(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f78048", new Object[]{this, new Integer(i)});
            return;
        }
        SendAccessiBilityEventListener sendAccessiBilityEventListener = this.mSabEventListener;
        if (sendAccessiBilityEventListener != null) {
            z = sendAccessiBilityEventListener.handleAccessiBilityEvent(this, i);
        }
        if (z) {
            return;
        }
        super.sendAccessibilityEvent(i);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bbbb6bb7", new Object[]{this, accessibilityEvent})).booleanValue() : super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
}
