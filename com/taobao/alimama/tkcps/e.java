package com.taobao.alimama.tkcps;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.io.SharedPreferencesUtils;
import com.taobao.muniontaobaosdk.util.TaoLog;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static e f8461a;
    private HashMap<String, a> b = new HashMap<>();
    private boolean c;

    static {
        kge.a(-649929653);
        f8461a = null;
    }

    private e() {
    }

    public static synchronized e a() {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("51085ef4", new Object[0]);
            }
            if (f8461a == null) {
                f8461a = new e();
            }
            return f8461a;
        }
    }

    private void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3d673e", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject == null) {
        } else {
            this.b.put("e", new a(jSONObject.optString("e"), jSONObject.optLong("timestamp") + jSONObject.optLong("leftTime"), jSONObject.optLong("timestamp") + jSONObject.optLong("cacheTime")));
            if (!z) {
                SharedPreferencesUtils.putString("pref_taoke_para_key", jSONObject.toString());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("update channel e : ");
            sb.append(jSONObject.toString());
            sb.append(z ? " from sp" : "");
            TaoLog.Logi("AlimamaSdk", sb.toString());
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        a aVar = this.b.get("e");
        if (aVar == null && !this.c) {
            String string = SharedPreferencesUtils.getString("pref_taoke_para_key", "");
            this.c = true;
            try {
                a(new JSONObject(string), true);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return (aVar == null || !a(aVar)) ? "" : a.a(aVar);
    }

    private boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("28215755", new Object[]{this, aVar})).booleanValue() : com.taobao.alimama.services.a.d().b().b() < a.b(aVar);
    }

    /* loaded from: classes4.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String b;
        private long c;
        private long d;

        static {
            kge.a(-2049784589);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d3a096f", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ long b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8efa1706", new Object[]{aVar})).longValue() : aVar.c;
        }

        private a(String str, long j, long j2) {
            this.b = str;
            this.c = j;
            this.d = j2;
        }
    }
}
