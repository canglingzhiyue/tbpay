package com.taobao.linkmanager.afc.plugin;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.knx;
import tb.kog;
import tb.koj;

/* loaded from: classes.dex */
public class d implements koj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-656933327);
        kge.a(-1094153819);
    }

    @Override // tb.koj
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // tb.koj
    public int a(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc9b6d88", new Object[]{this, aVar})).intValue();
        }
        return 0;
    }

    @Override // tb.koj
    public void a(com.taobao.flowcustoms.afc.a aVar, String str, knx knxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01b47fa", new Object[]{this, aVar, str, knxVar});
        } else if (kog.a().b()) {
        } else {
            com.taobao.linkmanager.afc.reduction.c.a().a(aVar.K, true);
        }
    }
}
