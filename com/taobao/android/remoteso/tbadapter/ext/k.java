package com.taobao.android.remoteso.tbadapter.ext;

import com.android.alibaba.ip.runtime.IpChange;
import tb.ihl;
import tb.ihr;
import tb.iia;
import tb.ijc;
import tb.kpt;

/* loaded from: classes6.dex */
public class k implements ihr.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ijc f14865a;

    public k(ijc ijcVar) {
        this.f14865a = ijcVar;
    }

    @Override // tb.ihr.b
    public iia a(ihl ihlVar, iia iiaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iia) ipChange.ipc$dispatch("a5dc650b", new Object[]{this, ihlVar, iiaVar}) : new kpt(iiaVar, ihlVar.f, ihlVar.b, this.f14865a);
    }
}
