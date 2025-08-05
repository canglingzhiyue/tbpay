package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class DXMeasuredTextView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final long mInitThreadId;

    static {
        kge.a(1895989635);
    }

    public static /* synthetic */ Object ipc$super(DXMeasuredTextView dXMeasuredTextView, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public DXMeasuredTextView(Context context) {
        super(context);
        this.mInitThreadId = Thread.currentThread().getId();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    public long getInitThreadId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("539b5f66", new Object[]{this})).longValue() : this.mInitThreadId;
    }
}
