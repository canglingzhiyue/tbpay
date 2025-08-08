package com.taobao.informationflowdataservice.dataservice.core.datasource.request;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetContainerParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetRequestParams;
import com.taobao.themis.kernel.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;
import tb.kge;
import tb.lwc;
import tb.lxo;
import tb.lxu;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1711011963);
    }

    public static void a(MtopResponse mtopResponse, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a539a663", new Object[]{mtopResponse, jSONObject});
        } else if (mtopResponse == null || mtopResponse.getMtopStat() == null) {
        } else {
            MtopStatistics mtopStat = mtopResponse.getMtopStat();
            Map<String, Double> a2 = a(mtopStat);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("request_state", (Object) a2);
            jSONObject2.put("api", (Object) mtopStat.apiKey);
            if (mtopResponse.isApiSuccess()) {
                jSONObject2.put("requestStatus", (Object) "success");
            } else {
                jSONObject2.put("requestStatus", (Object) "error");
            }
            jSONObject2.put("requestErrorType", (Object) mtopResponse.getRetCode());
            jSONObject2.put("requestErrorMsg", (Object) mtopResponse.getRetMsg());
            if (jSONObject != null) {
                jSONObject2.putAll(jSONObject);
            }
            lxu.a(a(jSONObject), 19999, "request_state_track", jSONObject2);
        }
    }

    private static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return lxu.f30977a;
        }
        String string = jSONObject.getString("containerId");
        if (StringUtils.isEmpty(string)) {
            return lxu.f30977a;
        }
        lwc a2 = lwc.a(string);
        if (a2 != null && !StringUtils.isEmpty(a2.c)) {
            return a2.c;
        }
        return lxu.f30977a;
    }

    private static Map<String, Double> a(MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d3222cfe", new Object[]{mtopStatistics});
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("totalTime", Double.valueOf(mtopStatistics.totalTime));
            hashMap.put("networkExeTime", Double.valueOf(mtopStatistics.netTotalTime));
            hashMap.put("cacheCostTime", Double.valueOf(mtopStatistics.cacheCostTime));
            hashMap.put("cacheResponseParseTime", Double.valueOf(mtopStatistics.cacheResponseParseTime));
            hashMap.put("waitExecuteTime", Double.valueOf(mtopStatistics.waitExecuteTime));
            hashMap.put("waitCallbackTime", Double.valueOf(mtopStatistics.waitCallbackTime));
            hashMap.put("signTime", Double.valueOf(mtopStatistics.computeSignTime));
            hashMap.put("wuaTime", Double.valueOf(mtopStatistics.computeWuaTime));
            hashMap.put("miniWuaTime", Double.valueOf(mtopStatistics.computeMiniWuaTime));
            hashMap.put("buildParams2NetworkTime", Double.valueOf(mtopStatistics.buildParams2NetworkTime));
            if (mtopStatistics.netStats != null) {
                hashMap.put("processTime", Double.valueOf(mtopStatistics.netStats.processTime));
                hashMap.put("firstDataTime", Double.valueOf(mtopStatistics.netStats.firstDataTime));
                hashMap.put("recDataTime", Double.valueOf(mtopStatistics.netStats.recDataTime));
                hashMap.put("oneWayTime_ANet", Double.valueOf(mtopStatistics.netStats.oneWayTime_ANet));
                hashMap.put("serverRT", Double.valueOf(mtopStatistics.netStats.serverRT));
                hashMap.put("revSize", Double.valueOf(mtopStatistics.netStats.recvSize));
                hashMap.put("dataSpeed", Double.valueOf(mtopStatistics.netStats.dataSpeed));
            }
            MtopStatistics.RbStatisticData rbStatData = mtopStatistics.getRbStatData();
            if (rbStatData != null) {
                hashMap.put("rbReqTime", Double.valueOf(rbStatData.rbReqTime));
                hashMap.put("toMainThTime", Double.valueOf(rbStatData.toMainThTime));
                hashMap.put("mtopJsonParseTime", Double.valueOf(rbStatData.jsonParseTime));
                hashMap.put("mtopReqTime", Double.valueOf(rbStatData.mtopReqTime));
            }
        } catch (Exception e) {
            lxo.a("RequestTrack", "getMeasure error", e);
        }
        return hashMap;
    }

    public static JSONObject a(AwesomeGetRequestParams awesomeGetRequestParams) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5e4ab926", new Object[]{awesomeGetRequestParams});
        }
        if (awesomeGetRequestParams == null) {
            return null;
        }
        Set<String> keySet = awesomeGetRequestParams.getContainerParams().keySet();
        Iterator<String> it = keySet.iterator();
        String str2 = "";
        if (it.hasNext()) {
            str = it.next();
            AwesomeGetContainerParams awesomeGetContainerParams = awesomeGetRequestParams.getContainerParams().get(str);
            if (awesomeGetContainerParams != null) {
                str2 = awesomeGetContainerParams.getRequestType();
            }
        } else {
            str = str2;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(i.CDN_REQUEST_TYPE, (Object) str2);
        jSONObject.put("containerId", (Object) str);
        if (keySet.size() > 1) {
            jSONObject.put("containerIds", (Object) keySet);
        }
        return jSONObject;
    }
}
