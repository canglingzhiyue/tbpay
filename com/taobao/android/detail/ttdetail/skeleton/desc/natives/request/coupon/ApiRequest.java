package com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon;

import anetwork.channel.Response;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.sdk.vmodel.main.c;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.Unit;
import com.taobao.android.detail.ttdetail.skeleton.desc.web.d;
import com.taobao.message.message_open_api.ICallService;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import tb.kge;

/* loaded from: classes5.dex */
public class ApiRequest extends MtopRequest {
    public String httpUrl;
    public boolean post;
    public Map<String, Object> queryData;
    public Response response;
    public boolean wua;

    static {
        kge.a(765785020);
    }

    public ApiRequest() {
        setNeedSession(true);
        setApiName("wdetail");
        setVersion("1.0");
    }

    public ApiRequest(Unit unit, Map<String, String> map) {
        this(unit, map, true);
    }

    public ApiRequest(Unit unit, Map<String, String> map, boolean z) {
        if ("http".equals(unit.name)) {
            this.httpUrl = z ? d.a(unit.value, map) : unit.value;
            return;
        }
        JSONObject parseObject = JSON.parseObject(unit.value);
        if (parseObject == null) {
            return;
        }
        setApiName(com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.a.a(parseObject.get(c.K_API_NAME)));
        parseObject.remove(c.K_API_NAME);
        setVersion(com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.a.a(parseObject.get(c.K_API_VERSION)));
        parseObject.remove(c.K_API_VERSION);
        setNeedSession("true".equals(com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.a.a(parseObject.get("needLogin"))));
        parseObject.remove("needLogin");
        setNeedEcode("true".equals(com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.a.a(parseObject.get(ICallService.KEY_NEED_ECODE))));
        parseObject.remove(ICallService.KEY_NEED_ECODE);
        this.wua = "true".equals(com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.a.a(parseObject.get("wua")));
        this.queryData = new HashMap();
        for (String str : parseObject.keySet()) {
            this.queryData.put(str, parseObject.get(str));
        }
        String a2 = com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.a.a(this.queryData.get("params"));
        if (!com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.a.a(a2)) {
            setData(a2);
            return;
        }
        String a3 = com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.a.a(this.queryData.get("exParams"));
        if (!com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.a.a(a3)) {
            JSONObject parseObject2 = JSON.parseObject(a3);
            HashMap hashMap = new HashMap();
            for (String str2 : parseObject2.keySet()) {
                hashMap.put(str2, com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.a.a(parseObject2.get(str2)));
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
        if (com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.a.a(map)) {
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
