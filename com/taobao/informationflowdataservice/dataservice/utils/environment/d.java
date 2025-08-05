package com.taobao.informationflowdataservice.dataservice.utils.environment;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import tb.kge;

/* loaded from: classes7.dex */
public class d implements com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(73603055);
        kge.a(131230117);
    }

    @Override // com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.c
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : Login.getOldNick();
    }

    @Override // com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.c
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : Login.getOldUserId();
    }

    @Override // com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.c
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : Login.getOldEncryptedUserId();
    }
}
