package com.taobao.android.detail.mainpic.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.mainpic.g;

/* loaded from: classes4.dex */
public class VesselViewRootLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private g mainPicInstance;

    public VesselViewRootLayout(Context context) {
        super(context);
    }

    public VesselViewRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VesselViewRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setNewMainPicInstance(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3da10b4", new Object[]{this, gVar});
        } else {
            this.mainPicInstance = gVar;
        }
    }

    public g getNewMainPicInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("56968356", new Object[]{this}) : this.mainPicInstance;
    }
}
