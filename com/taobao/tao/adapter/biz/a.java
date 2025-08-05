package com.taobao.tao.adapter.biz;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.business.interf.IHasTaoPassword;
import tb.kge;

/* loaded from: classes8.dex */
public class a implements IHasTaoPassword {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2110262287);
        kge.a(1619183460);
    }

    @Override // com.ut.share.business.interf.IHasTaoPassword
    public boolean hasTaoPassword() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6785886e", new Object[]{this})).booleanValue() : com.taobao.share.copy.a.a().r();
    }
}
