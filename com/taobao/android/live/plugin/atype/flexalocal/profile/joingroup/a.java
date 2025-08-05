package com.taobao.android.live.plugin.atype.flexalocal.profile.joingroup;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1918812841);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        JoingroupRequest joingroupRequest = new JoingroupRequest();
        joingroupRequest.groupId = str;
        HashMap hashMap = new HashMap();
        hashMap.put("app", "live_fans_chat_group");
        joingroupRequest.properties = hashMap;
        a(0, joingroupRequest, (Class<?>) null);
    }
}
