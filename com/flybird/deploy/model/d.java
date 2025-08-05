package com.flybird.deploy.model;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class d implements IFBTplInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f7225a;

    private d() {
    }

    public static d a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("d04f910c", new Object[]{str});
        }
        d dVar = new d();
        dVar.f7225a = str;
        return dVar;
    }

    public static JSONObject a(d dVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e7439b3e", new Object[]{dVar});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tplId", dVar.f7225a);
        return jSONObject;
    }

    public static String b(d dVar) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d9126f", new Object[]{dVar}) : a(dVar).toString();
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f7225a;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FBSimpleTplInfo{tplId='" + this.f7225a + "'}";
    }
}
