package com.taobao.artc.api;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class ArtcSignalRxHander {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1198685893);
    }

    public abstract void onConnected(Map<String, String> map);

    public abstract void onData(String str, byte[] bArr, Map<String, String> map);

    public abstract void onDisconnected(Map<String, String> map);

    public abstract void onResponse(String str, int i, Map<String, String> map);

    public abstract void onSendError(String str, int i, Map<String, String> map);
}
