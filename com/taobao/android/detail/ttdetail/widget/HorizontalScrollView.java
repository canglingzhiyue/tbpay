package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class HorizontalScrollView extends android.widget.HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a onScrollChangedListener;

    /* loaded from: classes5.dex */
    public interface a {
        void a(View view, int i, int i2, int i3, int i4);
    }

    static {
        kge.a(1497021806);
    }

    public static /* synthetic */ Object ipc$super(HorizontalScrollView horizontalScrollView, String str, Object... objArr) {
        if (str.hashCode() == 1004220751) {
            super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public HorizontalScrollView(Context context) {
        super(context);
    }

    public void setOnScrollListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c9ca8d", new Object[]{this, aVar});
        } else {
            this.onScrollChangedListener = aVar;
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        a aVar = this.onScrollChangedListener;
        if (aVar == null) {
            return;
        }
        aVar.a(this, i, i2, i3, i4);
    }
}
