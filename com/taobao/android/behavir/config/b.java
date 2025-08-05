package com.taobao.android.behavir.config;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.d;
import com.taobao.android.behavix.behavixswitch.j;
import com.taobao.android.testutils.log.LogUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<BHRTaskConfig>> f9134a = new ConcurrentHashMap();
    private List<BHRTaskConfig> b = null;
    private JSONObject c = null;
    private String d = "";
    private String e = "";
    private String f = "";

    static {
        kge.a(251254906);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("cbec5005", new Object[0]) : new b();
    }

    private b() {
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        d();
        c();
        e();
    }

    public void a(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        JSONObject parseObject = JSON.parseObject(str2);
        if (parseObject == null) {
            throw new Exception("config json is null");
        }
        a(str, parseObject.getJSONArray("BHRConfigEventRuleKey"));
    }

    public void a(String str, JSONArray jSONArray) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d6dd5a", new Object[]{this, str, jSONArray});
        } else if (jSONArray != null) {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    try {
                        arrayList.add(new BHRTaskConfig(jSONObject));
                    } catch (Throwable unused) {
                    }
                }
            }
            a(str, arrayList);
        } else {
            throw new Exception("config array is empty.");
        }
    }

    public void a(String str, List<BHRTaskConfig> list) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
        } else if (list != null) {
            this.f9134a.put(str, new ArrayList(list));
            this.b = a(this.f9134a);
        } else {
            throw new Exception("config array is empty.");
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        String a2 = com.taobao.android.behavix.behavixswitch.a.a(j.a.K_UT_EVENT_FILTERS, "");
        if (TextUtils.equals(this.e, a2)) {
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(a2);
            if (parseObject != null) {
                this.c = new JSONObject(parseObject);
            } else {
                this.c = new JSONObject();
            }
        } catch (JSONException e) {
            d.a("BHRTaskConfigCenter", e);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        String a2 = com.taobao.android.behavix.behavixswitch.a.a("uppConfig", "");
        if (TextUtils.equals(this.d, a2)) {
            return;
        }
        try {
            JSONArray parseArray = JSON.parseArray(a2);
            if (parseArray != null && parseArray.size() > 0) {
                ArrayList arrayList = new ArrayList(parseArray.size());
                for (int i = 0; i < parseArray.size(); i++) {
                    arrayList.add(new BHRTaskConfig(parseArray.getJSONObject(i)));
                }
                this.f9134a.put("uppConfig", arrayList);
            }
            this.b = a(this.f9134a);
            this.d = a2;
        } catch (JSONException e) {
            d.a("BHRTaskConfigCenter", e);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        String a2 = com.taobao.android.behavix.behavixswitch.a.a("uppPlanConfig", "");
        if (TextUtils.equals(this.f, a2)) {
            return;
        }
        try {
            JSON.parseArray(a2);
            this.f = a2;
            LogUtils.c(LogUtils.BR_BIZ_NAME, "updateUPPPlanConfig", a2);
        } catch (JSONException e) {
            d.a("BHRTaskConfigCenter", e);
        }
    }

    public List<BHRTaskConfig> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this}) : this.b;
    }

    private List<BHRTaskConfig> a(Map<String, List<BHRTaskConfig>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a923a28a", new Object[]{this, map});
        }
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(100);
        for (Map.Entry<String, List<BHRTaskConfig>> entry : map.entrySet()) {
            List<BHRTaskConfig> value = entry.getValue();
            if (value != null) {
                arrayList.addAll(value);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
