package com.alibaba.poplayer.layermanager.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.v;
import tb.kge;

/* loaded from: classes3.dex */
public class PopLayerViewContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Canvas mPageCanvas;

    static {
        kge.a(-608649193);
    }

    public PopLayerViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context);
    }

    public PopLayerViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context);
    }

    public PopLayerViewContainer(Context context) {
        super(context);
        initialize(context);
    }

    private void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
            return;
        }
        this.mPageCanvas = new Canvas(context);
        if (Build.VERSION.SDK_INT >= 16) {
            this.mPageCanvas.setImportantForAccessibility(2);
        }
        setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_IGNORE);
        addView(this.mPageCanvas, new FrameLayout.LayoutParams(-1, -1));
        c.a("PopLayerViewContainer.initialize.success?this=%s", this);
    }

    public Canvas getCanvas() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Canvas) ipChange.ipc$dispatch("dcb0be09", new Object[]{this}) : this.mPageCanvas;
    }
}
