package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class ObserverFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mOnSizeChangedListener;

    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);
    }

    static {
        kge.a(1468780585);
    }

    public static /* synthetic */ Object ipc$super(ObserverFrameLayout observerFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ObserverFrameLayout(Context context) {
        super(context);
    }

    public ObserverFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObserverFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i == 0 || i == i3 || (aVar = this.mOnSizeChangedListener) == null) {
            return;
        }
        aVar.a(i);
    }

    public void setOnSizeChangedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8353dce", new Object[]{this, aVar});
            return;
        }
        int width = getWidth();
        this.mOnSizeChangedListener = aVar;
        a aVar2 = this.mOnSizeChangedListener;
        if (aVar2 == null || width <= 0) {
            return;
        }
        aVar2.a(width);
    }
}
