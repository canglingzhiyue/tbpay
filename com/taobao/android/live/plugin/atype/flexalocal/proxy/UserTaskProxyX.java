package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.TBLiveBaseCommonPlugin;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.a;
import com.taobao.android.live.plugin.proxy.usertask.IUserTaskProxy;
import com.taobao.android.live.plugin.proxy.usertask.g;
import com.taobao.android.live.plugin.proxy.usertask.i;
import tb.kge;

/* loaded from: classes6.dex */
public class UserTaskProxyX implements IUserTaskProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-273500089);
        kge.a(-1530485241);
    }

    @Override // com.taobao.android.live.plugin.proxy.usertask.IUserTaskProxy
    public g createUserController(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("299de01a", new Object[]{this, str, str2}) : new a(str, str2);
    }

    @Override // com.taobao.android.live.plugin.proxy.usertask.IUserTaskProxy
    public i createWVPluginClass() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("bf21730b", new Object[]{this}) : new TBLiveBaseCommonPlugin();
    }
}
