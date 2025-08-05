package com.alibaba.triver.triver_shop.newShop.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import tb.kge;

/* loaded from: classes3.dex */
public final class b extends DXTemplateItem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int h;

    static {
        kge.a(-435511749);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.h;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }
}
