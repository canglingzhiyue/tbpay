package com.taobao.taolive.room.controller2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ai;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.pmd;
import tb.pso;

/* loaded from: classes8.dex */
public class o implements pso {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1658797353);
        kge.a(1671809860);
    }

    @Override // tb.pso
    public void a(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a507bab7", new Object[]{this, str, str2, hashMap});
        } else {
            ai.a(com.taobao.taolive.room.utils.n.a(), str2, (Map<String, String>) hashMap);
        }
    }

    @Override // tb.pso
    public void b(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0b8616", new Object[]{this, str, str2, hashMap});
        } else {
            ai.a(com.taobao.taolive.room.utils.n.a(), str, str2, hashMap);
        }
    }

    @Override // tb.pso
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            pmd.a().m().a(str2, str3);
        }
    }
}
