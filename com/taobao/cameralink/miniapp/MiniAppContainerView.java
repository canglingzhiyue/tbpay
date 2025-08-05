package com.taobao.cameralink.miniapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class MiniAppContainerView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isVisible;
    private c visibleListener;

    static {
        kge.a(2136877342);
    }

    public static /* synthetic */ Object ipc$super(MiniAppContainerView miniAppContainerView, String str, Object... objArr) {
        if (str.hashCode() == 348684699) {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MiniAppContainerView(Context context) {
        super(context);
        this.isVisible = true;
    }

    public MiniAppContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isVisible = true;
    }

    public MiniAppContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isVisible = true;
    }

    public boolean isVisible() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue() : this.isVisible;
    }

    public void addVisibleListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e4773f4", new Object[]{this, cVar});
        } else {
            this.visibleListener = cVar;
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        try {
            if (this.visibleListener == null) {
                return;
            }
            if (i == 0) {
                this.isVisible = true;
                this.visibleListener.onShow();
                return;
            }
            this.isVisible = false;
            this.visibleListener.onHidden();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
