package com.alipay.mobile.verifyidentity.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class APRelativeLayout extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(APRelativeLayout aPRelativeLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2079798281) {
            super.setOnClickListener((View.OnClickListener) objArr[0]);
            return null;
        } else if (hashCode != 650865254) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public APRelativeLayout(Context context) {
        super(context);
    }

    public APRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public APRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            if (getLayoutParams() == null) {
                setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
            } else {
                super.onMeasure(i, i2);
            }
        } catch (Exception e) {
            StringBuffer stringBuffer = new StringBuffer("APRelativeLayout:" + getId());
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != null) {
                    stringBuffer.append("|" + childAt.getId());
                }
            }
            throw new IllegalStateException(stringBuffer.toString(), e);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            super.setOnClickListener(APViewEventHelper.wrapClickListener(onClickListener));
        }
    }
}
