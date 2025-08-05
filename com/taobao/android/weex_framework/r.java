package com.taobao.android.weex_framework;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import tb.kge;

/* loaded from: classes6.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile String f16073a;
    private volatile String b;
    private volatile String c;
    private volatile String d;
    private volatile String e;
    private volatile String f;
    private volatile boolean g;
    private volatile boolean h;
    private volatile MUSInstanceConfig.MUSRenderType i;
    private volatile int j;

    static {
        kge.a(1036186937);
    }

    public r() {
    }

    public r(String str, String str2) {
        this.b = str;
        this.e = str2;
    }

    public r(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public r(r rVar, String str, String str2) {
        String str3 = "";
        this.b = rVar != null ? rVar.b : str3;
        this.c = rVar != null ? rVar.c : str3;
        this.j = rVar != null ? rVar.b() : 0;
        this.d = str2;
        this.e = str;
    }

    public MUSInstanceConfig.MUSRenderType a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSInstanceConfig.MUSRenderType) ipChange.ipc$dispatch("db2da5c", new Object[]{this}) : this.i;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.j;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.h;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.b;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.c;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        if (this.g) {
            if (this.d == null) {
                return null;
            }
            return this.d + "/prebuild";
        }
        return this.d;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.d;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        if (this.g) {
            if (this.d == null) {
                return null;
            }
            return "prebuild://" + this.d;
        }
        return this.e;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.e;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        try {
            this.e = Uri.parse(str).buildUpon().clearQuery().build().toString();
        } catch (Throwable unused) {
            com.taobao.android.weex_framework.util.g.c(MUSAppMonitor.LOG_TAG);
            this.e = str;
        }
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.f;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : c.VERSION_NAME_VALUE;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        try {
            return m.a(g4.a.f3423a, "alimusVersion");
        } catch (Exception e) {
            com.taobao.android.weex_framework.util.g.a(e);
            return "[ERR_GET]";
        }
    }

    public String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this}) : this.f16073a;
    }

    public JSONObject o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("83cd0896", new Object[]{this}) : c(false);
    }

    public JSONObject c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("85fd07ca", new Object[]{this, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        String e = e();
        String f = f();
        String h = z ? h() : g();
        String j = z ? j() : i();
        String k = k();
        String p = p();
        String l = l();
        String m = m();
        if (!TextUtils.isEmpty(e)) {
            jSONObject.put("bundle_url", (Object) e);
        }
        if (f != null) {
            jSONObject.put("page_name", (Object) f);
        }
        if (h != null) {
            jSONObject.put(MUSAppMonitor.T_ITEM_TYPE, (Object) h);
        }
        if (!TextUtils.isEmpty(j)) {
            jSONObject.put(MUSAppMonitor.SCRIPT_URL, (Object) j);
        }
        if (k != null) {
            jSONObject.put(MUSAppMonitor.BYTECODE, (Object) k);
        }
        if (!TextUtils.isEmpty(p)) {
            jSONObject.put("sversion", (Object) p);
        }
        if (l != null) {
            jSONObject.put(MUSAppMonitor.MUISE_SDK_VERSION, (Object) l);
        }
        if (m != null) {
            jSONObject.put(MUSAppMonitor.ALIMUISE_SDK_VERSION, (Object) m);
        }
        return jSONObject;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this});
        }
        try {
            return m.a("app", "serverVersion");
        } catch (Exception e) {
            com.taobao.android.weex_framework.util.g.a(e);
            return "[ERR_GET]";
        }
    }
}
