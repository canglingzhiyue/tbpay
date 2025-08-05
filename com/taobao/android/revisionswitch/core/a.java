package com.taobao.android.revisionswitch.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bucket", this.b);
            JSONObject jSONObject2 = new JSONObject();
            for (String str : this.f14887a.b()) {
                jSONObject2.put(str, this.f14887a.a(str));
            }
            jSONObject.put("switch", jSONObject2);
            return jSONObject.toString();
        } catch (JSONException e) {
            TLog.loge("DosaSwitch", "JSONException " + e.getMessage());
            return null;
        }
    }
}
