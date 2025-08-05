package com.taobao.taolive.sdk.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.i;
import tb.kge;
import tb.pns;

/* loaded from: classes8.dex */
public class j extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-527796594);
    }

    @Override // com.taobao.taolive.sdk.model.h
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public j(String str, int i, String str2, String str3, boolean z, String str4, String str5, i.a aVar, pns pnsVar) {
        super(str, i, str2, str3, z, str4, str5, aVar, pnsVar);
    }

    @Override // com.taobao.taolive.sdk.model.h
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SubscribeMessageServiceTask{topic='" + this.f21855a + "', mBizCode=" + this.b + ", mChannel='" + this.c + "', nick='" + this.d + "', isFandom=" + this.e + ", ext='" + this.f + "'}";
    }
}
