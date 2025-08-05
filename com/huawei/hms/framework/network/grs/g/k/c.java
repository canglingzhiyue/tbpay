package com.huawei.hms.framework.network.grs.g.k;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final GrsBaseInfo f7435a;
    private final Context b;
    private final Set<String> c = new HashSet();

    public c(GrsBaseInfo grsBaseInfo, Context context) {
        this.f7435a = grsBaseInfo;
        this.b = context;
    }

    private String e() {
        Set<String> b = com.huawei.hms.framework.network.grs.f.b.a(this.b.getPackageName(), this.f7435a).b();
        if (b.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String str : b) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put(ServiceNode.TAG, jSONArray);
            Logger.i("GrsRequestInfo", "post service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    private String f() {
        Logger.v("GrsRequestInfo", "getGeoipService enter");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String str : this.c) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put(ServiceNode.TAG, jSONArray);
            Logger.v("GrsRequestInfo", "post query service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public Context a() {
        return this.b;
    }

    public void a(String str) {
        this.c.add(str);
    }

    public GrsBaseInfo b() {
        return this.f7435a;
    }

    public String c() {
        return this.c.size() == 0 ? e() : f();
    }

    public Set<String> d() {
        return this.c;
    }
}
