package com.taobao.taolive.sdk.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.i;
import tb.kge;
import tb.pns;

/* loaded from: classes8.dex */
public class l extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-778688523);
    }

    @Override // com.taobao.taolive.sdk.model.h
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public l(String str, int i, String str2, String str3, boolean z, String str4, String str5, i.a aVar, pns pnsVar) {
        super(str, i, str2, str3, z, str4, str5, aVar, pnsVar);
    }

    public l(i iVar) {
        super(iVar.d(), iVar.f(), iVar.g(), iVar.h(), iVar.i(), iVar.j(), iVar.e(), iVar.l(), iVar.k() != null ? iVar.k().get() : null);
    }

    @Override // com.taobao.taolive.sdk.model.h
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UnSubscribeMessageServiceTask{topic='" + this.f21855a + "', mBizCode=" + this.b + ", mChannel='" + this.c + "', nick='" + this.d + "', isFandom=" + this.e + ", ext='" + this.f + "'}";
    }
}
