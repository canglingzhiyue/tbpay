package com.taobao.android.icart.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.alibaba.android.ultron.vfw.widget.RoundRelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class CartRoundRelativeLayout extends RoundRelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1386954034);
    }

    public CartRoundRelativeLayout(Context context) {
        super(context);
    }

    public CartRoundRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CartRoundRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.alibaba.android.ultron.vfw.widget.RoundRelativeLayout
    public boolean isSupportClipOutline() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cbe74c58", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT >= 22;
    }
}
