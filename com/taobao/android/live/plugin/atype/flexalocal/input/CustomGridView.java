package com.taobao.android.live.plugin.atype.flexalocal.input;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class CustomGridView extends GridView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-676730547);
    }

    public static /* synthetic */ Object ipc$super(CustomGridView customGridView, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public CustomGridView(Context context) {
        super(context);
    }

    public CustomGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
        }
    }
}
