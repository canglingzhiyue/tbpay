package com.taobao.android.detail.ttdetail.component.module;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.a;
import tb.ezh;
import tb.ezi;

/* loaded from: classes4.dex */
public class b implements ezh.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a.C0406a f10537a;

    public b(a.C0406a c0406a) {
        this.f10537a = c0406a;
    }

    @Override // tb.ezh.c
    public void a(ezi eziVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d65404", new Object[]{this, eziVar});
            return;
        }
        com.taobao.android.detail.ttdetail.utils.i.a("BarrageComponent", "downLoadTemplates onSuccess:" + eziVar.toString());
    }

    @Override // tb.ezh.c
    public void a(ezi eziVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fd804ce", new Object[]{this, eziVar, str});
            return;
        }
        com.taobao.android.detail.ttdetail.utils.i.a("BarrageComponent", "downLoadTemplates onFailure:" + str + " info:" + eziVar.a());
    }
}
