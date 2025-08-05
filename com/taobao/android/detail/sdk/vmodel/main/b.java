package com.taobao.android.detail.sdk.vmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class b implements SubItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MultiMediaModel f10421a;
    private int b;

    static {
        kge.a(-1830118960);
        kge.a(1394383120);
    }

    public b() {
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.BounceImageModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.SubItemModel
    public int getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue() : this.b;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.SubItemModel
    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }
}
