package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jhc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f29548a;

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static jhc f29549a;

        static {
            kge.a(365668710);
            f29549a = new jhc();
        }

        public static /* synthetic */ jhc a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (jhc) ipChange.ipc$dispatch("f0666d9", new Object[0]) : f29549a;
        }
    }

    static {
        kge.a(-2086208081);
    }

    private jhc() {
        this.f29548a = "TLogReply";
    }

    public static synchronized jhc a() {
        synchronized (jhc.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jhc) ipChange.ipc$dispatch("f0666d9", new Object[0]);
            }
            return a.a();
        }
    }

    public String a(String str, String str2, String str3, byte[] bArr) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("975494b3", new Object[]{this, str, str2, str3, bArr}) : new String(jhw.b(bArr), "utf-8");
    }

    public jhg a(byte[] bArr, String str, String str2, String str3) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jhg) ipChange.ipc$dispatch("ba159850", new Object[]{this, bArr, str, str2, str3});
        }
        JSONObject parseObject = JSON.parseObject(str);
        jhg jhgVar = new jhg();
        jhgVar.k = bArr;
        jhgVar.d = str3;
        jhgVar.c = str2;
        if (parseObject.containsKey("type")) {
            jhgVar.l = parseObject.getString("type");
        }
        if (parseObject.containsKey("headers")) {
            JSONObject jSONObject = (JSONObject) parseObject.get("headers");
            if (jSONObject.containsKey(jhb.appKeyName)) {
                jhgVar.f29553a = jSONObject.getString(jhb.appKeyName);
            }
            if (jSONObject.containsKey(jhb.appIdName)) {
                jhgVar.b = jSONObject.getString(jhb.appIdName);
            }
            if (jSONObject.containsKey(jhb.requestIdName)) {
                jhgVar.e = jSONObject.getString(jhb.requestIdName);
            }
            if (jSONObject.containsKey(jhb.opCodeName)) {
                jhgVar.j = jSONObject.getString(jhb.opCodeName);
            }
            if (jSONObject.containsKey(jhb.replyIdName)) {
                jhgVar.f = jSONObject.getString(jhb.replyIdName);
            }
            if (jSONObject.containsKey(jhb.replyCode)) {
                jhgVar.h = jSONObject.getString(jhb.replyCode);
            }
            if (jSONObject.containsKey(jhb.sessionIdName)) {
                jhgVar.g = jSONObject.getString(jhb.sessionIdName);
            }
            if (jSONObject.containsKey(jhb.replyMsg)) {
                jhgVar.i = jSONObject.getString(jhb.replyMsg);
            }
        }
        if (parseObject.containsKey("data")) {
            jhgVar.m = parseObject.getJSONObject("data");
        }
        return jhgVar;
    }
}
