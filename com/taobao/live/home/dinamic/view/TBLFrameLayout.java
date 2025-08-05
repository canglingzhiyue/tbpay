package com.taobao.live.home.dinamic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mfj;

/* loaded from: classes7.dex */
public class TBLFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.taobao.taolivecontainer.b mBuilder;

    public static /* synthetic */ Object ipc$super(TBLFrameLayout tBLFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TBLFrameLayout(Context context) {
        super(context);
    }

    public TBLFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TBLFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TBLFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setTBLiveH5ContainerBuilder(com.taobao.taolivecontainer.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef9425e", new Object[]{this, bVar});
        } else {
            this.mBuilder = bVar;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        if (this.mBuilder == null) {
            return;
        }
        mfj.c("DXTBLVWebViewWidgetNode", "TBLFrameLayout onDetachedFromWindow" + this);
        this.mBuilder.e();
        this.mBuilder = null;
    }
}
