package com.taobao.relationship.view;

import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class FollowWeexButton extends FollowButton {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1080300470);
    }

    @Override // com.taobao.relationship.view.FollowButton
    public void refreshLayout(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c056c94c", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    public FollowWeexButton(Context context) {
        super(context);
    }

    public FollowWeexButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FollowWeexButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
