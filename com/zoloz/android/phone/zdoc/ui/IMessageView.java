package com.zoloz.android.phone.zdoc.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class IMessageView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1463167209);
    }

    public abstract void clearClickListener();

    public void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
        }
    }

    public abstract void setOnConfirmListener(View.OnClickListener onClickListener);

    public abstract void setOnReTakePhotoListener(View.OnClickListener onClickListener);

    public abstract void setOnTakePhotoListener(View.OnClickListener onClickListener);

    public abstract void setUiLocation(int i, String str, int i2, int i3, int i4, int i5);

    public abstract void updateMaskAlpha(float f);

    public abstract void updateMessage(int i);

    public abstract void updateUI(UIState uIState, int i, int i2);

    public IMessageView(Context context) {
        super(context);
        init(context, null);
    }

    public IMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public IMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
