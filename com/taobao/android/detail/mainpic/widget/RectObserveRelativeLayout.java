package com.taobao.android.detail.mainpic.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class RectObserveRelativeLayout extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mSizeChangedListener;

    /* loaded from: classes4.dex */
    public interface a {
        void a(int i, int i2, int i3, int i4);
    }

    public static /* synthetic */ Object ipc$super(RectObserveRelativeLayout rectObserveRelativeLayout, String str, Object... objArr) {
        if (str.hashCode() == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public RectObserveRelativeLayout(Context context) {
        super(context);
    }

    public RectObserveRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RectObserveRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RectObserveRelativeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        a aVar = this.mSizeChangedListener;
        if (aVar == null) {
            return;
        }
        aVar.a(i, i2, i3, i4);
    }

    public void setOnSizeChangedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe834f3", new Object[]{this, aVar});
        } else {
            this.mSizeChangedListener = aVar;
        }
    }
}
