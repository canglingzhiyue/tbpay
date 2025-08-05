package com.taobao.taolive.message_sdk.mtop.heart;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import tb.pek;
import tb.pmd;

/* loaded from: classes8.dex */
public class a extends pek {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public a(d dVar, int i) {
        super(dVar, i, true);
    }

    public void a(int i, String str, String str2, long j, List<Long> list, long j2, long j3, HashMap<String, String> hashMap, HashSet<String> hashSet) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("413c2b40", new Object[]{this, new Integer(i), str, str2, new Long(j), list, new Long(j2), new Long(j3), hashMap, hashSet});
            return;
        }
        HeartbeatReportRequest heartbeatReportRequest = new HeartbeatReportRequest();
        heartbeatReportRequest.setBizCode(i);
        heartbeatReportRequest.setTopic(str);
        heartbeatReportRequest.setSessionId(str2);
        heartbeatReportRequest.setStage(j);
        heartbeatReportRequest.setStatusList(JSON.toJSONString(list));
        heartbeatReportRequest.setTimestamp(pmd.a().w().a());
        heartbeatReportRequest.setIncRemainTime(j2);
        heartbeatReportRequest.setRemainTime(j3);
        heartbeatReportRequest.setExtra(hashMap);
        HashMap hashMap2 = new HashMap();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next != null && (split = next.split(":")) != null) {
                if (split.length == 4) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", (Object) split[1]);
                    jSONObject.put("type", (Object) split[2]);
                    jSONObject.put("t", (Object) split[3]);
                    String str3 = split[0];
                    char c = 65535;
                    int hashCode = str3.hashCode();
                    if (hashCode != 48625) {
                        switch (hashCode) {
                            case 49:
                                if (str3.equals("1")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 50:
                                if (str3.equals("2")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 51:
                                if (str3.equals("3")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                    } else if (str3.equals("100")) {
                        c = 3;
                    }
                    if (c == 0) {
                        jSONArray.add(jSONObject);
                    } else if (c == 1) {
                        jSONArray2.add(jSONObject);
                    } else if (c == 2) {
                        jSONArray3.add(jSONObject);
                    } else if (c == 3) {
                        jSONArray4.add(jSONObject);
                    }
                }
            }
        }
        hashMap2.put("step1", jSONArray);
        hashMap2.put("step2", jSONArray2);
        hashMap2.put("step3", jSONArray3);
        hashMap2.put("step100", jSONArray4);
        heartbeatReportRequest.setReceiveMsg(hashMap2);
        a(1, heartbeatReportRequest, HeartbeatReportResponse.class);
    }
}
