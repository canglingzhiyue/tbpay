package com.taobao.android.ultron.datamodel.imp;

import android.util.Base64;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.io.UnsupportedEncodingException;
import java.util.List;
import tb.irx;
import tb.jnr;
import tb.jnx;
import tb.joe;
import tb.jqg;
import tb.jqi;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f15774a;
    private f b = new f();
    private joe c = new k();
    private e d = new e();
    private jnx e = new jnx();
    private JSONObject f;

    static {
        kge.a(255831014);
    }

    public c(boolean z) {
        this.f15774a = true;
        this.f15774a = z;
    }

    public void a(jnr jnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb98c6a", new Object[]{this, jnrVar});
        } else {
            this.b.a(jnrVar);
        }
    }

    public void a(joe joeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc1bb18", new Object[]{this, joeVar});
        } else if (joeVar == null) {
        } else {
            this.c = joeVar;
        }
    }

    public boolean a(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0def882", new Object[]{this, bVar, jSONObject})).booleanValue();
        }
        this.f = jSONObject;
        return this.b.a(bVar, jSONObject);
    }

    public List<IDMComponent> a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f6f358cb", new Object[]{this, bVar, str}) : this.b.a(bVar, str);
    }

    public IDMComponent a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("acb1e46c", new Object[]{this}) : this.b.b();
    }

    public String a(b bVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d963e6fe", new Object[]{this, bVar, iDMComponent});
        }
        JSONObject a2 = this.c.a(bVar, iDMComponent);
        if (this.f15774a) {
            if (jqi.a(bVar.h(), "ultronGZipCompressWithBytes", false)) {
                return a(JSONObject.toJSONBytes(a2, SerializeConfig.globalInstance, new SerializerFeature[0]));
            }
            return a(JSONObject.toJSONString(a2));
        }
        return JSONObject.toJSONString(a2);
    }

    public String a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19838e2e", new Object[]{this, bVar});
        }
        String jSONString = JSONObject.toJSONString(this.c.a(bVar));
        return this.f15774a ? a(jSONString) : jSONString;
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            return a(str.getBytes("utf-8"));
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    private static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        byte[] a2 = irx.a(bArr);
        if (a2 == null) {
            return "";
        }
        try {
            return Base64.encodeToString(a2, 0);
        } catch (Exception e) {
            jqg.a("zipCompressError", e.getMessage());
            return "";
        }
    }

    public void a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.b.a(list);
        }
    }

    public jnx b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jnx) ipChange.ipc$dispatch("16b82549", new Object[]{this}) : this.e;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b.a(z);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.b.b(z);
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.b.c(z);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b.a();
    }

    public void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49644291", new Object[]{this, bVar});
        } else {
            this.b.a(bVar);
        }
    }

    public DMComponent a(b bVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DMComponent) ipChange.ipc$dispatch("3201be40", new Object[]{this, bVar, jSONObject, str}) : this.b.a(bVar, jSONObject, str);
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.f;
    }
}
