package com.taobao.android.tbsku.model;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.noa;
import tb.qqy;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADDCART = "ADDCART";
    public static final String ADDCART_AND_BUYNOW = "ADDCART_AND_BUYNOW";
    public static final String BUYNOW = "BUYNOW";
    public static final String CONFIRM = "CONFIRM";
    public static final String KEY_OPEN_FROM = "openFrom";

    /* renamed from: a  reason: collision with root package name */
    public String f15432a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Map<String, String> f = new HashMap();
    public Map<String, String> g = new HashMap();
    public Map<String, String> h = new HashMap();
    public String i;
    public String j;
    public String k;
    public boolean l;
    public int m;
    public String n;
    public boolean o;
    public String p;
    public boolean q;
    public String r;
    public long s;
    public String t;
    public String u;
    public boolean v;
    public String w;

    static {
        kge.a(717590932);
    }

    public a(Intent intent) {
        String str;
        this.q = false;
        this.r = qqy.SKU_MSG_DEPRESS_SHOW_H5_SKU;
        this.v = false;
        this.w = qqy.SKU_MSG_DEPRESS_SHOW_REDIRECT_SKU;
        this.s = 0L;
        this.t = null;
        if (intent == null) {
            this.l = true;
            this.m = 9;
            this.n = qqy.SKU_MSG_INVALID_INPUT;
            return;
        }
        this.s = intent.getLongExtra("NAV_START_ACTIVITY_TIME", 0L);
        Uri data = intent.getData();
        if (data == null) {
            this.l = true;
            this.m = 9;
            this.n = qqy.SKU_MSG_INVALID_INPUT;
            return;
        }
        this.e = data.toString();
        Bundle extras = intent.getExtras();
        if (extras != null && !extras.isEmpty()) {
            for (String str2 : extras.keySet()) {
                this.f.put(str2, String.valueOf(extras.get(str2)));
            }
        }
        HashSet hashSet = new HashSet();
        try {
            String queryParameter = data.getQueryParameter(noa.KEY_MSOA_TRANS_KEY);
            if (!StringUtils.isEmpty(queryParameter)) {
                String[] split = queryParameter.split(",");
                if (split != null) {
                    for (String str3 : split) {
                        if (!StringUtils.isEmpty(str3)) {
                            hashSet.add(str3);
                        }
                    }
                }
                this.f.put(noa.KEY_MSOA_TRANS_KEY, queryParameter);
            }
            this.t = data.getQueryParameter("perfStamp");
        } catch (Throwable unused) {
        }
        Set<String> a2 = a(data, "request_key");
        Set<String> hashSet2 = new HashSet<>();
        try {
            hashSet2 = data.getQueryParameterNames();
        } catch (Throwable unused2) {
        }
        for (String str4 : hashSet2) {
            try {
                str = data.getQueryParameter(str4);
            } catch (Throwable unused3) {
                str = null;
            }
            if ("itemId".equalsIgnoreCase(str4)) {
                this.f15432a = str;
            }
            if ("skuId".equalsIgnoreCase(str4)) {
                this.b = str;
            }
            if ("bottomMode".equalsIgnoreCase(str4)) {
                this.d = str;
            }
            if ("uniqueId".equalsIgnoreCase(str4)) {
                this.c = str;
            }
            if ("extInput".equalsIgnoreCase(str4)) {
                this.i = str;
            }
            if ("skuUT".equalsIgnoreCase(str4)) {
                this.j = str;
            }
            if ("skuInnerBizName".equalsIgnoreCase(str4)) {
                this.k = str;
            }
            if ("isSourceType11".equalsIgnoreCase(str4)) {
                this.o = Boolean.parseBoolean(str);
            }
            if ("depressTBCartRefresh".equalsIgnoreCase(str4)) {
                this.p = str;
            }
            if ("sku_forbidH5".equalsIgnoreCase(str4)) {
                this.q = Boolean.parseBoolean(str);
            }
            if ("sku_forbidH5_toast".equalsIgnoreCase(str4) && !StringUtils.isEmpty(str)) {
                this.r = str;
            }
            if ("sku_forbid_redirect".equalsIgnoreCase(str4)) {
                this.v = Boolean.parseBoolean(str);
            }
            if ("sku_forbid_redirect_toast".equalsIgnoreCase(str4) && !StringUtils.isEmpty(str)) {
                this.w = str;
            }
            if ("lazyLoadSku2".equalsIgnoreCase(str4) && !StringUtils.isEmpty(str)) {
                this.u = str;
            }
            if (hashSet.contains(str4) && !StringUtils.isEmpty(str)) {
                this.f.put(str4, str);
                this.g.put(str4, str);
            }
            if (a2.contains(str4) && !StringUtils.isEmpty(str)) {
                this.f.put(str4, str);
                this.h.put(str4, str);
            }
        }
        if (StringUtils.isEmpty(this.f15432a)) {
            this.f15432a = intent.getStringExtra("itemId");
        }
        if (StringUtils.isEmpty(this.b)) {
            this.b = intent.getStringExtra("skuId");
        }
        if (StringUtils.isEmpty(this.d)) {
            this.d = intent.getStringExtra("bottomMode");
        }
        if (StringUtils.isEmpty(this.c)) {
            this.c = intent.getStringExtra("uniqueId");
        }
        if (!StringUtils.isEmpty(this.f15432a)) {
            return;
        }
        this.l = true;
        this.m = 9;
        this.n = qqy.SKU_MSG_INVALID_INPUT;
    }

    private Set<String> a(Uri uri, String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a41b6618", new Object[]{this, uri, str});
        }
        HashSet hashSet = new HashSet();
        try {
            String queryParameter = uri.getQueryParameter(str);
            if (!StringUtils.isEmpty(queryParameter) && (split = queryParameter.split(",")) != null) {
                for (String str2 : split) {
                    if (!StringUtils.isEmpty(str2)) {
                        hashSet.add(str2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return hashSet;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : "true".equalsIgnoreCase(this.p);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.o;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        JSONObject a2 = a(new JSONObject());
        String str = "ADDCART_AND_BUYNOW";
        if (!str.equalsIgnoreCase(this.d)) {
            if ("ADDCART".equalsIgnoreCase(this.d)) {
                str = "ADDCART";
            } else if ("BUYNOW".equalsIgnoreCase(this.d)) {
                str = "BUYNOW";
            } else if ("CONFIRM".equalsIgnoreCase(this.d)) {
                str = "CONFIRM";
            }
        }
        JSONObject jSONObject = a2.getJSONObject("id_biz_property");
        if (jSONObject != null) {
            jSONObject.put("skuId", (Object) this.b);
        } else {
            jSONObject = new JSONObject();
            jSONObject.put("skuId", (Object) this.b);
        }
        a2.put("id_biz_property", (Object) jSONObject);
        JSONObject jSONObject2 = a2.getJSONObject("id_biz_bottom");
        if (jSONObject2 != null) {
            jSONObject2.put("bottomMode", (Object) str);
        } else {
            jSONObject2 = new JSONObject();
            jSONObject2.put("bottomMode", (Object) str);
        }
        a2.put("id_biz_bottom", (Object) jSONObject2);
        JSONObject jSONObject3 = a2.getJSONObject("storedData");
        if (jSONObject3 != null) {
            jSONObject3.put("transparent_map", (Object) new JSONObject() { // from class: com.taobao.android.tbsku.model.IntentModel$1
                {
                    putAll(a.this.g);
                }
            });
        } else {
            jSONObject3 = new JSONObject();
            jSONObject3.put("transparent_map", (Object) new JSONObject() { // from class: com.taobao.android.tbsku.model.IntentModel$2
                {
                    putAll(a.this.g);
                }
            });
        }
        a2.put("storedData", (Object) jSONObject3);
        a2.put("enableFastSku", (Object) this.f.get("enableFastSku"));
        return a2;
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!StringUtils.isEmpty(this.i) && (parseObject = JSONObject.parseObject(this.i)) != null && !parseObject.isEmpty()) {
            for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                if (!StringUtils.isEmpty(entry.getKey())) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return jSONObject;
    }
}
