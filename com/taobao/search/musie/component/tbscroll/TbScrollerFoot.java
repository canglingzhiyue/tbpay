package com.taobao.search.musie.component.tbscroll;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.div.Div;
import tb.kge;

/* loaded from: classes7.dex */
public class TbScrollerFoot extends Div {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-766670372);
    }

    public TbScrollerFoot(int i) {
        super(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87585099", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            getNodeInfo().a(0, i2, i3 - i, i4);
        }
    }
}
