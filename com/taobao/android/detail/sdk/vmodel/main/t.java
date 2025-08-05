package com.taobao.android.detail.sdk.vmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.RateNode;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class t implements SubItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10444a;
    public MultiMediaModel b;
    public int c;
    public String d;
    public boolean e = true;
    public boolean f = false;
    public boolean g = false;
    public RateNode.PropRate h;

    static {
        kge.a(-1803405969);
        kge.a(1394383120);
    }

    public t() {
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.NormalImageModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.SubItemModel
    public int getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue() : this.c;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.SubItemModel
    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }
}
