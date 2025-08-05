package com.taobao.android.opencart.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class FrameLayoutWrapper extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mDetachListener;

    /* loaded from: classes6.dex */
    public interface a {
        void a(View view);
    }

    public static /* synthetic */ Object ipc$super(FrameLayoutWrapper frameLayoutWrapper, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void setDetachListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1401afa0", new Object[]{this, aVar});
        } else {
            this.mDetachListener = aVar;
        }
    }

    public FrameLayoutWrapper(Context context) {
        super(context);
    }

    public FrameLayoutWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FrameLayoutWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        a aVar = this.mDetachListener;
        if (aVar == null) {
            return;
        }
        aVar.a(this);
    }
}
