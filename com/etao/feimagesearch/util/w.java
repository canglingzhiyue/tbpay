package com.etao.feimagesearch.util;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import tb.com;
import tb.kge;

/* loaded from: classes4.dex */
public class w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(765127720);
    }

    public static MtopBusiness a(String str, String str2, Map<String, String> map, IRemoteBaseListener iRemoteBaseListener, boolean z, boolean z2) {
        TBLocationDTO a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("4daf8947", new Object[]{str, str2, map, iRemoteBaseListener, new Boolean(z), new Boolean(z2)});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str);
        mtopRequest.setVersion(str2);
        mtopRequest.setNeedEcode(z);
        if (map != null) {
            mtopRequest.setData(JSONObject.toJSONString(map));
        }
        MtopBusiness build = MtopBusiness.build(mtopRequest, com.c());
        if (com.etao.feimagesearch.config.b.aW() && (a2 = q.Companion.a()) != null) {
            build.getMtopInstance().setCoordinates(a2.longitude, a2.latitude);
        }
        if (iRemoteBaseListener != null) {
            build.registerListener((IRemoteListener) iRemoteBaseListener);
        }
        if (z2) {
            build.mo1305reqMethod(MethodEnum.POST);
        }
        build.startRequest();
        return build;
    }

    public static MtopBusiness a(String str, String str2, JSONObject jSONObject, IRemoteBaseListener iRemoteBaseListener, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("da5caa2", new Object[]{str, str2, jSONObject, iRemoteBaseListener, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str);
        mtopRequest.setVersion(str2);
        mtopRequest.setNeedEcode(z);
        mtopRequest.setNeedSession(z3);
        if (jSONObject != null) {
            mtopRequest.setData(jSONObject.toJSONString());
        }
        MtopBusiness build = MtopBusiness.build(mtopRequest, com.c());
        if (iRemoteBaseListener != null) {
            build.registerListener((IRemoteListener) iRemoteBaseListener);
        }
        if (z2) {
            build.mo1305reqMethod(MethodEnum.POST);
        }
        build.startRequest();
        return build;
    }

    public static Map<String, String> a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49ed9a08", new Object[]{str, map});
        }
        if (!com.etao.feimagesearch.config.b.bx()) {
            return map;
        }
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            List asList = Arrays.asList(com.etao.feimagesearch.config.b.bJ());
            List asList2 = Arrays.asList(com.etao.feimagesearch.config.b.bf());
            List asList3 = Arrays.asList(com.etao.feimagesearch.config.b.bg());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(value)) {
                    if (asList3.contains(key)) {
                        hashMap.put(key, value);
                    } else if (asList2.contains(key)) {
                        hashMap.put(key, value);
                    } else if (asList.contains(key)) {
                        hashMap.put(key, value);
                    } else {
                        hashMap2.put(key, value);
                    }
                }
            }
            if (Arrays.asList(com.etao.feimagesearch.config.b.by()).contains(str)) {
                hashMap.put("passThroughParams", JSON.toJSONString(hashMap2));
            }
        }
        return hashMap;
    }
}
