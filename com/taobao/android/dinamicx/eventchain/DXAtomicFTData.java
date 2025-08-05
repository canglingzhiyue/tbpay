package com.taobao.android.dinamicx.eventchain;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes5.dex */
public class DXAtomicFTData {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FT_ACTION_FINISH = "finish";
    public static final String FT_ACTION_NONE = "none";
    public static final String FT_ACTION_START = "start";

    /* renamed from: a  reason: collision with root package name */
    private String f11844a;
    private String b;
    private String c;
    private JSONObject d;
    private boolean e;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface FTAction {
    }

    static {
        kge.a(2041180268);
    }

    public DXAtomicFTData(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.b = jSONObject.getString("scene");
        this.f11844a = a(jSONObject.getString("action"));
        this.c = jSONObject.getString("stage");
        this.e = "true".equals(jSONObject.getString("forceParamsLog"));
        this.d = jSONObject;
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str == null) {
            return "none";
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1274442605) {
            if (hashCode == 109757538 && str.equals("start")) {
                c = 0;
            }
        } else if (str.equals("finish")) {
            c = 1;
        }
        return c != 0 ? c != 1 ? "none" : "finish" : "start";
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f11844a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.d;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e;
    }
}
