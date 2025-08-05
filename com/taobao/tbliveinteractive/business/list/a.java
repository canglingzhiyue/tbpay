package com.taobao.tbliveinteractive.business.list;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import java.util.HashMap;
import tb.kge;
import tb.pqj;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1447225895);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a507bab7", new Object[]{this, str, str2, hashMap});
            return;
        }
        JSONObject b = pqj.b(str);
        if (b == null) {
            return;
        }
        InteractiveNeedShowRequest interactiveNeedShowRequest = new InteractiveNeedShowRequest();
        interactiveNeedShowRequest.setAPI_NAME(b.getString("api"));
        interactiveNeedShowRequest.setVERSION(b.getString("version"));
        interactiveNeedShowRequest.liveId = hashMap.get("live_id");
        interactiveNeedShowRequest.anchorId = hashMap.get("account_id");
        interactiveNeedShowRequest.source = hashMap.get("livesource");
        interactiveNeedShowRequest.componentName = str2;
        interactiveNeedShowRequest.liveUrl = hashMap.get("liveUrl");
        interactiveNeedShowRequest.extendParams = b(hashMap);
        a(1, (INetDataObject) interactiveNeedShowRequest, InteractiveNeedShowResponse.class, false, true);
    }

    private String b(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c9b22b6", new Object[]{this, hashMap});
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("roomType", hashMap.get("roomType"));
        hashMap2.put("newRoomType", hashMap.get("newRoomType"));
        hashMap2.put("isLandScape", hashMap.get("isLandScape"));
        return pqj.a(hashMap2);
    }
}
