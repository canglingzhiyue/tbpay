package com.taobao.alimama.tkcps;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static d f8459a;
    private static a b;

    static {
        kge.a(-1379624918);
        f8459a = new d();
    }

    private d() {
    }

    public static synchronized d a() {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("51085ed5", new Object[0]);
            }
            return f8459a;
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            b = new a(map, com.taobao.alimama.services.a.d().b().b());
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            b = null;
        }
    }

    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        a aVar = b;
        if (aVar == null) {
            return null;
        }
        if (a(aVar)) {
            return a.a(b);
        }
        TaoLog.Logd("AlimamaSdk", "cached eMap expired, auto removed");
        b();
        return null;
    }

    private boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266c7eb6", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        long j = 86400;
        String config = OrangeConfig.getInstance().getConfig("alimama_ad", "taoke_config", "");
        try {
            JSONObject jSONObject = TextUtils.isEmpty(config) ? null : new JSONObject(config);
            if (jSONObject != null) {
                j = jSONObject.optLong("timeout", 86400L);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return (com.taobao.alimama.services.a.d().b().b() - a.b(aVar)) / 1000 < j;
    }

    /* loaded from: classes4.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Map<String, String> b;
        private long c;

        static {
            kge.a(90138110);
        }

        public static /* synthetic */ Map a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("67f9f167", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ long b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8d453e67", new Object[]{aVar})).longValue() : aVar.c;
        }

        private a(Map<String, String> map, long j) {
            this.b = map;
            this.c = j;
        }
    }
}
