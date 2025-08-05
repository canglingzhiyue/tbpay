package com.alipay.android.msp.network.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
public class RpcRequestData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f4938a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;

    public String getMspParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d35400", new Object[]{this}) : this.p;
    }

    public void setMspParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f748676", new Object[]{this, str});
        } else {
            this.p = str;
        }
    }

    public String getNamespace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("79c37174", new Object[]{this}) : this.e;
    }

    public void setNamespace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e878ea", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public String getApi_name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ea4b7b3", new Object[]{this}) : this.g;
    }

    public void setApi_name(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cf9923", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public String getApi_version() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8c3c49c", new Object[]{this}) : this.n;
    }

    public void setApi_version(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("776bfdc2", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public String getParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("63f8f7fd", new Object[]{this}) : this.d;
    }

    public void setParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacff519", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String getAuth_key() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("93fa5cfb", new Object[]{this}) : this.f4938a;
    }

    public void setAuth_key(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("762e9cdb", new Object[]{this, str});
        } else {
            this.f4938a = str;
        }
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.f;
    }

    public void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public String getUser_agent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dde5b3d2", new Object[]{this}) : this.b;
    }

    public void setUser_agent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ba4de4", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String getDevice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b1ef52d", new Object[]{this}) : this.h;
    }

    public void setDevice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98699de9", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public String getSession() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("59f62c99", new Object[]{this}) : this.i;
    }

    public void setSession(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd2ef65", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public String getTid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("12a13f40", new Object[]{this}) : this.j;
    }

    public void setTid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30138b9e", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public String getImsi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8e6b9a09", new Object[]{this}) : this.k;
    }

    public void setImsi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d386e78d", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public String getImei() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7fb5387b", new Object[]{this}) : this.l;
    }

    public void setImei(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b71175b", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public String getMac() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5683d280", new Object[]{this}) : this.m;
    }

    public void setMac(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6883605e", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public String getOs_id() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c48fa359", new Object[]{this}) : this.c;
    }

    public void setOs_id(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3d5da5", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void setDispatchType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa0be67", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public Map<String, String> getKeyValueMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ca78bdf0", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("namespace", this.e);
        hashMap.put("api_name", this.g);
        hashMap.put("api_version", this.n);
        hashMap.put("params", this.d);
        hashMap.put("auth_key", this.f4938a);
        hashMap.put("version", this.f);
        hashMap.put("user_agent", this.b);
        hashMap.put(MspGlobalDefine.SESSION, this.i);
        hashMap.put("tid", this.j);
        hashMap.put("imei", this.l);
        hashMap.put("imsi", this.k);
        hashMap.put("dispatchtype", this.o);
        hashMap.put("mspParam", this.p);
        return hashMap;
    }

    public JSONObject toJsonParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8ca6490", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("namespace", (Object) this.e);
        jSONObject.put("api_name", (Object) this.g);
        jSONObject.put("api_version", (Object) this.n);
        jSONObject.put("params", JSON.parse(this.d));
        jSONObject.put("auth_key", (Object) this.f4938a);
        jSONObject.put("version", (Object) this.f);
        jSONObject.put("user_agent", (Object) this.b);
        jSONObject.put(MspGlobalDefine.SESSION, (Object) this.i);
        jSONObject.put("tid", (Object) this.j);
        jSONObject.put("imei", (Object) this.l);
        jSONObject.put("imsi", (Object) this.k);
        return jSONObject;
    }
}
