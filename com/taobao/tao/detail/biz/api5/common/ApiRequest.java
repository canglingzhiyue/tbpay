package com.taobao.tao.detail.biz.api5.common;

import anetwork.channel.Response;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.sdk.utils.l;
import com.taobao.android.detail.sdk.vmodel.main.c;
import com.taobao.detail.domain.base.Unit;
import com.taobao.message.message_open_api.ICallService;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import tb.kge;
import tb.rjq;
import tb.rjr;
import tb.tpc;

/* loaded from: classes8.dex */
public class ApiRequest extends MtopRequest {
    public String httpUrl;
    public boolean post;
    public Map<String, Object> queryData;
    public Response response;
    public boolean wua;

    static {
        kge.a(-923940449);
    }

    public ApiRequest() {
        setNeedSession(true);
        setApiName("wdetail");
        setVersion("1.0");
        tpc.a("com.taobao.tao.detail.biz.api5.common.ApiRequest");
    }

    public ApiRequest(Unit unit, Map<String, String> map) {
        this(unit, map, true);
    }

    public ApiRequest(Unit unit, Map<String, String> map, boolean z) {
        tpc.a("com.taobao.tao.detail.biz.api5.common.ApiRequest");
        if ("http".equals(unit.name)) {
            this.httpUrl = z ? l.a(unit.value, map) : unit.value;
            return;
        }
        JSONObject parseObject = JSON.parseObject(unit.value);
        if (parseObject == null) {
            return;
        }
        setApiName(rjr.a(parseObject.get(c.K_API_NAME)));
        parseObject.remove(c.K_API_NAME);
        setVersion(rjr.a(parseObject.get(c.K_API_VERSION)));
        parseObject.remove(c.K_API_VERSION);
        setNeedSession("true".equals(rjr.a(parseObject.get("needLogin"))));
        parseObject.remove("needLogin");
        setNeedEcode("true".equals(rjr.a(parseObject.get(ICallService.KEY_NEED_ECODE))));
        parseObject.remove(ICallService.KEY_NEED_ECODE);
        this.wua = "true".equals(rjr.a(parseObject.get("wua")));
        this.queryData = new HashMap();
        for (String str : parseObject.keySet()) {
            this.queryData.put(str, parseObject.get(str));
        }
        String a2 = rjr.a(this.queryData.get("params"));
        if (!rjq.a(a2)) {
            setData(a2);
            return;
        }
        String a3 = rjr.a(this.queryData.get("exParams"));
        if (!rjq.a(a3)) {
            JSONObject parseObject2 = JSON.parseObject(a3);
            HashMap hashMap = new HashMap();
            for (String str2 : parseObject2.keySet()) {
                hashMap.put(str2, rjr.a(parseObject2.get(str2)));
            }
            this.queryData.put("exParams", appendOriginalQuery(hashMap, map));
        }
        setDataString();
    }

    private Map<String, String> appendOriginalQuery(Map<String, String> map, Map<String, String> map2) {
        if (map2 == null || map2.isEmpty()) {
            return map;
        }
        HashMap hashMap = new HashMap(map2);
        if (rjq.a(map)) {
            return hashMap;
        }
        hashMap.putAll(map);
        return hashMap;
    }

    private void setDataString() {
        Map<String, Object> map = this.queryData;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.queryData.get(str);
                if (!(obj instanceof String)) {
                    this.queryData.put(str, JSON.toJSONString(obj));
                }
            }
            setData(JSON.toJSONString(this.queryData));
        }
    }
}
