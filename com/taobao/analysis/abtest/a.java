package com.taobao.analysis.abtest;

import android.text.TextUtils;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f8539a;
    public HashMap<String, String> b;
    public long c;

    public a(String str, String str2) {
        this.b = new HashMap<>();
        this.f8539a = str;
        a(str2);
    }

    public a(String str) {
        this(str, null);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bucketId", this.c);
            JSONObject jSONObject2 = new JSONObject();
            for (String str : this.b.keySet()) {
                jSONObject2.put(str, this.b.get(str));
            }
            jSONObject.put("config", jSONObject2);
        } catch (JSONException e) {
            ALog.e("falco.UTABTestInfo", "toJson error.", null, e, new Object[0]);
        }
        return jSONObject.toString();
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.c = jSONObject.getLong("bucketId");
                JSONObject jSONObject2 = jSONObject.getJSONObject("config");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.b.put(next, jSONObject2.getString(next));
                }
            } catch (JSONException e) {
                ALog.e("falco.UTABTestInfo", "parseJson error.", null, e, new Object[0]);
            }
        }
    }
}
