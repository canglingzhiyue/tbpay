package com.taobao.android.detail.industry.ablility.views;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.arflow.ARTryViewContainer;
import tb.kge;

/* loaded from: classes4.dex */
public class ARMakeupNativeView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ARMakeupNativeView";
    private ARTryViewContainer arTryViewContainer;

    static {
        kge.a(845469440);
    }

    public ARMakeupNativeView(Context context) {
        super(context);
    }

    public ARMakeupNativeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ARMakeupNativeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.arTryViewContainer = new ARTryViewContainer(context, (AttributeSet) null);
        this.arTryViewContainer.init((Activity) context);
        addView(this.arTryViewContainer, new ViewGroup.LayoutParams(-1, -1));
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ARTryViewContainer aRTryViewContainer = this.arTryViewContainer;
        if (aRTryViewContainer != null) {
            aRTryViewContainer.destroy();
        }
        removeView(this.arTryViewContainer);
        this.arTryViewContainer = null;
    }

    public ARTryViewContainer getArTryViewContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ARTryViewContainer) ipChange.ipc$dispatch("e4186b6c", new Object[]{this}) : this.arTryViewContainer;
    }
}
