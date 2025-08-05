package com.taobao.search.musie.videoscroll;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.scroller.b;
import tb.kge;

/* loaded from: classes7.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MUSVideoScroll b;

    static {
        kge.a(-810427372);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 602580) {
            super.onRealTimeScroll((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a(UINode uINode) {
        super(uINode);
        this.b = (MUSVideoScroll) uINode;
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.b, com.taobao.android.weex_uikit.widget.scroller.c
    public void onRealTimeScroll(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931d4", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onRealTimeScroll(view, i, i2, i3, i4);
        this.b.onRealTimeScroll(view, i, i2, i3, i4);
    }
}
