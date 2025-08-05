package com.taobao.android.sku.network;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MtopBusiness f15184a;

    static {
        kge.a(32026627);
    }

    public c(Context context, a aVar) {
        if (context == null || aVar == null) {
            return;
        }
        this.f15184a = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, context), aVar.getMtopRequest());
        this.f15184a.mo1328setUnitStrategy(aVar.getUnitStrategy());
    }

    public void a(IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2600e", new Object[]{this, iRemoteBaseListener});
            return;
        }
        MtopBusiness mtopBusiness = this.f15184a;
        if (mtopBusiness == null || iRemoteBaseListener == null) {
            return;
        }
        mtopBusiness.registerListener((IRemoteListener) iRemoteBaseListener);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        MtopBusiness mtopBusiness = this.f15184a;
        if (mtopBusiness == null) {
            return false;
        }
        mtopBusiness.startRequest();
        return true;
    }
}
