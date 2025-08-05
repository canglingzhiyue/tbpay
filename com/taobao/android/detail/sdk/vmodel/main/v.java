package com.taobao.android.detail.sdk.vmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class v implements SubItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10447a;
    public String b;
    public String c;
    public String d;
    public String e;
    public MultiMediaModel f;
    public int g = -1;
    public int h = 0;
    public boolean i = true;
    public int j;

    static {
        kge.a(1088744794);
        kge.a(1394383120);
    }

    public v() {
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.PanoramaModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.SubItemModel
    public int getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue() : this.j;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.SubItemModel
    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }
}
