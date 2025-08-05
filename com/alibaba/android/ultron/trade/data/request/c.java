package com.alibaba.android.ultron.trade.data.request;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class c implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_EXPARAMS = "exParams";

    /* renamed from: a  reason: collision with root package name */
    private String f2654a;
    private String b;
    private String c;
    private String f;
    private int i;
    private boolean j;
    private boolean d = true;
    private boolean e = true;
    private boolean g = true;
    private boolean h = false;
    private Map<String, String> k = new HashMap();
    private Map<String, String> l = new HashMap();

    static {
        kge.a(-1778270801);
        kge.a(-723128125);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : n();
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("a42dc956", new Object[0]) : new c();
    }

    public c b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("3f4ce061", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public c c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("227893a2", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public c a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("778f510b", new Object[]{this, map});
        }
        this.l = map;
        return this;
    }

    public c c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("b06b49c9", new Object[]{this, map});
        }
        this.k = map;
        return this;
    }

    public c d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("4cd94628", new Object[]{this, map});
        }
        if (this.k != null && map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    String key = entry.getKey();
                    if ("exParams".equals(key)) {
                        a(this.k, entry.getValue());
                    } else {
                        this.k.put(key, entry.getValue());
                    }
                }
            }
        } else {
            this.k = map;
        }
        return this;
    }

    private void a(Map<String, String> map, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3cea7", new Object[]{this, map, str});
        } else if (map == null || str == null) {
        } else {
            String str2 = map.get("exParams");
            if (TextUtils.isEmpty(str2)) {
                map.put("exParams", str);
                return;
            }
            JSONObject jSONObject2 = null;
            try {
                jSONObject = JSON.parseObject(str2);
                try {
                    jSONObject2 = JSON.parseObject(str);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.putAll(jSONObject2);
            map.put("exParams", jSONObject.toJSONString());
        }
    }

    public c a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("83ff985a", new Object[]{this, new Boolean(z)});
        }
        this.g = z;
        return this;
    }

    public c b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("9e1b16f9", new Object[]{this, new Boolean(z)});
        }
        this.h = z;
        return this;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f2654a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.c;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.f;
    }

    public Map<String, String> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this}) : this.k;
    }

    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this}) : this.l;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.g;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.h;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.i;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.j;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.d;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.e;
    }

    public c n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("d028cce3", new Object[]{this});
        }
        try {
            c cVar = (c) super.clone();
            cVar.c(new HashMap(this.k));
            cVar.a(new HashMap(this.l));
            return cVar;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return a();
        }
    }
}
