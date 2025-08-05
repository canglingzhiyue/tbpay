package com.taobao.android.detail.datasdk.model.viewmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class BounceImageModel implements SubItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int index;
    public MultiMediaModel parentModel;

    static {
        kge.a(-1036077711);
        kge.a(1162456369);
    }

    public BounceImageModel() {
        emu.a("com.taobao.android.detail.datasdk.model.viewmodel.main.BounceImageModel");
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
