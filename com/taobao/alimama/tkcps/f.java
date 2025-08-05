package com.taobao.alimama.tkcps;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes4.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static f f8463a;
    private HashMap<String, a> b = new HashMap<>();

    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public String f8464a;
        public long b;

        static {
            kge.a(-150869441);
        }

        public a(String str, long j) {
            this.f8464a = str;
            this.b = j;
        }
    }

    static {
        kge.a(617761195);
        f8463a = null;
    }

    private f() {
    }

    public static synchronized f a() {
        synchronized (f.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("51085f13", new Object[0]);
            }
            if (f8463a == null) {
                f8463a = new f();
            }
            return f8463a;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.b.put("e", new a(str, com.taobao.alimama.services.a.d().b().b()));
            TaoLog.Logi("AlimamaSdk", "update global e : " + str);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b.remove("e");
        TaoLog.Logi("AlimamaSdk", "remove global e ");
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        a aVar = this.b.get("e");
        return (aVar == null || !a(aVar)) ? "" : aVar.f8464a;
    }

    private boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29d62ff4", new Object[]{this, aVar})).booleanValue();
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
        return (com.taobao.alimama.services.a.d().b().b() - aVar.b) / 1000 < j;
    }
}
