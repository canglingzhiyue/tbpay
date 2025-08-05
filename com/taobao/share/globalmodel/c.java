package com.taobao.share.globalmodel;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.nzn;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TBShareContent f19629a;
    private nzn b;

    static {
        kge.a(-725008868);
    }

    public TBShareContent a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBShareContent) ipChange.ipc$dispatch("1d324ac5", new Object[]{this}) : this.f19629a;
    }

    public void a(TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4f7f05", new Object[]{this, tBShareContent});
        } else {
            this.f19629a = tBShareContent;
        }
    }

    public nzn b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nzn) ipChange.ipc$dispatch("16ba229b", new Object[]{this}) : this.b;
    }

    public void a(nzn nznVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7343776", new Object[]{this, nznVar});
        } else {
            this.b = nznVar;
        }
    }
}
