package com.taobao.android.detail.core.model.viewmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel;
import tb.kge;

/* loaded from: classes4.dex */
public class BaseSubItemModel implements SubItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int index;

    static {
        kge.a(-54936281);
        kge.a(1162456369);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel
    public int getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue() : this.index;
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel
    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
        } else {
            this.index = i;
        }
    }
}
