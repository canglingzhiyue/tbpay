package com.alipay.android.msp.ui.widget;

import com.alipay.android.msp.drivers.actions.EventAction;

/* loaded from: classes3.dex */
public class MspDialogButton {
    public EventAction mEventAction;
    public String mText;

    public MspDialogButton() {
    }

    public MspDialogButton(String str, EventAction eventAction) {
        this.mText = str;
        this.mEventAction = eventAction;
    }
}
