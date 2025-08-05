package com.taobao.android.live.plugin.atype.flexalocal.projectscreen.model;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.dlna.DLNADeviceInfo;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DLNADeviceInfo f13990a;
    public List<DLNADeviceInfo> b;
    private String c;
    private String d;

    static {
        kge.a(1504202188);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4392cc34", new Object[0]);
        }
        a aVar = new a();
        aVar.c = "0";
        aVar.d = "0";
        return aVar;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c = "0";
        this.d = "0";
        this.b = null;
        this.f13990a = null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.c = "0";
        this.d = "1";
        this.b = null;
        this.f13990a = null;
    }

    public void a(List<DLNADeviceInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.c = "0";
        this.d = "2";
        this.b = list;
        this.f13990a = null;
    }

    public void a(DLNADeviceInfo dLNADeviceInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6134f3af", new Object[]{this, dLNADeviceInfo});
            return;
        }
        this.c = "1";
        this.d = "3";
        this.f13990a = dLNADeviceInfo;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : "0".equals(this.d);
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("showStyle", this.c);
        jSONObject.put("searchStatus", this.d);
        if (this.f13990a != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("deviceId", (Object) Long.valueOf(this.f13990a.deviceId));
            jSONObject2.put("deviceName", (Object) this.f13990a.deviceName);
            jSONObject.put("deviceSelected", (Object) jSONObject2);
        }
        List<DLNADeviceInfo> list = this.b;
        if (list != null && list.size() != 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.b.size(); i++) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("deviceId", (Object) Long.valueOf(this.b.get(i).deviceId));
                jSONObject3.put("deviceName", (Object) this.b.get(i).deviceName);
                jSONArray.add(jSONObject3);
            }
            jSONObject.put("deviceList", (Object) jSONArray);
        }
        return jSONObject;
    }
}
