package com.flybird.deploy.model;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a implements IFBTplInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f7220a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    public static JSONObject a(a aVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f33eeea1", new Object[]{aVar});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tag", aVar.f7220a).put("tplId", aVar.b).put("tplHash", aVar.d).put("tplVersion", aVar.c).put("publishVersion", aVar.e).put("time", aVar.f);
        return jSONObject;
    }

    public static String b(a aVar) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("300e31ec", new Object[]{aVar}) : a(aVar).toString();
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FBBasicTplInfo{tag='" + this.f7220a + "', tplId='" + this.b + "', tplHash='" + this.d + "', tplVersion='" + this.c + "', publishVersion='" + this.e + "', time='" + this.f + "'}";
    }
}
