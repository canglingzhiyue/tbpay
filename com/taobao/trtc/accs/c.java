package com.taobao.trtc.accs;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class c implements com.taobao.trtc.signal.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1382753059);
        kge.a(-1267853980);
    }

    @Override // com.taobao.trtc.signal.b
    public String a(byte[] bArr, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("289cdeea", new Object[]{this, bArr, map}) : a.a(map.get("userId"), map.get("serviceId"), bArr);
    }
}
