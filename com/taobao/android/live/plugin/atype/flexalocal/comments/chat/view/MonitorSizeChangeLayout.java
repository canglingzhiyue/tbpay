package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hkk;
import tb.kge;

/* loaded from: classes5.dex */
public class MonitorSizeChangeLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mSizeChangeListener;

    /* loaded from: classes5.dex */
    public interface a {
        void a(int i, int i2, int i3, int i4);
    }

    static {
        kge.a(113930547);
    }

    public static /* synthetic */ Object ipc$super(MonitorSizeChangeLayout monitorSizeChangeLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode != 1389530587) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
    }

    public MonitorSizeChangeLayout(Context context) {
        super(context);
    }

    public MonitorSizeChangeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MonitorSizeChangeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (hkk.W()) {
            super.onMeasure(i, i2);
        } else {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            super.onMeasure(i, i2);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if ((size == measuredWidth && size2 == measuredHeight) || (aVar = this.mSizeChangeListener) == null) {
                return;
            }
            aVar.a(size, size2, measuredWidth, measuredHeight);
        }
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
        if (!hkk.W()) {
            return;
        }
        if ((i4 == i2 && i3 == i) || (aVar = this.mSizeChangeListener) == null) {
            return;
        }
        aVar.a(i3, i4, i, i2);
    }

    public void setOnSizeChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b37a8ac", new Object[]{this, aVar});
        } else {
            this.mSizeChangeListener = aVar;
        }
    }
}
