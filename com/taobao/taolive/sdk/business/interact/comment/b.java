package com.taobao.taolive.sdk.business.interact.comment;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import java.util.HashMap;
import java.util.Map;
import tb.cgn;
import tb.kge;
import tb.phg;

/* loaded from: classes8.dex */
public class b extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1518294913);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public b(d dVar) {
        super(dVar, true);
    }

    public void a(String str, String str2, String str3, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bc5fad", new Object[]{this, str, str2, str3, hashMap});
            return;
        }
        SendCommentsRequest sendCommentsRequest = new SendCommentsRequest();
        sendCommentsRequest.accountId = str;
        sendCommentsRequest.topic = str2;
        sendCommentsRequest.content = str3;
        sendCommentsRequest.renders = hashMap;
        a(sendCommentsRequest);
        a(1, sendCommentsRequest, SendCommentsResponse.class);
        b();
    }

    private void a(SendCommentsRequest sendCommentsRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f27e7", new Object[]{this, sendCommentsRequest});
        } else if (cgn.b() == null) {
        } else {
            String a2 = a(cgn.b().a());
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            sendCommentsRequest.extraFlag = a2;
        }
    }

    public void a(String str, String str2, String str3, HashMap<String, String> hashMap, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7fe8c38", new Object[]{this, str, str2, str3, hashMap, map});
            return;
        }
        SendCommentsRequest sendCommentsRequest = new SendCommentsRequest();
        sendCommentsRequest.accountId = str;
        sendCommentsRequest.topic = str2;
        sendCommentsRequest.content = str3;
        sendCommentsRequest.renders = hashMap;
        String a2 = a(map);
        if (!TextUtils.isEmpty(a2)) {
            sendCommentsRequest.extraFlag = a2;
        }
        a(1, sendCommentsRequest, SendCommentsResponse.class);
        b();
    }

    private String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map});
        }
        if (map == null || map.size() <= 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        if (map.keySet() != null && map.keySet().size() > 0) {
            for (String str : map.keySet()) {
                jSONObject.put(str, (Object) map.get(str));
            }
        }
        return JSON.toJSONString(jSONObject);
    }

    public void a(String str, String str2, String str3, String str4, HashMap<String, String> hashMap, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57f4de02", new Object[]{this, str, str2, str3, str4, hashMap, map});
            return;
        }
        SendCommentsRequest sendCommentsRequest = new SendCommentsRequest();
        sendCommentsRequest.accountId = str;
        sendCommentsRequest.topic = str2;
        sendCommentsRequest.relatedTopic = str3;
        sendCommentsRequest.content = str4;
        sendCommentsRequest.renders = hashMap;
        String a2 = a(map);
        if (!TextUtils.isEmpty(a2)) {
            sendCommentsRequest.extraFlag = a2;
        }
        a(1, sendCommentsRequest, SendCommentsResponse.class);
        b();
    }

    public void a(String str, String str2, String str3, String str4, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41c9f323", new Object[]{this, str, str2, str3, str4, hashMap});
            return;
        }
        SendCommentsRequest sendCommentsRequest = new SendCommentsRequest();
        sendCommentsRequest.accountId = str;
        sendCommentsRequest.topic = str2;
        sendCommentsRequest.relatedTopic = str3;
        sendCommentsRequest.content = str4;
        sendCommentsRequest.renders = hashMap;
        a(sendCommentsRequest);
        a(1, sendCommentsRequest, SendCommentsResponse.class);
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            phg.a().a("comment_test", (Map<String, String>) new HashMap());
        }
    }
}
