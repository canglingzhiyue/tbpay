package com.taobao.alimama.tkcps;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, b> f8456a;

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final c f8457a;

        static {
            kge.a(145505186);
            f8457a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("51085eb6", new Object[0]) : f8457a;
        }
    }

    /* loaded from: classes4.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public String f8458a;
        public long b;
        public int c;

        static {
            kge.a(-892296073);
        }

        public b(String str, long j, int i) {
            this.f8458a = str;
            this.b = j;
            this.c = i;
        }
    }

    static {
        kge.a(-308155933);
    }

    private c() {
        this.f8456a = new HashMap<>();
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("51085eb6", new Object[0]) : a.a();
    }

    public void a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{this, str, str2, new Integer(i)});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (StringUtils.isEmpty(str2) || "12".equals(str2)) {
                b(str, "e_taobao", i);
                b(str, "e_tmall", i);
            } else if ("1".equals(str2)) {
                b(str, "e_taobao", i);
            } else if ("2".equals(str2)) {
                b(str, "e_tmall", i);
            } else if ("5".equals(str2)) {
                b(str, "e_ele", i);
            }
            TaoLog.Logi("AlimamaSdk", "new update global e : " + str + ", type is: " + str2);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (StringUtils.isEmpty(str) || "12".equals(str)) {
            this.f8456a.remove("e_taobao");
            this.f8456a.remove("e_tmall");
        } else if ("1".equals(str)) {
            this.f8456a.remove("e_taobao");
        } else if ("2".equals(str)) {
            this.f8456a.remove("e_tmall");
        } else if ("5".equals(str)) {
            this.f8456a.remove("e_ele");
        }
        TaoLog.Logi("AlimamaSdk", "remove global e , type is: " + str);
    }

    public String a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{this, new Boolean(z)});
        }
        return b(z ? "e_tmall" : "e_taobao");
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        b bVar = this.f8456a.get(str);
        return a(bVar) ? bVar.f8458a : "";
    }

    private boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24b81a76", new Object[]{this, bVar})).booleanValue();
        }
        if (bVar == null) {
            return false;
        }
        long j = 86400;
        String config = OrangeConfig.getInstance().getConfig("alimama_ad", "taoke_config", "");
        try {
            JSONObject jSONObject = StringUtils.isEmpty(config) ? null : new JSONObject(config);
            if (jSONObject != null) {
                j = jSONObject.optLong("timeout", 86400L);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return (com.taobao.alimama.services.a.d().b().b() - bVar.b) / 1000 < j;
    }

    private void b(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551fca26", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        b bVar = this.f8456a.get(str2);
        if (bVar == null || bVar.c <= i || !a(bVar) || StringUtils.isEmpty(bVar.f8458a)) {
            z = false;
        }
        if (z) {
            return;
        }
        this.f8456a.put(str2, new b(str, com.taobao.alimama.services.a.d().b().b(), i));
    }
}
